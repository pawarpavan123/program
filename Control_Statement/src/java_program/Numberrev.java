package java_program;

public class Numberrev {

	public static void main(String[] args) {
		int a= 1234;
		int rev=0;
		int o;
		while(a!=0) {
			o=a%10;
			rev=rev*10+o;
			a=a/10;
		}
		System.out.println(rev);
	}

}
