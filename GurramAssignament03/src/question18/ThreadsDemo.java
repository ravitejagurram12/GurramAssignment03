package question18;



public class ThreadsDemo extends Thread {
	 public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
			 ThreadsDemo t1=new ThreadsDemo();  
		  t1.start();  
		  t1.start();  
		 }  

}
