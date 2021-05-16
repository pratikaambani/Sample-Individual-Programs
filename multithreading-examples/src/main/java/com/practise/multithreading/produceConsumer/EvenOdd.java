package thread.produceConsumer;

/*
 * Following program print odd-even number using two thread
 * First thread print odd number and second thread print even number
 * 
 * @author: Pratik Ambani
 * @since: 26 April 2015
 *
 */

public class EvenOdd {

	public static void main(String[] args) {

		EvenOddPrinter printer = new EvenOddPrinter();
		Thread even = new Thread(new PrintTask(printer, 10, true));
		Thread odd = new Thread(new PrintTask(printer, 10, false));
		even.setName("Even Thread");
		odd.setName("Odd Thread");
		even.start();
		odd.start();
	}

}

/**
 * Worker which is responsible printing number.
 * 
 * @author Pratik
 * 
 */
class PrintTask implements Runnable {

	int max = 0;
	boolean isEven = false;
	EvenOddPrinter p = null;
	// Here num is shared variable which incremented by both thread
	// simultaneously
	int num = 0;

	public PrintTask(EvenOddPrinter p, int max, boolean isEven) {
		this.p = p;
		this.max = max;
		this.isEven = isEven;
	}

	@Override
	public void run() {
		num = (isEven) ? 2 : 1;
		while (num <= max) {
			if (isEven) {
				p.printEven(num);
			} else {
				p.printOdd(num);
			}
			num += 2;
		}
	}
}

class EvenOddPrinter {
	boolean isOdd = false;

	public synchronized void printEven(int number) {

		while (!this.isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even Number : " + number);
		this.isOdd = false;
		notify();
	}

	public synchronized void printOdd(int number) {

		while (this.isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd Number : " + number);
		this.isOdd = true;
		notify();
	}
}