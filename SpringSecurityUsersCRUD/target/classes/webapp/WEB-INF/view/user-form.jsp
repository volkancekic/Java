<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User form</title>

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

	
			<h2>User Formu</h2>
			<br/>
			<frm:form action="${pageContext.request.contextPath}/users/userkaydet" modelAttribute="users" method="post">			
			<table>
			<tr>
			<td><label>Username:</label></td>
			<td><frm:input path="userName"/></td>
			</tr>
			<tr>
			<td><label>Password:</label></td>
			<td><frm:input path="password"/></td>
			</tr>
			<tr>
			<td><label>Enabled:</label></td>
			<td>
			<frm:radiobutton path="enabled" value="0"/> <b>0</b> &nbsp;&nbsp;
			<frm:radiobutton  path="enabled" value="1"/> <b>1</b>
			</td>
			</tr>
			<tr>
			<td>Authority:</td>
			<td>
			<frm:checkbox path="roles.role" value="ROLE_ADMIN"/> ADMIN&nbsp;
			<frm:checkbox path="roles.role" value="ROLE_PERSONEL"/> PERSONEL			
			</td>
			</tr>
			<tr>
			<td></td>
			<td>
			<frm:button value="save" name="save">Kaydet</frm:button></td>
			</tr>
			</table>
			</frm:form>
	
<br/>
<a href="${pageContext.request.contextPath}/users/userlist">User List</a>

</body>
</html>