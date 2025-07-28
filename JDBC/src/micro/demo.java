package micro;

import java.sql.*;

public class demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is load");

			Connection obj = DriverManager.getConnection("jdbc.mysql://localhost:3306/pawar","root", "pawar@123");
			System.out.println("connection is established");

			PreparedStatement o = obj.prepareStatement(
					"create table dad(Name varchar (40),Email varchar (45),Mobile_No varchar (20),Address varchar (25),pin varchar(20),City varchar (30))");

			o.executeUpdate();
			o.close();
			obj.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
