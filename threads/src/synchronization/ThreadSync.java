package synchronization;

class ThreadWithSync {

	synchronized void print(int n) {// method not synchronized
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

class MyThread_1 extends Thread {
	ThreadWithSync t;

	MyThread_1(ThreadWithSync t) {
		this.t = t;
	}

	public void run() {
		t.print(5);
	}

}

class MyThread_2 extends Thread {
	ThreadWithSync t;

	MyThread_2(ThreadWithSync t) {
		this.t = t;
	}

	public void run() {
		t.print(100);
	}
}

public class ThreadSync {
	public static void main(String args[]) {

		ThreadWithSync obj = new ThreadWithSync();// only one object
		MyThread_1 t1 = new MyThread_1(obj);
		MyThread_2 t2 = new MyThread_2(obj);
		t1.start();
		t2.start();
	}
}
