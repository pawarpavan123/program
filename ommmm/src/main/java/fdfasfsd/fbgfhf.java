package fdfasfsd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class fbgfhf
 */
@WebServlet("/pawar")
public class fbgfhf extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public fbgfhf() {
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
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is load ");
			
			Connection s=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
			System.out.println("Connection is established");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		response.setContentType("text/html");
		String S=request.getParameter("name");
		String T=request.getParameter("password");
		
		PrintWriter pw=response.getWriter();
		pw.println("name"+S);
		pw.println("password"+T);
		
		HttpSession obj= request.getSession();
		obj.setAttribute("name", S);
		obj.setAttribute("password", T);
		
		pw.println("<a href='demo'> click here for session data </a>");
		pw.close();
	}

}