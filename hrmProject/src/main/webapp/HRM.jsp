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
String UserName=request.getParameter("Name");
String EmailID=request.getParameter("Email");
String Mobile_Number=request.getParameter("Mobile_No");
String Add=request.getParameter("Address");
String pincode=request.getParameter("pin");
String CT=request.getParameter("City");
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver is load");
	Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
	System.out.println("Connection is established");
	PreparedStatement pt=C.prepareStatement("insert into hr_manager (Name,Email,Mobile_No,Address,pin,City) values(?,?,?,?,?,?)");
//pt.setString(1, S);
pt.setString(1, UserName);
pt.setString(2, EmailID);
pt.setString(3, Mobile_Number);
pt.setString(4, Add);
pt.setString(5, pincode);
pt.setString(6, CT);
pt.executeUpdate();
pt.close();
C.close();
}
catch (Exception e){
	e.printStackTrace();
}
%>
</body>
</html>