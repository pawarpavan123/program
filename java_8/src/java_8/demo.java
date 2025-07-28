package java_8;

interface demo1 {

	void a1();

	void a2();

}

public class demo implements demo1 {
	public static void main(String[] args) {
		demo obj = new demo();
		obj.a1();
		obj.a2();

	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void a2() {
		// TODO Auto-generated method stub

	}
}