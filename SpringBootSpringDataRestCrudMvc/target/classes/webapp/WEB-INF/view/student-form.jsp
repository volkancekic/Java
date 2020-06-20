<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT FORM</title>

<style>
table {
  border-collapse: collapse;
  width: 100%;
}
th, td {
  text-align: center;
  padding: 8px;
}
tr:nth-child(odd){background-color: #FFCC00}
tr:nth-child(even){background-color: #FF6600}
th {
  background-color: #FF0000;
  color: white;
}
</style>
</head>
<body>

	
			<h2>STUDENT FORM</h2>
			<br/>
			<frm:form action="${pageContext.request.contextPath}/saveorupdate" modelAttribute="ogr" method="post">			
			<table>
			<tr>
			<td><label>Id:</label></td>
			<td><frm:input path="id"  readonly="true" /></td>
			</tr>			
			<tr>
			<td><label>Ad:</label></td>
			<td><frm:input path="firstName" required="true" /></td>
			</tr>
			<tr>
			<td><label>Soyad:</label></td>
			<td><frm:input path="lastName" required="true" /></td>
			</tr>
			<tr>
			<td><label>Email:</label></td>
			<td><frm:input path="email" type="email" required="true"/></td>
			</tr>
			<tr>
			<td><label>Dogum Tarihi:</label></td>
			<td><frm:input path="birthDate" type="date" required="true" /></td>
			</tr>						
			<tr>
			<td></td>
			<td>
			<frm:button style="background-color:#2196F3;color:white;border-color:#2196F3;padding:2px 6px;" value="save" name="save">Kaydet</frm:button></td>
			</tr>
			</table>
			</frm:form>
	
<br/>
<c:url var="geridon" value="/listeyedon">
				<c:param name="link" value="${geridonlink}"/>
			</c:url>
			<button style="
    border: 2px solid black;
  background-color: orange;
  color: black;
  padding: 8px 12px;
  font-size: 12px;border-radius:4px;
  cursor: pointer; border-color: #ff9800;
  color: white;" onclick="window.location.href='${geridon}'"> Listeye Dön</button>
 		


</body>
</html>