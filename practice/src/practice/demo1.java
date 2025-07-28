package practice;

class pavan extends Thread{
	public void run() {
		for (int j=1;j<=4;j++) {
		System.out.println("pavan pawar");
	}}
}
class pawar extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println("java developer"+i);
		}
		
	}
}

class demo1{
	
	public static void main(String[] args) {
		pavan o= new pavan();
		o.start();
		pawar v=new pawar();
		v.start();
	}
}