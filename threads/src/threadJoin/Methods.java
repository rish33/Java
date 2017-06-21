package threadJoin;

public class Methods extends Thread {
	public void run() {
		System.out.println("running...");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String args[]) {
		Methods thread1 = new Methods();
		Methods thread2 = new Methods();
		System.out.println("Name of thread1:" + thread1.getName());
		System.out.println("Name of thread2:" + thread2.getName());
		System.out.println("id of t1:" + thread1.getId());

		thread1.start();
		thread2.start();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread1.setName("Rishabh");
		System.out.println("After changing name of t1:" + thread1.getName());
	}

}
