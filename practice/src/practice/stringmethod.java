package practice;

public class stringmethod {
//instance variable 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String o="pawar";
		String a="name";
		
		System.out.println(o.charAt(1));
		System.out.println(o.codePointAt(0));
		//System.out.println(o.compareTo(a));
		
		System.out.println(o.endsWith(o));
		System.out.println(o.equals(a));
		
		System.out.println(o.split(a));//this method provide the annotation code
	    System.out.println(o.hashCode());
	
	    System.out.println(o.indent(1)); // provide the space as per no
	
	   System.out.println(o.isBlank());
	   System.out.println(a.isEmpty());
	
	   System.out.println(o.length());
	 
       System.out.println(o.toLowerCase());
	   System.out.println(o.toUpperCase());
	
	   System.out.println(o.intern());
	   System.out.println(a.intern());
	
	   System.out.println(o.toString());
	
	
	}

}
