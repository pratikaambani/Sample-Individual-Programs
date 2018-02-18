package com.practise.doubts;

class getid_mthd {
	public static void main(String[] onfire) {
		System.out.println("main...");
		Thread r1 = new Thread("r1");
		Thread r2 = new Thread("r2");
		Thread r3 = new Thread("r3");

		long i1, i2, i3;
		i1 = r1.getId();
		i2 = r2.getId();
		i3 = r3.getId();
		long[] ids = { i1, i2, i3 };
		for (Long x : ids)
			System.out.print(x + " ");

	}// main

}