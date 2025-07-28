package java_program;

public class Smallnofind {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,9,5,6,8,7};
		int b=a[0];
		for (int i=1;i<a.length;i++) {
			if(b<a[i]) {
				b=a[i];
			}
		}
      System.out.println(b);
	}

}
