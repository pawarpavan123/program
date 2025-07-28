

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

		try {
			
		
		response.setContentType("text/html");
		PrintWriter obj=response.getWriter();
		
		HttpSession S=request.getSession(false);
		
		String name=(String)S.getAttribute("name");
		String email=(String)S.getAttribute("email");
		String no=(String)S.getAttribute("no");
		String add=(String)S.getAttribute("add");
		String pin=(String)S.getAttribute("pin");
		String city=(String)S.getAttribute("city");
		
		obj.print(name);
		obj.print(email);
		obj.print(no);
		obj.print(add);
		obj.print(pin);
		obj.print(city);
		System.out.println(name);
        obj.close();
		}
	catch (Exception e) {
		// TODO: handle exception
		
	System.out.println(e);
	}
}

	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}}
