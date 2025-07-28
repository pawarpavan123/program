package Java8;

@FunctionalInterface
interface i {
	int m();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		i obj = () -> {
			return 100;
		};

		System.out.println(obj.m());
	}

}
