<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
<hr style="border: 1px solid red;">

Kullanıcı: <sec:authentication property="principal.username"/> ,
Role: <sec:authentication property="principal.authorities"/>

<hr style="border: 1px solid red;">
<br/><br/>
Bu linki sadece Admin görebilir =>
<sec:authorize access="hasRole('ADMIN')">
	 <a href="www.google.com">Google Link</a>
</sec:authorize>
 

<h2>welcome page</h2>

<frm:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Çıkış Yap">
	</frm:form>
	
</body>
</html>