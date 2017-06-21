package threadSleep;

public class ThreadSleepMethod extends Thread {
	public void run() {
		int x = 5;
		while (x != 0) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(x);
			x--;
		}
	}

	public static void main(String[] args) {
		ThreadSleepMethod thread = new ThreadSleepMethod();
		thread.start();
	}

}
