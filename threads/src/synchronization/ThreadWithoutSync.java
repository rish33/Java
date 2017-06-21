package synchronization;

public class ThreadWithoutSync {

	void print(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread1 extends Thread {
	ThreadWithoutSync t;

	MyThread1(ThreadWithoutSync t) {
		this.t = t;
	}

	public void run() {
		t.print(5);
	}

}

class MyThread2 extends Thread {
	ThreadWithoutSync t;

	MyThread2(ThreadWithoutSync t) {
		this.t = t;
	}

	public void run() {
		t.print(100);
	}
}

class ThreadWithoutSynch {
	public static void main(String args[]) {
		ThreadWithoutSync obj = new ThreadWithoutSync();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
