public abstract class Test3 {

	public void Shape(String id) {
		this.id = id;
	}

	// This abstract method must be defined in a concrete subclass.
	// Note that it is called in this class in the toString method.
	public abstract double getArea();

	public String getId() {
		return id;
	}

	public String toString() {
		return "Shape[id=" + id + ",area=" + getArea() + "]";
	}

	private String id;
}