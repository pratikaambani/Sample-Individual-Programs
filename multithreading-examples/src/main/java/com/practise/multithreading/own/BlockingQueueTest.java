package thread.own;

public class BlockingQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlockingQueue MyBlockingQueue = new BlockingQueue(5);
		Thread tp = new Thread(new producer(MyBlockingQueue), "producer");
		Thread tc = new Thread(new consumer(MyBlockingQueue), "Consumer");
		tc.start();
		tp.start();

		System.out.println("Main thread is compeleted.......");

	}

}

class producer implements Runnable {

	BlockingQueue MyBlockingQueue;

	public producer(BlockingQueue bq) {
		this.MyBlockingQueue = bq;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			MyBlockingQueue.enqueue(i);
			System.out.println(Thread.currentThread().getName()
					+ " Element in Queue :" + i);
		}
	}
}

class consumer implements Runnable {

	BlockingQueue MyBlockingQueue;

	public consumer(BlockingQueue bq) {
		this.MyBlockingQueue = bq;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ " Element in Queue :" + MyBlockingQueue.dequeue());
		}
	}
}