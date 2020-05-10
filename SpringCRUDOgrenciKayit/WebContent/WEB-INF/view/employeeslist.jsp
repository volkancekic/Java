<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
	<ul class="menu_ul">
  <li class="menu_li"><a class="active" href="menu">Anasayfa</a></li>  
  <li class="menu_li"><a href="list">Ogrenci Listesi</a></li>
  <li class="menu_li"><a href="kurslist">Kurs Listesi</a></li>
  <li class="menu_li"><a href="employeeslist">Employees Listesi</a></li>
    <li class="menu_li" style="float:right"><a href="logout">Çıkış Yap</a></li>
</ul>
	<h3 style="color:red">${message}</h3>
	<div id="wrapper">
		<div id="header">
			<h2>Employees Listesi</h2>
			<br/>
		</div>
	</div>
	
	<table>
		<thead>
		
		<frm:form action="employeesSearch" modelAttribute="empsearch" method="post">
			<tr>
			<td style="padding:2px;"><frm:input path="id" style="border: 2px solid #ffb600;width:50px;"/></td>			
			<td><frm:input path="firstName" style="border: 2px solid #ffb600;width:95px;"/></td>
			<td style="padding:2px;"><frm:input path="lastName" style="border: 2px solid #ffb600;width:90px;"/></td>
			<td style="padding:2px;"><frm:input path="email" style="border: 2px solid #ffb600;width:95px;"/></td>			
			<td style="padding:2px;"><frm:input path="phoneNumber" style="border: 2px solid #ffb600;width:100px;"/></td>
			<td style="padding:2px;"></td>
			<td style="padding:2px;"></td>			
			<td style="padding:2px;"><frm:input path="salary" style="border: 2px solid #ffb600;width:70px;"/></td>
			<td style="padding:2px;"><frm:input path="commissionPct" style="border: 2px solid #ffb600;width:70px;"/></td>
			<td style="padding:2px;"></td>
			<td style="padding:2px;"></td>			
			<td><frm:button style="border: 1px solid #666;border-radius: 5px;padding:4px;font-size: 12px;
			font-weight:bold;width: 70px;background:#ffb600;">Ara</frm:button></td>
			</tr>			
	</frm:form>
		
		<tr>
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