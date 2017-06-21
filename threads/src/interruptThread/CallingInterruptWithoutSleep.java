package interruptThread;

class TestInterruptingThread extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String args[]) {
		TestInterruptingThread t1 = new TestInterruptingThread();
		t1.start();

		t1.interrupt();

	}
}
