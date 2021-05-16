package thread.produceConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Producer consumer problem using blocking Queue API.
 * 
 * @author Pratik
 * 
 */
public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<Object> sharedQueue = new ArrayBlockingQueue<Object>(5);
		Thread producer = new Thread(new ProducerBlocking(sharedQueue),
				"Producer");
		Thread consumer = new Thread(new ConsumerBlocking(sharedQueue),
				"Consumer");
		producer.start();
		consumer.start();
	}
}

class ProducerBlocking implements Runnable {
	BlockingQueue<Object> sharedQueue;

	public ProducerBlocking(BlockingQueue<Object> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " Producing "
					+ i);
			try {
				// put method wait if queue is full.
				sharedQueue.put(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ConsumerBlocking implements Runnable {

	BlockingQueue<Object> sharedQueue;

	public ConsumerBlocking(BlockingQueue<Object> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				// Take method wait if queue is empty.
				System.out.println(Thread.currentThread().getName()
						+ " Consuming " + sharedQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}