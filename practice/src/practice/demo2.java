package practice;

import java.util.*;

public class demo2 {
	public static void main(String[] args) {

		int num,  count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value");
		num = s.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0)
			System.out.println("\nIt is a Prime Number.");
		else
			System.out.println("\nIt is not a Prime Number.");
	}
}
