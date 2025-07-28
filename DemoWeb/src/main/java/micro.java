

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

/**
 * Servlet implementation class micro
 */
@WebServlet("/micro")
public class micro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public micro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		

		String s = request.getParameter("Name");
		String t = request.getParameter("Email");
		String r = request.getParameter("Mobile_No");
		String i = request.getParameter("Address");
		String n = request.getParameter("pin");
		String g = request.getParameter("City");
		//System.out.println(s);
		PrintWriter pw = response.getWriter();
		pw.println(s );
		pw.println(t);
		pw.println(r);
		pw.println(i);
		pw.println(n);
		pw.println(g);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is load");
			Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar", "root", "pawar@123");
			System.out.println("Connection is established");
			PreparedStatement pt = C.prepareStatement(
			"insert into hr_manager (Name,Email,Mobile_No,Address,pin,City)values(?,?,?,?,?,?)");
//pt.setString(1, S);
			pt.setString(1, s);
			pt.setString(2, t);
			pt.setString(3, r);
			pt.setString(4, i);
			pt.setString(5, n);
			pt.setString(6, g);
//System.out.println("Connection");
			pt.executeUpdate();
//System.out.println("is established");
			pt.close();
			C.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	


	}

}
