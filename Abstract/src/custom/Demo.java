package custom;

abstract class a1 {
	abstract void run();
}
public class Demo extends a1 {
	void run() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo o = new Demo();
		o.run();
	}
}
