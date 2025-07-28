package java_program;

import java.util.*;

public class Compare_two_no_if_else {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("first values");
		int a = obj.nextInt();
		System.out.println("second value");
		int b = obj.nextInt();

//		int num1 = 400;
//		int num2 = 40;

		if (a > b) {
			System.out.println(a + " = is ghreater than =  " + b);
		} else if (a < b) {
			System.out.println(a + " = is less than = " + b);
		} else {
			System.out.println(a + " = equal to = " + b);
		}

	}
}

//   int a=120;
//   int b=140;
//
//   if (a>b) {
//	System.out.println(a+" grater than "+b);
// }
//   else if (a<b){
//	System.out.println(a+" less than "+b);
// }
//   else {
//	System.out.println(a+" values is equls"+b);
// }
