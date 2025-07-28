<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String s=request.getParameter("Name");
String t=request.getParameter("Email");
String r=request.getParameter("Mobile_No");
String i=request.getParameter("Address");
String n=request.getParameter("pin");
String g=request.getParameter("City");
PrintWriter pw = response.getWriter();
pw.println(s+"<br>");
pw.println(t);
pw.println(r);
pw.println(i);
pw.println(n);
pw.println(g);
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver is load");
	Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
	System.out.println("Connection is established");
	PreparedStatement pt=C.prepareStatement("insert into hr_manager (Name,Email,Mobile_No,Address,pin,City) values(?,?,?,?,?,?)");
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
}
catch (Exception e){
	e.printStackTrace();
}
%>
</body>
</html>