package practice;

import java.util.*;

public class Dupli {

	public static void main(String[] args) {

		int a=10, b=20;
		
		System.out.println("before swaping no: A = "+a+" B = "+b);
//		int t=a;//t 10
//		a=b;    //a 20
//		b=t;    //b 10
//		
//		a=a+b; // 30
//		b=a-b;
//		a=a-b;
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		
		b=a+b-(a=b);
		
		
		System.out.println("after swaping no: A = "+a+" B = "+b);
	}
}
//List <Integer> l=new ArrayList();
//l.add(566);
//l.add(796);
//l.add(24556);
//System.out.println(l);
//l.remove(1);
//Iterator<Integer> ol=l.listIterator();
//while(ol.hasNext()) {
//	System.out.println(ol.next());
//}
