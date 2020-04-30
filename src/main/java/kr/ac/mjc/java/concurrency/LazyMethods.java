package kr.ac.mjc.java.concurrency;

public class LazyMethods {
	
	public static void printNumbers(final int offset, final int count,
			final int millis) {
		for (int i = offset; i < offset + count; i++) {
			System.out.format("%s : %d\n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		printNumbers(0, 5, 1000);
	}

}
