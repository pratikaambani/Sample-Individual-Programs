public  class Prm {
	public  static void main(String args[]) {

		System.out.println("fact of 6 = " + fact(10));
	}

	public  static int fact(int a) {
		for (int b = a; b > 1; b--) {
			a = a * (b - 1);
		}
		return a;
	}

}
