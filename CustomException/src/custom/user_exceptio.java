package custom;

class Invalid_pin extends Exception{

	public Invalid_pin() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("invalid pin");
	}
}
public class user_exceptio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Invalid_pin ();
			
		}
		catch (Invalid_pin a) {
			System.out.println(a);
		}
	}
}
