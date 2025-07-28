package java_program;

import java.util.StringTokenizer;

public class convt {

	public static void main(String[] args) {
		
		String name="micro";			//String into Array
		
		
		System.out.println(name.toCharArray());
		String []a1=name.split("");
		
		
		for (String i: a1 ) {
			System.out.println(i);
		}
		StringTokenizer t  = new StringTokenizer(name);
		while (t.hasMoreTokens());
		System.out.println(t.nextToken());
	}
}

