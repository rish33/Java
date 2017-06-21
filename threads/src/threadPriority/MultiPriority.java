package threadPriority;

public class MultiPriority extends Thread {
	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

	}

	public static void main(String args[]) {
		MultiPriority m1 = new MultiPriority();
		MultiPriority m2 = new MultiPriority();
		MultiPriority m3 = new MultiPriority();
		m1.setPriority(Thread.MIN_PRIORITY);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.setPriority(Thread.MAX_PRIORITY);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m3.setPriority(Thread.NORM_PRIORITY);
		m1.start();
		m2.start();
		m3.start();

	}
}
