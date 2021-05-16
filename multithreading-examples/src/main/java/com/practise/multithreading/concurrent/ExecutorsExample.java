package thread.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			// Submit can return future object
			service.submit(new Task(i));
			// Execute dont return anything
			//service.execute(new Task(i));
		}
		System.err.println(Runtime.getRuntime().availableProcessors());
	
	}

}

class Task implements Runnable {

	private int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("Task ID : " + this.taskId + " performed by "
				+ Thread.currentThread().getName());

	}
}
