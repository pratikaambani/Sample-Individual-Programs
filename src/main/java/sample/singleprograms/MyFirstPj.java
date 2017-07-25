
public class MyFirstPj {
	private String name;

	public static void main(String[] args) {
		for (String arg : args) {
			MyFirst pojo = new MyFirst(arg); // Here's how you create a POJO
			System.out.println(pojo);
		}
	}

	public MyFirstPj(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.name;
	}
}