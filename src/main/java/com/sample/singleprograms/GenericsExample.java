package com.sample.singleprograms;

class Room1<a> {

	private a object;

	public void add(a object) {
		this.object = object;
	}

	public a get() {
		return object;
	}
}

public class GenericsExample {
	public static void main(String[] args) {
		Room1<Integer> room = new Room1<Integer>();
		room.add(60);
		// room.add("60"); //this will cause a run-time error unless casted
		Integer i = (Integer) room.get();

		System.out.println("Random Value = " + (int) (Math.random() * 10));

		System.out.println("Random = " + Math.random());

		System.out.println(i);
	}
}