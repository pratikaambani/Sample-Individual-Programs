package thread.basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Deadlock prevention using lock interface.
 * 
 * @author Pratik
 * 
 */
public class DeadLockPreventionByTimeOut {

	final static Lock lock1 = new ReentrantLock();
	final static Lock lock2 = new ReentrantLock();

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable1(), "Thread A");
		t1.start();

		Thread t2 = new Thread(new Runnable2(), "Thread B");
		t2.start();

	}

}

class Runnable1 implements Runnable {

	@Override
	public void run() {
		boolean done = false;
		while (!done) {
			// At this point thread1 try to get lock1 until thread2 release lock
			if (DeadLockPreventionByTimeOut.lock1.tryLock()) {

				try {
					System.out.println(Thread.currentThread().getName()
							+ ": Got lockObject1. Trying for lockObject2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// At this point thread1 try to get lock2 until thread2
					// release lock

					if (DeadLockPreventionByTimeOut.lock2.tryLock()) {
						try {
							System.out.println(Thread.currentThread().getName()
									+ ": Got lockObject2.");
							done = true;
						} finally {
							// Thread1 releasing lock2
							DeadLockPreventionByTimeOut.lock2.unlock();
						}

					}

				} finally {
					// Thread1 releasing lock1
					DeadLockPreventionByTimeOut.lock1.unlock();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class Runnable2 implements Runnable {

	public void run() {

		boolean done = false;
		while (!done) {
			// At this point thread2 try to get lock2 until thread1 release lock
			if (DeadLockPreventionByTimeOut.lock2.tryLock()) {
				try {
					System.out.println(Thread.currentThread().getName()
							+ ": Got lockObject1. Trying for lockObject2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// At this point thread2 try to get lock1 until thread1
					// release lock
					if (DeadLockPreventionByTimeOut.lock1.tryLock()) {
						try {
							System.out.println(Thread.currentThread().getName()
									+ ": Got lockObject2.");
							done = true;
						} finally {
							DeadLockPreventionByTimeOut.lock1.unlock();
						}
					}
				} finally {
					DeadLockPreventionByTimeOut.lock2.unlock();
					try {
						Thread.sleep(750);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
