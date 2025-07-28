package Java8;

import java.util.Arrays;
import java.util.List;

public class StreamMapDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 7, 10, 5, 6, 2, 8, 9, 4);
		list.stream().sorted().forEach(System.out::print);

		List<String> sl = Arrays.asList("red", "rip", "white", "green");
		//sl.stream().filter(v -> v.startsWith("r") && v.length() == 3 && v.endsWith("d")).forEach(System.out::println);

		
		
//		list.stream().map(v -> v * 2).forEach(System.out::println);

	}
}
