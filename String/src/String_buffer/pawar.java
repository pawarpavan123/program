package String_buffer;

public class pawar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StringBuilder obj  = new StringBuilder("niranjan");
    //obj.reverse();
    
    System.out.println(obj);
    System.out.println(obj.capacity());
    System.out.println(obj.append("pawar"));
    System.out.println(obj.charAt(1));
    StringBuffer obje = new StringBuffer("pavan");
    StringBuffer a1=new StringBuffer ("pawar");
    //obje.deleteCharAt(2);
    System.out.println(obje);
    System.out.println(obje.append(1));
    System.out.println(obje.equals(null));
    System.out.println(obje.length());
    System.out.println(obj.isEmpty());
    System.out.println(obj.toString());
    System.out.println(obje.reverse());
    System.out.println(a1.reverse());
    
    
	}

}
