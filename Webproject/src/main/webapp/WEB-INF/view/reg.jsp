<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="user">
    <header class="user__header">
        <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/3219/logo.svg" alt="" />
        <h1 class="user__title">A lightweight and simple sign-up form</h1>
    </header>
    
    <form class="form" action="register" method="post">
        <div class="form__group">
            <input type="text" placeholder="Username" class="form__input"  name="username"/>
        </div>
        
        <div class="form__group">
            <input type="email" placeholder="Email" class="form__input"  name="email"/>
        </div>
        
        <div class="form__group">
            <input type="password" placeholder="Password" class="form__input" name="pass"/>
        </div>
        <input class = "abc" type="submit" >
    </form>
</div>
          
</body>
</html>