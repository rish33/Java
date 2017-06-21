package threadExecution;

public class ThreadByRunnableInterface implements Runnable{
	 public void run(){
   	  System.out.println("thread is running here also");
     }
	 
     public static void main(String[] args) {
   	  ThreadByRunnableInterface th=new ThreadByRunnableInterface();
   	  Thread t=new Thread(th);
   	  t.start();
	}
}
