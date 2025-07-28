package AlphabetPattern;
import java.util.*;
public class Alphabet {
	public static void main (String []args) {
		// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				System.out.println("Input: ");
				int size = sc.nextInt();
				int alpha = 65;

				// printing pattern
				
				for (int i = 0; i < size; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print((char) (alpha + j));
					}
					System.out.println();
				}

	}

}
