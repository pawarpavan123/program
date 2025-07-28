import java.sql.*;

public class Demo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is load");

			Connection o =DriverManager.getConnection("jdbc.mysql://localhost:3306/pawar", 
					"root", "pawar@123");
			System.out.println("connection is established");

			String a1 = "create table show (name varchar(40),password varchar (40),"
					+ "id varchar (23))";

			PreparedStatement a = o.prepareStatement(a1);
			a.executeUpdate();
			a.close();
			o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

//		int a;
//		 for (a=12;a<=120;a=a+12) {
//			 System.out.println(a);
//		 }

//		 
//		int i;
//
//		 for (i=2;i<=20;i=i+2) {
//			 System.out.println(i);
//		 }
//		int s;
//		for(s=5;s<=50;s=s+5) {
//			System.out.println(s);
//		}
//		int d;
//		for(d=40;d<=400;d=d+40) {
//			System.out.println(d);
//		}
//		

//		Scanner a=new Scanner (System.in);
//		System.out.println("enter the values");
//		String s=a.next();
//		
//		String d="";
//		for (int i=s.length()-1;i>=0;i--) {
//			d=d+s.charAt(i);
//		}
//		System.out.println(d);
//	

//		create table pawar (id varchar(20),name varchar (40));
//		insert into pawar values (121,'pawar pavan');		
//		update pawar set name='pavan' where name='pawar pavan';		 
//		delete from pawar where id=101 or name='pavan';
//		
//		

//		String a="pavan";
//		int s=a.length();
//		
//		String t="";
//		for (int i=s-1;i>=0;i--) {
//			t=t+a.charAt(i);
//		}
//		System.out.println(t);
//		
	}

}
