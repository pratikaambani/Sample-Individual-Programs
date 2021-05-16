package thread.produceConsumer;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * printing odd - even number using two thread for synchronization purpose we
 * use atomic boolaen
 * 
 * @author Pratik Ambani
 * 
 */
public class OddEvenPrintUsingAtomicBoolean {

	public static void main(String[] args) {
		final print p = new print();

		Thread oddThread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					p.oddPrint();
				}
			}
		}, "Odd");
		oddThread.start();
		Thread evenThread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					p.evenPrint();
				}
			}
		}, "Even");
		evenThread.start();

	}

}

class print {
	int num = 1;
	AtomicBoolean flag = new AtomicBoolean(false);

	public void evenPrint() {
		while (!flag.get()) {

		}
		System.out.println(Thread.currentThread().getName() + " : " + num);
		num++;
		flag.set(false);
	}

	public void oddPrint() {
		while (flag.get()) {

		}
		System.out.println(Thread.currentThread().getName() + " : " + num);
		num++; 
		flag.set(true);
	}
}