package threadSleep;

public class RunningSameThreadTwice extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		RunningSameThreadTwice thread1 = new RunningSameThreadTwice();
		thread1.start();
		thread1.start(); // Illlegal thread state exception will occur
	}
}
