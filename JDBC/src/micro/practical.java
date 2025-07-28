package micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

import com.mysql.cj.xdevapi.Statement;

public class practical {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver ids load");
			
			Connection o= DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
			System.out.println("connection is established");
			
			PreparedStatement p=o.prepareStatement("insert into ray values('pavan','pawar@123')");
			p.executeUpdate();
			p.close();
			o.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
}
