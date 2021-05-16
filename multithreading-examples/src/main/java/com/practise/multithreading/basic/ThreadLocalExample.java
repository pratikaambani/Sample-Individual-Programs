package thread.basic;

/**
 * Simple example of ThreadLocal class.Here we create thread per person object.
 * 
 * @author Pratik
 * 
 */
public class ThreadLocalExample {

	public static void main(String[] args) {

		ProcessPerson run = new ProcessPerson();

		Thread t1 = new Thread(run, "t1");
		Thread t2 = new Thread(run, "t2");
		t1.start();
		t2.start();
	}
}

/**
 * Person class
 * 
 * @author Pratik
 */
class Person {

	String name;
	String action;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "PersonTwo [name=" + name + ", action=" + action + "]";
	}

}

class ProcessPerson implements Runnable {

	/**
	 * Override initialValue method so that it returns Thread per person object.
	 */
	private final static ThreadLocal<Person> store = new ThreadLocal<Person>() {
		@Override
		protected Person initialValue() {
			System.out.println("Thread " + Thread.currentThread().getName()
					+ " initialValue()");
			return new Person();
		}
	};

	@Override
	public void run() {

		System.out.println("Thread " + Thread.currentThread().getName()
				+ ": Entered into run()");
		Person p = store.get();
		if (Thread.currentThread().getName().equals("t1")) {
			p.setName("name1");
			p.setAction("action1");

		} else {
			p.setName("name2");
			p.setAction("action2");

		}

		System.out.println("Thread " + Thread.currentThread().getName()
				+ ": set PersonTwo() Obj store");
		PerThreadPerson.displayObjDetail(store);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class PerThreadPerson {
	static void displayObjDetail(ThreadLocal<Person> store) {
		Person obj = store.get();
		System.out.println("Thread " + Thread.currentThread().getName()
				+ ": obj.getName() " + obj.getName());
		System.out.println("Thread " + Thread.currentThread().getName()
				+ ": obj.getAction() " + obj.getAction());
	}

}