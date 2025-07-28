package try_catch;

import javax.crypto.ExemptionMechanismException;

public class pawar {
	void Add() {
		try {
			int[]a = {1,2,3,4,5,6,7,8,9,0};
			System.out.println(a[8]);
		}
		catch(Exception v) {
			System.out.println(v);
		}}
		void a1 () {
			try {
				int [] s = {0,1,2,3,4,5,6,7,8,9};
				System.out.println(s[4]);
			}
			catch (Exception c) {
				System.out.println(c);
			}
		 try {
				int a= 20;
				int b = 10;
				int c = a/b;
				System.out.println(c);
				 }
				 catch(ArithmeticException v) {
					 System.out.println(v);
				 }
				 catch(Exception g )
				 {
				System.out.println(g);
				
				 }
				catch (ExceptionInInitializerError h) {
					System.out.println(h);
				}
		 catch(ExemptionMechanismException j) {
			 
		 }
			
		 finally {
			 System.out.println("please visit again");
		 }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pawar o = new pawar ();
		try {
			o.Add();
			o.a1();
		}
		catch (Exception q) {
			System.out.println(q);
		}
	}
}
		
		
		