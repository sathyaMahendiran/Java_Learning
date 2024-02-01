package JavaPackage;

public class MultiRunnable implements Runnable {
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			MultiRunnable m1=new MultiRunnable();  
			Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
			t1.start();  
		 }  


}
