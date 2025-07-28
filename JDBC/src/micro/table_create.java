 package micro;
import java.sql.*;
public class table_create {

	public static void main (String []args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is load");
		
	Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
		System.out.println("Connection established successfully");
		Statement s=obj.createStatement();
		s.executeUpdate("create table d(Name varchar (40),Email varchar (45),Mobile_No varchar (20),Address varchar (25),pin varchar(20),City varchar (30))");
		s.close();
		obj.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
            //  SQL operation
//create table pawar (id int(20),name varchar(40),password varchar (40));
//insert into pawar values (12,'pavan','pawar@4577');
//update pawar set name='punekar'where name='pavan';
//delete from pawar where id='password' or id=12;