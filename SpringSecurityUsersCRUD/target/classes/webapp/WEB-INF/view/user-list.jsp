<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
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
<hr style="border: 1px solid blue;">

Kullanıcı: <sec:authentication property="principal.username"/> ,
Role: <sec:authentication property="principal.authorities"/>

<hr style="border: 1px solid blue;">

<br/><br/>

	<table>
	<thead>
			<tr>
				<th>Username</th>
				<th>Password</th>
				<th>Enabled</th>
				<th>Authority</th>
				<th>İşlem</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
			
			<c:url var="updatelink" value="/users/userguncelle">
			<c:param name="userName" value="${user.userName}"/>
			</c:url>			
			<c:url var="deletelink" value="/users/usersil">
			<c:param name="userName" value="${user.userName}"/>
			</c:url>
			
				<tr>
					<td>${user.userName}</td>
					<td>*****</td>
					<td>${user.enabled}</td>
					<td><c:forEach items="${user.roles}" var="role">
							${role},
					</c:forEach></td>
					<td>
					<button class="update-button" onclick="window.location.href='${updatelink}'">Güncelle</button>
					<button class="delete-button" onclick="if (confirm('Kayıt Silinecek, Emin misin?')) window.location.href='${deletelink}'">Sil</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br/>
	<button onclick="window.location.href='${pageContext.request.contextPath}/users/userekle'">User Ekle</button>
	
	<br/><br/>
	<a href="${pageContext.request.contextPath}">Welcome Page</a>
</body>
</html>