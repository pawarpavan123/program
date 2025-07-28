package java_program;
import java.util.*;
public class palindrome_no {
	public static void main (String []args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter the value");
	String s=obj.next();
		//String s="nitin";
		String t="";
		
		for (int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
		if (s.equals(t)) {
			System.out.println("is palindrome number");
		}
		else {
			System.out.println("is not palindrome number");
		}
	}

}
