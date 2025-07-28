 package polymorphism;

public class overloading {
  void compile_time(String a, String b ) {
	  System.out.println("name    :- "+a);
	  System.out.println("address :- "+b);
  }
  void compile_time(int c, long d,String h) {
	  this.compile_time("pavan", "pawar");
 
	  System.out.println("Id      :- "+c);
	  System.out.println("number  :- "+d);
      System.out.println("state   :- "+h);
  }
  void compile_time(String e) {
	  System.out.println("country :- "+e);
  }
  void compile_time(double s) {
	  this.compile_time(1,35556l,"omkar");
	  System.out.println("package :- "+s);
  }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading obj =new overloading();
		obj.compile_time(689.0);
	
	}
   
}
