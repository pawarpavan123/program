package star_pattern;

public class Triangle {

	public static void main(String[] args) {
		
		int i,j,k;
		for (i=1;i<=14;i++) {
			for (j=5;j>=i;j--) {
				System.out.print("");
			}
			for (k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		
	}
	}



