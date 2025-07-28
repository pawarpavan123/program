package java_program;

import java.util.*;

public class reverseNO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");

		int num = sc.nextInt(); 

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reverse number is : " + rev);

	}

}
