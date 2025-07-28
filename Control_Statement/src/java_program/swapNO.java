package java_program;

public class swapNO {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("before swaping no A="+a+" B="+b);
//		int t=a;
//		a=b;
//		b=a;
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
	
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		b=a+b-(a=b);
		
		System.out.println("after swaping no A = "+a+" B = "+b);
		
	}

}
