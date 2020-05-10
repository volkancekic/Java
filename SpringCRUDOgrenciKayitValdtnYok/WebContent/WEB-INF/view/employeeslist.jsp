<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Employees Listesi</h2>
			<br/>
		</div>
	</div>
	
	<table>
		<thead><tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Hire Date</th>
			<th>Job</th>
			<th>Salary</th>
			<th>Commission Pct</th>
			<th>Manager</th>
			<th>Department</th>			
			<th>İşlem</th>
			
			
		</tr></thead>	
		<tbody>
		<c:forEach items="${employees}" var="emp">
		<c:url var="updatelink" value="/employeesguncelle">
			<c:param name="employeesid" value="${emp.id}"/>
			</c:url>			
			<c:url var="deletelink" value="/employeessil">
			<c:param name="employeesid" value="${emp.id}"/>
			</c:url>
			<tr>
	<td>${emp.id}</td>
	<td>${emp.firstName}</td>
	<td>${emp.lastName}</td>
	<td>${emp.email}</td>
	<td>${emp.phoneNumber}</td>
	<td>${emp.date}</td>
	<td>${emp.job.title}</td>
	<td>${emp.salary}</td>
	<td>${emp.commissionPct}</td>
	<td>${emp.manager.firstName} ${emp.manager.lastName}</td>
	<td>${emp.department.name}</td>
	<td><button class="update-button" onclick="window.location.href='${updatelink}'">Güncelle</button>
		<button class="delete-button" onclick="if (confirm('Kayıt Silinecek, Emin misin?')) window.location.href='${deletelink}'">Sil</button>
	</td>
	
	
			</tr>
			</c:forEach>
		</tbody>
	</table><br/>
	<button class="add-button" onclick="window.location.href='employeesekle'">Employees Ekle</button>
</body>
</html>