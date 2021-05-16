package thread.basic;

public class StaticDeadLockDemo {

	public static final Object o = new Object();
	static {
		Thread t = new Thread(new Mythread());
		t.start();
		try {
			// Main thread is waiting until thread t is finish the
			// initialization
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Inside a main mathed");
	}

	static private class Mythread implements Runnable {

		@Override
		public void run() {
			System.out.println("Inside a Run method");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// at this point thread t wait to complete static block and main
			// thread which led to static deadlock
			System.err.println(o.getClass());
		}

	}
}
