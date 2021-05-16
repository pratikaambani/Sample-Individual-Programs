package thread.lock;

/**
 * Lock Implementation using wait and notify
 * 
 * @author Pratik
 * 
 */
public class OwnLock {
	private boolean isLocked = false;

	/**
	 * 
	 */
	public synchronized void lock() {
		while (isLocked) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		isLocked = true;
	}

	/**
	 * 
	 */
	public synchronized void unlock() {
		isLocked = false;
		notifyAll();
	}
}
