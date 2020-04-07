<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
personel name: ${sahis.firstname}<br/><br/>
personel lastname:${sahis.lastname}<br/><br/>
personel department:${sahis.department}<br/><br/>
personel gender:${sahis.gender}<br/><br/>
personel salary:${sahis.salary}<br/><br/>
personel postalcode:${sahis.postalCode}<br/><br/>

personel side benefits:
<ul>
<c:forEach items="${sahis.sideBenefits}" var="rec">
	<li>${rec}</li>
</c:forEach>
</ul>
<br/><br/>
</body>
</html>


<!-- taglib eklendi checkbox sonucunu yazdırabilmek için -->