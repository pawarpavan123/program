package Reverce;
import java.util.*;
public class Demo {
	public static void main (String[]args) {
		
		Scanner S= new Scanner (System.in);
		System.out.println("enter the value");
		
       String a=S.nextLine();
       
       String t="";
       for (int i=a.length()-1;i>=0;i--) {
    	   t=t+a.charAt(i);
       }
       System.out.println(t);
	}	
}

//String 	Name = "pawar";
//int a=Name.length();
//
//String rev=" ";
//for(int i=a-1;i>=0;i--) {
//	rev=rev+Name.charAt(i);
//}
//System.out.println(rev);
//	}}

