package com.sample.singleprograms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public  class breakContinue {

	public  static void main(String[] args) {
		final Logger log = LoggerFactory.getLogger(breakContinue.class);

		System.out.println("starting loop:");

		log.info("SOP inserted.");

		for (int n = 0; n < 7; ++n) {
			System.out.println("in loop: " + n);
			if (n == 2) {
				continue;
			}
			System.out.println("   survived first guard");
			if (n == 4) {
				break;
			}
			System.out.println("   survived second guard");
			// continue at head of loop
		}
		// break out of loop
		System.out.println("exit via break as soon as comes to 4");
	}

}
