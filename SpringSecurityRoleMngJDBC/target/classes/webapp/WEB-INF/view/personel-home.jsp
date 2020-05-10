<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>personel home</title>
</head>
<body>
<hr style="border: 1px solid blue;">

Kullanıcı: <sec:authentication property="principal.username"/> ,
Role: <sec:authentication property="principal.authorities"/>

<hr style="border: 1px solid blue;">

<br/><br/>
<a href="${pageContext.request.contextPath}">Welcome Page</a>

 

<h2>personel-home page</h2>


	
</body>
</html>