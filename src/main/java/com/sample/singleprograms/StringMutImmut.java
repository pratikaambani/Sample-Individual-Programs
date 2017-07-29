
public  class StringMutImmut {

	public  static void main(String[] args) {

		String name = "Pratik ";
		name.concat("Aniruddh");
		System.out.println("Name is - " + name);

		name = name.concat("Ambani");

		System.out.println(" Immutable Full Name is - " + name);

	}

}
