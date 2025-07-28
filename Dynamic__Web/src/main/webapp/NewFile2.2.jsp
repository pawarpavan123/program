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
String n=request.getParameter("boy");
String m=request.getParameter("girl");
try{
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver is load");
Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
System.out.println("Connection is established");
String st="insert into banjara (boy,girl)values(?,?)";
PreparedStatement s=C.prepareStatement(st);
s.setString(1, n);
s.setString(2, m);
s.executeUpdate();
s.close();
C.close();
}
catch (Exception e){
	e.printStackTrace();
}
%>
</body>
</html>