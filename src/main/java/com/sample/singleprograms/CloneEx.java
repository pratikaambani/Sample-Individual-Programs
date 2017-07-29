package com.sample.singleprograms;

public  class CloneEx implements Cloneable {
	public  static void main(String arge[]) {

		CloneEx cx = new CloneEx();

		try {

			System.out.println("cx = " + cx + "\n");

			try {
				String h = (String) cx.clone();
				System.out.println("h = " + h + "\n");

				if (cx.equals(h)) {
					System.out.println("equals" + "\n");
				} else {
					System.out.println("doesnt equal" + "\n");
				}

			} catch (ClassCastException e) {
				System.out.println("e = " + e + "\n");
			}

		} catch (CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException = " + e + "\n");
		} finally {
			try {
				Object o;
				o = cx.clone();
				System.out.println("HashCodes, cx = " + cx.hashCode() + " and o = " + o.hashCode() + "\n");
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}

		}

	}
}
