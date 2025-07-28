package prime_number;
import java.util.*;
public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int a=0;
          Scanner obj = new Scanner(System.in);
          
          System.out.println("Enter The Number");
         n=obj.nextInt();
         
         for (int i=1;i<n;i++) {
        	 if (n%i==0) {
        	 
        		 a++;
        	 }}
         
          if (a==0) {
        	  System.out.println("prime no = ");
          } else {
        	  System.out.println("not prime no = ");
	}}}
