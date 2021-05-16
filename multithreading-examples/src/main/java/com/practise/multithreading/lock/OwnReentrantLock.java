package thread.lock;

public class OwnReentrantLock {

	boolean isLocked = false;
	Thread lockedBy = null;
	// we need to count the number of times the lock has been locked by the same
	// thread. Otherwise, a single call to unlock() will unlock the lock, even
	// if the lock has been locked multiple times.
	int lockedCount = 0;

	public synchronized void lock() throws InterruptedException {

		Thread callingThread = Thread.currentThread();
		// spin lock
		while (isLocked && lockedBy != callingThread) {
			wait();
		}
		isLocked = true;
		lockedCount++;
		lockedBy = callingThread;
	}

	public synchronized void unlock() {

		if (Thread.currentThread() == this.lockedBy) {
			lockedCount--;
			if (lockedCount == 0) {
				isLocked = false;
				notify();
			}
		}
	}

}
