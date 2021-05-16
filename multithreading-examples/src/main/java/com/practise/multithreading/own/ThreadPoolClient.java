package thread.own;

public class ThreadPoolClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 ThreadPool executor = new ThreadPool(10,5);
	        for (int i = 0; i < 10; i++) {
	            Runnable worker = new MyTask("" + i);
	            try {
					executor.execute(worker);
				} catch (Exception e) {
					e.printStackTrace();
				}
	          }
	        //  executor.stop();
	        System.out.println("Finished all threads");
	        
	     
		
	}

}

class MyTask implements Runnable {

	private String command;
	

	public MyTask(String s) {
		this.command = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+ " Start. Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
	}

	private void processCommand() {
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return this.command;
	}
}
