package array;

public class small_no_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {23,54,54,6,7,42,6,4,2,5,9};
		   int b=a[0];
		   for (int i=1;i<a.length;i++) {
			   if(b>a[i]) {
				   b=a[i];
			   }
		   }
		   System.out.println(b);
	}

}
