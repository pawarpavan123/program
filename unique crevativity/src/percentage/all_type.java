package percentage;
import java.util.Scanner;
public class all_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your value");
		int a= obj.nextInt();
		
		System.out.println("enter the total value");
		int b= obj.nextInt();
				
				float h= (float)a/b;
				float f= h*100;
				
			System.out.println("percentage = "+f);
			
	}

}
