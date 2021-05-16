package thread.basic;

/**
 * Basic Example for Race condition in MultiThreading environments. Here every
 * run output would be different
 * 
 * @author Pratik Ambani
 * 
 */
public class RaceCondtiton {

	public static void main(String[] args) {
		Increment inc = new Increment();
		// two thread increment count variable of shared inc object
		Thread t1 = new Thread(new worker(inc), "Thread 1");
		Thread t2 = new Thread(new worker(inc), "Thread 2");
		t1.start();
		t2.start();
	}

}

class Increment {
	// Shared counter variable between multiple thread
	int counter;

	// to prevent race condition we can make below method as synchronize
	public int getIncrement() {
		// Critical section of code
		return counter++;
	}
}

class worker implements Runnable {
	Increment inc;

	public worker(Increment cnt) {
		inc = cnt;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Value is :" + inc.getIncrement()
					+ " Is incremented by " + Thread.currentThread().getName());
		}
	}

}
