package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

//		Without Stream API
		for (int i : list) {
			if (i % 2 == 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println();
//		 With the Stream

		List<Integer> obj = list.stream().filter(v -> v % 2 == 0 && v >= 4 && v <= 6).collect(Collectors.toList());

		System.out.println(obj);
//
//		System.out.println();
//
//		list.stream().filter(n -> n % 2 == 0).forEach(v -> System.out.print(" " + v));
	}
}
