
public class demo {
	public void show() {
		System.out.println("enter the operation");
	
	}
	void show (int a,String b) {
		System.out.println("id = "+a);
		System.out.println("name = "+b);
		System.out.println(" ");
	}
	void show (String a,int b,long d) {
		System.out.println("address = "+a);
		System.out.println("home no = "+b);
		System.out.println(" mobile no = "+d);
	}
	public static void main(String[] args) {
		demo d= new demo();
		d.show();
		d.show(121, "pawar");
		d.show("pune", 102, 8308003861l);
	
	}
}