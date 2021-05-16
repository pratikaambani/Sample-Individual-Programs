package thread.produceConsumer;


/**
 * Inter Thread Communication between thread threads using Atomic Interger
 * 
 * @author Pratik Ambani
 * 
 */
public class ThreeThreadSyncUsingWaitNotify {

	private static int sharedOutput;
	private static Object object = new Object();
	public static void main(String args[]) {

		Thread ts1 = new Thread(new ThreadTask(0, sharedOutput,object), "Thread 1");
		Thread ts2 = new Thread(new ThreadTask(1, sharedOutput,object), "Thread 2");
		Thread ts3 = new Thread(new ThreadTask(2, sharedOutput,object), "Thread 3");

		ts1.start();
		ts2.start();
		ts3.start();

	}

}

class ThreadTask implements Runnable {

	private final int threadPosition;
	private volatile int sharedOutput;
	private Object object;

	public ThreadTask(int threadPosition, int sharedOutput,Object object) {
		this.threadPosition = threadPosition;
		this.sharedOutput = sharedOutput;
		this.object = object;
	}

	@Override
	public void run() {

		while (sharedOutput < 10) {

			synchronized (object) {

				if (sharedOutput % 3 == this.threadPosition) {

					if (sharedOutput < 10) {
						System.out.println("Printing output for Thread: "
								+ Thread.currentThread().getName() + "  "
								+ sharedOutput++);
										
					}

				}
			}

		}
	}

}
