package polymorphism;

 class run_time {
	
 public void a1(String a, int b,double j) {
	System.out.println("name = "+a);
	System.out.println("id = "+b);
	System.out.println("salary = "+j);
	System.out.println("hiii java");
  }
 }
public class overriding extends run_time{
  public void a1 (String s, int h,double k) {
		//System.out.println("good");
	  
		super.a1("pawar", 101,09.098);
		System.out.println("address = "+s);
		System.out.println("home no = "+h);
		System.out.println("salry = "+k);
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding s1 = new overriding ();
		s1.a1("pune", 102, 100000);
		
	}
}

