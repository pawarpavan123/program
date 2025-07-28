package Reverce;

import java.util.Scanner;
import java.util.*;

public class reverce_Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("enter the name ");
		String a1 = obj.nextLine();
		String reverse = "";
		for (int i = a1.length() - 1; i >= 0; i--) {
			reverse = reverse + a1.charAt(i);
		}
		System.out.print(reverse);
	}}                       
//                 String a="pavan";
//                  String a1="";
//                  for (int i=a.length()-1;i>=0;i--) {
//	              a1=a1+a.charAt(i);
//                  }
//                  System.out.println(a1);
