package logical;

public class type2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("And logical (&&)");
		System.out.println((10>5)&&(12>6)); //true
		System.out.println((10>5)&&(12<6)); //false
		System.out.println((10<5)&&(12<6)); //false
		System.out.println((10<5)&&(12>6)); //false
		
		System.out.println("or logical (||)");
		System.out.println((2<4)||(4>6)); //true
		System.out.println((2>4)||(4<6)); //true
		System.out.println((2>4)||(4>6)); //false
		System.out.println((2<4)||(4<6)); //true
		
		System.out.println("not logical (!)");
		System.out.println(!(10>2)); //false
		System.out.println(!(10<2)); //true
	}

}
