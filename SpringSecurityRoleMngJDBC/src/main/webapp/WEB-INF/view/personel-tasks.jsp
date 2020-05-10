<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>personel tasks</title>
</head>
<body>
<hr style="border: 1px solid yellow;">

Kullanıcı: <sec:authentication property="principal.username"/> ,
Role: <sec:authentication property="principal.authorities"/>

<hr style="border: 1px solid yellow;">
<br/><br/>

<a href="${pageContext.request.contextPath}">Welcome Page</a>

 

<h2>personel-tasks page</h2>


	
</body>
</html>