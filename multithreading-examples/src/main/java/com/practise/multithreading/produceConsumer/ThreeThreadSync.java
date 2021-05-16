package thread.produceConsumer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Inter Thread Communication between thread threads using Atomic Interger
 * 
 * @author Pratik Ambani
 * 
 */
public class ThreeThreadSync {

	private static AtomicInteger sharedOutput = new AtomicInteger(0);

	public static void main(String args[]) {

		Thread ts1 = new Thread(new ThreadTasks(0, sharedOutput), "Thread 1");
		Thread ts2 = new Thread(new ThreadTasks(1, sharedOutput), "Thread 2");
		Thread ts3 = new Thread(new ThreadTasks(2, sharedOutput), "Thread 3");

		ts1.start();
		ts2.start();
		ts3.start();

	}

}

class ThreadTasks implements Runnable {

	private final int threadPosition;
	private AtomicInteger sharedOutput;

	public ThreadTasks(int threadPosition, AtomicInteger sharedOutput) {
		this.threadPosition = threadPosition;
		this.sharedOutput = sharedOutput;
	}

	@Override
	public void run() {

		while (sharedOutput.get() < 10) {

			synchronized (sharedOutput) {

				if (sharedOutput.get() % 3 == this.threadPosition) {

					if (sharedOutput.get() < 10) {
						System.out.println("Printing output for Thread: "
								+ Thread.currentThread().getName() + "  "
								+ sharedOutput.incrementAndGet());
					}

				}
			}

		}
	}

}
