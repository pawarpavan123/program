
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class project
 */
@WebServlet("/p")
public class project extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public project() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//	String name = request.getParameter("n");
//	String pass = request.getParameter("p");
//	String id = request.getParameter("i");

		
//		
//		
//		//System.out.println(s);
//		PrintWriter pw = response.getWriter();
//		pw.println(s );
//		pw.println(t);
//		pw.println(r);
//		pw.println(i);
//		pw.println(n);
//		pw.println(g);
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver is load");
//			Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar", "root", "pawar@123");
//			System.out.println("Connection is established");
//			PreparedStatement pt = C.prepareStatement(
//			"insert into hr_manager (Name,Email,Mobile_No,Address,pin,City)values(?,?,?,?,?,?)");
////pt.setString(1, S);
//			pt.setString(1, s);
//			pt.setString(2, t);
//			pt.setString(3, r);
//			pt.setString(4, i);
//			pt.setString(5, n);
//			pt.setString(6, g);
////System.out.println("Connection");
//			pt.executeUpdate();
////System.out.println("is established");
//			pt.close();
//			C.close();
//		}
//		catch (Exception e) {
//		}}
//	
////	System.out.println(name);
////	PrintWriter pw = response.getWriter();
////	//pw.println("my name is "+ ""name);
////	pw.println(pass);
////	pw.println(id);
////	
//	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String s = request.getParameter("Name");
		String t = request.getParameter("Email");
		String r = request.getParameter("Mobile_No");
		String i = request.getParameter("Address");
		String n = request.getParameter("pin");
		String g = request.getParameter("City");
		
		  try { 
		 Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver is load"); 
		  Connection C =
		  DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root",
		  "pawar@123");
		  System.out.println("Connection is established");
		  
		  PreparedStatement pt = C.prepareStatement(
		  "insert into hr_manager (Name,Email,Mobile_No,Address,pin,City)values(?,?,?,?,?,?)"); ////
		  pt.setString(1, s); 
		  pt.setString(2, t);
		  pt.setString(3, r); 
		  pt.setString(4, i); 
		  pt.setString(5, n); 
		  pt.setString(6, g);
		  System.out.println("Connection");
		  pt.executeUpdate();
		  ////System.out.println("is established");
		  pt.close();
		  C.close(); 
		  } catch(Exception e) { 
		  e.printStackTrace(); 
		  }
		
		  response.setContentType("text/html");
		String S = request.getParameter("Name");
		String T = request.getParameter("Email");
		String R = request.getParameter("Mobile_No");
		String I = request.getParameter("Address");
		String N = request.getParameter("pin");
		String G = request.getParameter("City");
		//System.out.println(s);
		PrintWriter pw = response.getWriter();
		pw.println(s );
		pw.println(t);
		pw.println(r);
		pw.println(i);
		pw.println(n);
		pw.println(g);
		
		HttpSession obj=request.getSession();
		
		obj.setAttribute("name", s);
		obj.setAttribute("email", t);
		obj.setAttribute("no", r);
		obj.setAttribute("add", i);
		obj.setAttribute("pin", n);
		obj.setAttribute("city", g);
		//response.sendRedirect("micro");
		pw.print("<a href='micro'> click here for session data</a>");
		pw.close();
			
	}}
