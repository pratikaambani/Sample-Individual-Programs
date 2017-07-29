package com.sample.PolymorphismEx;

public  class testC {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub

		testC tc = new testC();

		System.out.println("tetstx = " + tc);

		System.out.println("tetstx = " + tc.hashCode());
		System.out.println("tetstx = " + tc.getClass());
		try {
			System.out.println("tetstx = " + tc.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
