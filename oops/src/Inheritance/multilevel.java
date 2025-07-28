package Inheritance;
//import java.util.Scanner;
class desing{
	public void show() {
		System.out.println("india is my country");
	}
}
public class multilevel extends desing{
	public void show1() {
		System.out.println("i proud to be a indian");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        multilevel obj = new multilevel();
        obj.show();
        obj.show1();
	}
}
