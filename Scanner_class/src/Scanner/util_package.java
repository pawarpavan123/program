package Scanner;
import java.util.*;
public class util_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		System.out.println(" enter your good name");
		String name = obj.next();
		System.out.println("enter the address");
		String address = obj.next();
		System.out.println("enter your number");
		long number =obj.nextLong();                      //Scannar.util.package       
		System.out.println("enter the ID");
		int ID = obj.nextInt();
		System.out.println("enter the state");
		String state = obj.next();
		System.out.println("enter the country");
		String country = obj.next();
	
		
		System.out.println("name    = "+name);
		System.out.println("addess  = "+address);
		System.out.println("number  = "+number);
		System.out.println("ID      = "+ID);
		System.out.println("stste   = "+state);
	    System.out.println("country = "+country);
		
		
	

}}
