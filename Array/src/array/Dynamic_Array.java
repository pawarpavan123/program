package array;
import java.util.Scanner;				//dynamic array
public class Dynamic_Array {
	public static void main (String []args) {
		int size ,i;
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter size of array");
		size=a1.nextInt();
		int a[]= new int [size];
		for (i=0;i<size;i++) {
			a[i]=a1.nextInt();
		}
		System.out.println("Printed Array Elements");
			for (i=0;i<size;i++) {
				System.out.println(a[i]+" ");
			}
	}

}
