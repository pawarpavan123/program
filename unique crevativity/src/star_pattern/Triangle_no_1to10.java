package star_pattern;

public class Triangle_no_1to10 {
	public static void main (String[]args)
	{
		int c = 0;
		int n=Integer.parseInt(args[0]);
			
			loop1: for(int i=1;i<=n;i++) {
				
				loop: for (int j=1;j<=i;j++) {
					
					if (c!=n) {
						c++;
						System.out.println(c+" ");
					}
					
					else 
						break loop1;
					
				}
				System.out.println("\n");
			
			
		}
	}
}
