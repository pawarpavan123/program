package micro;

import java.sql.*;

public class Resultset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
	  
	  String s="select * from developer";
	  PreparedStatement ps=obj.prepareStatement(s);
	  ResultSet R= ps.executeQuery();
	  while(R.next()) {
		  System.out.print(R.getInt(1));
		  System.out.print(R.getString(2));
		  System.out.print(R.getString(3));
		  
	  }
	  
  }
  catch (Exception e) {
	  e.printStackTrace();
  }
	}

}
