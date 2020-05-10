<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
<h2>welcome </h2>

<frm:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Çıkış Yap">
	</frm:form>
	
</body>
</html>