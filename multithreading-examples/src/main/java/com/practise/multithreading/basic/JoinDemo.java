package thread.basic;

/**
 * Class show the demo for join method in thread
 * 
 * @author Pratik
 * 
 */
public class JoinDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread(new task1(), "Task1");
		Thread t2 = new Thread(new task2(), "Task2");
		Thread t3 = new Thread(new task3(), "Task3");

		try {

			t1.start();
			t1.join();
			// calling join method thread t2 is wait until thread t1 is
			// treminated.
			System.err.println("==========");
			System.err.println("State of T1 :" + t1.getState());
			t2.start();
			t2.join();
			System.err.println("==========");
			System.err.println("State of T2 :" + t1.getState());
			t3.start();
			t3.join();
			System.err.println("==========");
			System.err.println("State of T3 :" + t1.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.err.println("Main Thread Compeleted.");
	}

}

class task1 implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " produce by  :"
						+ Thread.currentThread().getName());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class task2 implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " produce by  :"
						+ Thread.currentThread().getName());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class task3 implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 15; i++) {
				System.out.println(i + " produce by  :"
						+ Thread.currentThread().getName());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}