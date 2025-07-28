package ControlStatement_Decision;

import java.util.Scanner;   //if - statement

public class Simple_if_Statement {
public static void main(String[] args) {
	int age;
	System.out.println("enter your age = ");
	Scanner obj = new Scanner(System.in);
	age=obj.nextInt();
	if(age>=18) {
		System.out.println("eligible for vote....!");
	}
	else {
	System.out.println("can not eligible");
	}
	System.out.println("thank you....!");
}
}
