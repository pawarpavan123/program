package practice;


public class demo {

	static String getVal() {
		try {
			
			return "code";
			
		} catch (Exception e) {
			
			return "exception";

		} finally {
			
			return "codeverse";
		}

	}
	public static void main(String[] args) {
		System.out.println(demo.getVal());

	}
}
