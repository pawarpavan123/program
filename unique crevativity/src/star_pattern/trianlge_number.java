package star_pattern;

public class trianlge_number {
	public static void main (String []args) {
		
		 for (int i=1;i<=4;i++) {
			 for (int j=1;j<=i;j++) {
				 System.out.print(((i+j)%2)+" ");
			 }
			 System.out.println();
		 }
	}

}
