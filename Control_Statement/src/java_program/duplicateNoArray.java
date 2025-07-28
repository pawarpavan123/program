package java_program;
public class duplicateNoArray {

	public static void main(String[] args) {
		System.out.println("duplicate no ");
		
		int arr []= {1,2,3,2,4,5,5,1,6,7,8};
		
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[j]);
				
			}}
		}
	}
}
