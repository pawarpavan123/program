package custom;
import java.util.*;
public class ArList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			for (int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
