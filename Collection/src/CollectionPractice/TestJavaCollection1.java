package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Spliterator;

public class TestJavaCollection1 {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("nitin");
		l.add("arjun");
		l.add("nitin");
		l.add(null);
		l.add("nitin");
		l.add(null);
		HashSet<String> s = new HashSet<String>(l);
		for (String a : s) {
			System.out.println(a + ": " + Collections.frequency(l, a));
		}

	}

}
