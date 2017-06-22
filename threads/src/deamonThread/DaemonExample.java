package deamonThread;

public class DaemonExample extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread ");
		} else {
			System.out.println("user thread ");
		}
	}

	public static void main(String[] args) {
		DaemonExample t1 = new DaemonExample();// creating thread
		DaemonExample t2 = new DaemonExample();
		DaemonExample t3 = new DaemonExample();

		t1.setDaemon(true); // now t1 is daemon thread

		t1.start();// starting threads
		// t1.setDaemon(true); setting a thread daemon after its start give CTE
		t2.start();
		t3.start();
	}
}
