package threadJoin;

public class JoinWithTimeParameter extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		JoinWithTimeParameter thread1 = new JoinWithTimeParameter();
		JoinWithTimeParameter thread2 = new JoinWithTimeParameter();
		JoinWithTimeParameter thread3 = new JoinWithTimeParameter();
		thread2.start();
		thread1.start();
		try {
			thread1.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}

		
		thread3.start();
	}
}
