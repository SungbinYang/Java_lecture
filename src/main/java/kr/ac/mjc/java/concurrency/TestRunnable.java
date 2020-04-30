package kr.ac.mjc.java.concurrency;

class TimerRunnable implements Runnable {
	@Override
	public void run() {
		LazyMethods.printNumbers(0, 5, 1000);
	}
}

public class TestRunnable {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Runnable r1 = new TimerRunnable();
		Thread th1 = new Thread(r1);
		th1.start(); // Thread-0

		new Thread(new TimerRunnable()).start(); // Thread-1

		// anonymous class 사용
		new Thread(new Runnable() {
			@Override
			public void run() {
				LazyMethods.printNumbers(100, 5, 500);
			}
		}).start(); // Thread-2

		// Lambda expression 사용
		new Thread(() -> {
			LazyMethods.printNumbers(1000, 5, 2000);
		}).start(); // Thread-3

		System.out.println("main 스레드 끝");
	}
}
