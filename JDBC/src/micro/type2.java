package micro;
import java.sql.*;
public class type2 {
	
	public static void main (String []args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is load");
			
			String p= "insert into pawar values (8,'sanket','bond@007')";
			
			Connection obj =DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
		  System.out.println("connection established successfully");
		  
		  Statement S=obj.createStatement();
		  S.execute(p);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
