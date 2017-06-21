package threadExecution;

public class ThreadByExtendingThreadClass extends Thread {
      public void run(){
    	  System.out.println("Thread is running");
      }
      public static void main(String[] args) {
    	  ThreadByExtendingThreadClass thread=new ThreadByExtendingThreadClass();
    	  thread.start();
	}
}

