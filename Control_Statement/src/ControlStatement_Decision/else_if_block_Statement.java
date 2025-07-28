package ControlStatement_Decision;
import java.util.*;
public class else_if_block_Statement {
	
     public static void main(String[] args) {
	
    	 int marks;
    	 System.out.println("enter your marks ");
    	 Scanner ref = new Scanner(System.in);
    	 marks=ref.nextInt();
    	 if(marks>=80) {
    		 System.out.println("Topper");
    	 }
    	 else if(marks<80 && marks>=60){
    		 System.out.println("First");
    	 }
    	 else if(marks<60 && marks >=50) {
    		 System.out.println("meddiam");
    	 }
    	 else {
    		 System.out.println("pass");
    	 }
	}

}
