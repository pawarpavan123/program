package star_pattern;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("         Rectrangle");
		//System.out.println(" ");
			 int a = 4;
			 int b = 10;
			//outer loop
		for (int i = 1; i<=a;i++) {
			//inner loop
			for (int j =1;j<=b;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
