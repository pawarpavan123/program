package micro;
import java.sql.*;
import java.util.*;
public class Driver {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner S = new Scanner (System.in);
      
      System.out.println("Enter the no :- ");
      int no =S.nextInt();
      
      System.out.println("Enter the name :- ");
      String name=S.next();
      System.out.println("Enter the password :- ");
      String password=S.next();
      
		  try {
			  
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("Driver is load");
 Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
		 
 System.out.println("connection established successfully");
 
  String T="insert into ibm (no,username,password)values (?,?,?)";
  PreparedStatement St=obj.prepareStatement(T);
  St.setInt(1, no);
  St.setString(2,name);
  St.setString(3, password);
  St.executeUpdate();      //preapareStament
  St.close();           //prepareStament Close
  obj.close();     //Connection Close
		  }
		  
		  catch (Exception e) {
			  e.printStackTrace();
		  }
	}

}
