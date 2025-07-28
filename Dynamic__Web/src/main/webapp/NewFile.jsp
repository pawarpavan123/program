<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import ="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name =request.getParameter("username");
String Name =request.getParameter("password");
String nav =request.getParameter("number");

try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawar","root","pawar@123");
PreparedStatement ps=C.prepareStatement("insert into demo(username,password,number)values(?,?,?)");
ps.setString(1,name);
ps.setString(2,Name);                    
ps.setString(3,nav);
ps.execute();
ps.close();
C.close();

}
catch(Exception e){
	e.printStackTrace();
}

%>



</body>
</html>