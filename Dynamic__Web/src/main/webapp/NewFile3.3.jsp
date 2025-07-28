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
String s=request.getParameter("employee");
String t=request.getParameter("company");
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
	String S="insert into engineer (employee,company)values(?,?)";
	PreparedStatement ps=C.prepareStatement(S);
	ps.setString(1, s);
	ps.setString(2, t);
	ps.execute();
	ps.close();
	C.close();
}
catch (Exception e){
	e.printStackTrace();
}
%>

</body>
</html>