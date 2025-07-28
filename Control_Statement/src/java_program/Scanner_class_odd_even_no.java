package java_program;
import java.util.*;
public class Scanner_class_odd_even_no {
	
	public static void main (String []args) {
		int i;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value");
		i=obj.nextInt();
		if (i%2==0) {
			System.out.println("even no = "+i);
		}
		else {
			System.out.println("odd no = "+i);
		}
	}}
	 