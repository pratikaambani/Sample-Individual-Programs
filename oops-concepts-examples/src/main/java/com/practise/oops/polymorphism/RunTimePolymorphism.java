package com.practise.oops.polymorphism;

public class RunTimePolymorphism {
	public static void main(String args[]) {

		// Normal Polymorphism
		Food f1 = new Mango();
		f1.eat();

		Food f2 = new Chickoo(); 
		f2.eat();

		System.out.println();


		Bhukhkhad bhukhkhad = new Bhukhkhad();

		Food fFood = new Food();
		Food fMango = new Mango();
		Food fChickoo = new Chickoo();

		bhukhkhad.pachaao(fFood);
		bhukhkhad.pachaao(fMango);
		bhukhkhad.pachaao(fChickoo);

	}
}

class Bhukhkhad {

	public void pachaao(Food fx) {
		fx.eat();
	}

}

class Food {

	void eat() {
		System.out.println("This food is very Spicey...");
	}
}

class Chickoo extends Food {

	void eat() {
		System.out.println("These Chickoos are tasty.");
	}
}

class Mango extends Food {
	void eat() {
		System.out.println("These mangoes are tasty.");
	}
}
