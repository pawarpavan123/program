package Java8;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {

	public static void main(String[] args) {

		List<Emp> list = new ArrayList<>();

		list.add(new Emp(101, "Bond", 10000));
		list.add(new Emp(102, "Jack", 20000));
		list.add(new Emp(103, "Rani", 30000));
		list.add(new Emp(104, "Babdi", 40000));
		list.add(new Emp(105, "pintya", 50000));

//		sal > 20000 

		list.stream().filter(c -> c.sal > 20000).forEach(System.out::println);
		//System.out.println();
        // list.stream().filter(a-> a.eid >100).forEach(System.out::println);
         
           
	}

}
