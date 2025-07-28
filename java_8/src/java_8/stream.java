package java_8;

import java.util.*;
import java.util.stream.Collectors;

public class stream {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println(a);

		for (int a1 : a) {
			if (a1 % 2 == 0) {
				System.out.println(" " + a1);
			}
		}
		List<Integer> s1 = new ArrayList<>();

		s1 = a.stream().filter(v -> v % 2 == 0).collect(Collectors.toList());
		System.out.println("\nColectors : ");
		System.out.println(s1);

		a.stream().filter(v -> v % 2 == 0).forEach(System.out::println);
	}

}
