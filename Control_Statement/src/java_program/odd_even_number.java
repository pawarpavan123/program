package java_program;

public class odd_even_number {

	public static void main(String[] args) {

		int a = 50;
		for (int i = 1; i <= a; i++) {

			if (i % 2 == 0) {

				System.out.println("Even = " + i);
				// System.out.println(" ");
			} else {
				System.out.println("odd  = " + i);
			}

		}
	}

}
