package try_catch;

public class type2 {
	void a1(){
	try {
		//int a []= {1,2,3,4,5,6,7,8,9};
		//System.out.println(a[22]);
		int a=99;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	catch (ArithmeticException e) {
		System.out.println("Arithmatic Exception occurs" );
		}
		
	catch (ArrayIndexOutOfBoundsException f) {
			System.out.println("arry index out of bounds Exception accours");
			
			
	}
	
	catch (Exception h) {
		System.out.println("parent Excetion occurs");
	}
	}
	public static void main (String []args) {
		type2 obj = new type2();
		obj.a1();
	}
	
	}

