
public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String name = "pawar";
		String address ="pawan";
		String a1 ="pune";
		String a2= "pawar pavan";
		
		String pin = String.join("pawar","pavan","parshuram");
		System.out.println(name.charAt(2));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.equals(address));
		System.out.println(name.indexOf(address));
		System.out.println(name.trim());
		System.out.println(name.compareTo(address));
		System.out.println(name.hashCode());
		//String name =String.join("name",)
		//System.out.println (String.join("name" , "address")) ;
		System.out.println(name.isEmpty());
		System.out.println(name.replaceAll(name,address));
		System.out.println(name.split(name));
		
		char[]Array=name.toCharArray();
		for (char i :Array) {
			
			System.out.println(i);
		}
		String obj=" pavan omkar suraj";
		String [] words=obj.split(" ");
		for(String h : words) {
			System.out.println(h);
			
		}
		System.out.println(name.contains(name));
		System.out.println(name.concat( name));
		System.out.println(name.length());
		System.out.println(name.trim());
		System.out.println(name.compareTo(a1));
		System.out.println(name.equals(obj));
	}
}
