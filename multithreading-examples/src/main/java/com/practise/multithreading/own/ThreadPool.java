package thread.own;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {

	private BlockingQueue taskQueue = null;
	private List<Workers> threads = new ArrayList<Workers>();
	private boolean isStopped = false;

	public ThreadPool(int maxTask, int maxWorker) {
		taskQueue = new BlockingQueue(maxTask);
		for (int i = 0; i < maxWorker; i++) {
			threads.add(new Workers(taskQueue));

		}
		for (Workers worker : threads) {
			worker.start();
		}
	}

	public synchronized void execute(Runnable task) throws Exception {
		if (this.isStopped)
			throw new IllegalStateException("ThreadPool is stopped");
		this.taskQueue.enqueue(task);
	}

	@SuppressWarnings("deprecation")
	public synchronized void stop() {
		this.isStopped = true;
		for (Workers worker : threads) {
			worker.stop();
		}
	}

}

class Workers extends Thread {

	private BlockingQueue taskQueue = null;
	private boolean isStop = false;

	public Workers(BlockingQueue taskQueue) {
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		while (!isStop) {
			Runnable runnable = (Runnable) taskQueue.dequeue();
			runnable.run();
		}
	}

	public synchronized void doStop() {
		isStop = true;
		this.interrupt();
	}

	public synchronized boolean isStop() {
		return isStop;
	}

}