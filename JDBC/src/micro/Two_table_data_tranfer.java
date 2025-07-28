package micro;
import java.sql.*;
import java.util.Scanner;
public class Two_table_data_tranfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner u= new Scanner (System.in);
			
			System.out.println("enter the name :- ");
			String r=u.next();
			
			System.out.println("enter the number :- ");
			long I=u.nextLong();
			
			System.out.println("enter no:-");
			int i=u.nextInt();
			
			System.out.println("Enter user name:-");
			String s=u.next();
			
			System.out.println("enter the password:-");
			int n=u.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load the Driver");
			
Connection obj= DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
			System.out.println("Connection established successfully");
			
			String S = "insert into micro (name,number)values (?,?)";
			
			String T = "insert into ibm (no,username,password)values (?,?,?)";
			
			PreparedStatement ps=obj.prepareStatement(S);
			
			PreparedStatement p=obj.prepareStatement(T);
			ps.setString(1,r);
			ps.setLong(2,I);
			p.setInt(1, i);
			p.setString(2, s);
			p.setInt(3, n);
			ps.executeUpdate();
			p.executeUpdate();
			ps.close();
			p.close();
			obj.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
