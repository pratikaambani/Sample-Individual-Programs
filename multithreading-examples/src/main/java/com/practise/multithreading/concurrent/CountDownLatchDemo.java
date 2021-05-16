package thread.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch is useful if you want to start main processing thread once its
 * dependency threads are completed
 * 
 * @author Pratik Ambani
 * 
 */
public class CountDownLatchDemo {

	public static void main(String[] args) {
		final CountDownLatch latch = new CountDownLatch(3);
		Thread authService = new Thread(new service("Auth", 100, latch));
		Thread authrizationService = new Thread(new service("authrization",
				100, latch));
		Thread accountingService = new Thread(new service("accounting", 100,
				latch));
		authService.start();
		authrizationService.start();
		accountingService.start();
		// application should not start processing any thread until all service
		// is up and ready to do there job.Countdown latch is idle choice
		// here, main thread will start with count 3 and wait until count
		// reaches zero.
		// each thread once up and read will do a count down.
		// this will ensure that main thread is not started processing until all
		// services is up.

		// count is 3 since we have 3 Threads (Services)

		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All services up.");
	}
}

class service implements Runnable {

	private String serviceName;
	private int timeToStart;
	private CountDownLatch latch;

	public service(String serviceName, int timeToStart, CountDownLatch latch) {
		this.serviceName = serviceName;
		this.timeToStart = timeToStart;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(timeToStart);
		} catch (InterruptedException ex) {
			System.err.println("Error occured during starting " + serviceName);
		}
		System.out.println(serviceName + " is Up");
		latch.countDown(); // reduce count of CountDownLatch by 1
	}

}