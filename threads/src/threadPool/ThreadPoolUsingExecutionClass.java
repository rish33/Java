package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUsingExecutionClass implements Runnable {
	String msg;

	ThreadPoolUsingExecutionClass(String str) {
		this.msg = str;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName()
				+ " (Start) message = " + msg);
		processmessage();//
		System.out.println(Thread.currentThread().getName() + " (End)");// prints
																		// thread
																		// name
	}

	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a
																	// pool of 5
																	// threads
		for (int i = 0; i < 10; i++) {
			Runnable worker = new ThreadPoolUsingExecutionClass("" + i);
			executor.execute(worker);// calling execute method of
										// ExecutorService
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}
