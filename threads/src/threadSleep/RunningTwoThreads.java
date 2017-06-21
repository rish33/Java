package threadSleep;

public class RunningTwoThreads extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		RunningTwoThreads thread1 = new RunningTwoThreads();
		RunningTwoThreads thread2 = new RunningTwoThreads();

		thread1.run();
		thread2.run();

		/*
		 * t1.start(); t2.start();
		 */
		// both threads give the impression of running simultaneously
	}
}
