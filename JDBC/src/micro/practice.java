package micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class practice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver id loaded");
			Connection o= DriverManager.getConnection("jdbc:mysql://localhost:3306/omkar",
					"root","pawar@123");
			System.out.println("connection is established successfully");
			PreparedStatement obj=o.prepareStatement("insert into operation values ('java developer',1232123)");
			obj.execute();
			obj.close();
			o.close();
		}
        catch(Exception e) {
        e.printStackTrace();
        }
	}

}
