package multiThread;

class demo1 extends runnable {

	public static void demo() {

		for (int i = 0; i <= 7; i++)
			System.out.println("pawar");
	}

	static void o() {
		System.out.println("hello");
	}

	public void run() {
		demo1.demo();
		demo1.o();
	}
}

public class runnable implements Runnable {

	public void run() {
		for (int i = 0; i <= 4; i++)
			System.out.println("thread task");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		runnable a1 = new runnable();
		Thread a2 = new Thread(a1);
		a2.start();
		demo1 d = new demo1();
		Thread a3 = new Thread(d);
		a3.start();

	}
}