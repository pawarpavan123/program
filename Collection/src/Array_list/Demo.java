
package Array_list;
//import java.util.ArrayList;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList<>();

		a1.add("pawar");
		a1.add("pavan");
		a1.add("hello java");
		a1.add(221);
		a1.remove(1);
		a1.contains("pawar");
		a1.isEmpty();

		// System.out.println(a1);

		// System.out.println(a1.add("aaa"));
		// System.out.println(a1);
		// System.out.println(a1.contains(221));
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
