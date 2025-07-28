package custom;
import java.util.*;
public class ageException {
	public static void main (String []pavan) {
		
		Scanner age = new Scanner (System.in);
		System.out.println("Enter the value");
		int a=age.nextInt();
		
		if (a>=18) {
			System.out.println("your are adult");
		}
		else {
			System.out.println("you are not adult");
		}
	}
 }
