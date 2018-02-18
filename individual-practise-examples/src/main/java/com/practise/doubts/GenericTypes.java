package com.practise.doubts;

class Room<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class GenericTypes {
	public static void main(String[] args) {
		Room<Integer> room = new Room<Integer>();
		room.add(60);
		room.add(160);

		Integer i = room.get();
		System.out.println(i);
	}
}