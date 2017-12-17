package com.sample.practise.oopsconcepts.encapsulation;

public class EncapsulationEx {

	public static void main(String args[]) {
		EncapBean encap = new EncapBean();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");

		System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge()+ " and idNum: " +encap.getIdNum());
	}
}