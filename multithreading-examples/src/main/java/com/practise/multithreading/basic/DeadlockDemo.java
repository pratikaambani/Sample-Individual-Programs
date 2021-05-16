package thread.basic;

/**
 * Simple deadlock demo program. Here Thread 1 is holding lock 1 and waiting for
 * lock 2, while thread 2 is holding lock 2 and waiting for lock 1.
 * 
 * @author Pratik
 * 
 */
public class DeadlockDemo {
	public static Object l1 = new Object();
	public static Object l2 = new Object();

	public static void main(String[] a) {
		// Object l1 and l2 are shared between thread t1 and thread t2
		Thread t1 = new Thread(new Thread1(l1, l2), "Thread 1");
		Thread t2 = new Thread(new Thread2(l1, l2), "Thread 2");
		t1.start();
		t2.start();
	}

}

class Thread1 implements Runnable {
	private Object l1;
	private Object l2;

	public Thread1(Object l1, Object l2) {
		this.l1 = l1;
		this.l2 = l2;

	}

	@Override
	public void run() {
		synchronized (l1) {
			System.out.println(Thread.currentThread().getName()
					+ " : Holding lock 1.");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName()
					+ "  Waiting for lock 2...");
			synchronized (l2) {
				System.out.println("Thread 2: Holding lock 1 & 2...");
			}
		}
	}

}

class Thread2 implements Runnable {
	private Object l1;
	private Object l2;

	public Thread2(Object l1, Object l2) {
		this.l1 = l1;
		this.l2 = l2;

	}

	@Override
	public void run() {
		synchronized (l2) {
			System.out.println(Thread.currentThread().getName()
					+ " Holding lock 2...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName()
					+ " Waiting for lock 1...");
			synchronized (l1) {
				System.out.println("Thread 1: Holding lock 1 & 2...");
			}
		}
	}

}