package thread.own;

import java.util.LinkedList;
import java.util.List;

/**
 * Basic Idea behind Blocking Queue
 * 
 * @author Pratik Ambani
 * 
 */
public class BlockingQueue {

	private List<Object> queue = new LinkedList<Object>();
	private int maxlimit = 5;

	public BlockingQueue(int size) {
		this.maxlimit = size;
	}
	/**
	 * 
	 * @param obj
	 */
	public synchronized void enqueue(Object obj) {
		if (this.queue.size() == maxlimit) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (this.queue.size() == 0) {
			notifyAll();
		}
		queue.add(obj);
	}
	/**
	 * 
	 * @return
	 */
	public synchronized Object dequeue() {
		if (this.queue.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		if (this.queue.size() == maxlimit) {
			notifyAll();
		}
		return queue.remove(0);
	}
	@Override
	public String toString() {
		return "BlockingQueue [queue=" + queue + "]";
	}
	
}
