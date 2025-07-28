package polymorphism;

  class pawar{
public void Micro(String a,int b,int c) {
	System.out.println("Name = "+a);
	System.out.println("ID = "+b);
	System.out.println("Number = "+c);
	System.out.println("  ");
	}
}
  
 public class  overideType2 extends pawar{
	 public void Micro (String k,int h, int j) {
		 super.Micro("pawar pavan", 110, 22141);
		 System.out.println("address = "+k);
		 System.out.println("home no = "+h);
		 System.out.println("pin = "+j);
		 
	 }
	
	 public static void main(String []args) {
		 
	overideType2 r=new 	overideType2();
    r.Micro("Shankar",1001 , 10010101);
	 }		
	 }