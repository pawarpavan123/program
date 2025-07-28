package multiThread;

 class micro extends Thread {
	 public void run () {
		// Thread.currentThread();
		for (int i = 0; i <= 4;i++) {
			 System.out.println("thread is create");
		 }}
	 
		
 }
 class nitin extends Thread{
	  public void run() {
		  for (int i=0;i<=7;i++) {
		 System.out.println(" i am developer");
	 }}
 }
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    micro obj = new micro ();
    obj.start();
    nitin o=new nitin() ;
    	o.start();
    
	}
   
	}