<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kurslar</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
	<ul class="menu_ul">
  <li class="menu_li"><a class="active" href="menu">Anasayfa</a></li>  
  <li class="menu_li"><a href="list">Ogrenci Listesi</a></li>
  <li class="menu_li"><a href="kurslist">Kurs Listesi</a></li>
  <li class="menu_li"><a href="employeeslist">Employees Listesi</a></li>
    <li class="menu_li" style="float:right"><a href="logout">Çıkış Yap</a></li>
</ul><br/>
	<div id="wrapper">
		<div id="header">
			<h2>Kurs Listesi</h2>
			<br/>
		</div>
	</div>
	
	<table>
		<thead>
		
		<frm:form action="kursSearch" modelAttribute="krssearch" method="post">
			<tr>
			<td style="padding:8px;"><frm:input path="id" style="border: 2px solid #ffb600;"/></td>			
			<td style="padding:8px;"><frm:input path="kursAdi" style="border: 2px solid #ffb600;"/></td>
			<td style="padding:8px;"><frm:input path="saat" style="border: 2px solid #ffb600;"/></td>
			<td style="padding:8px;"></td>
			<td><frm:button style="border: 1px solid #666;border-radius: 5px;padding:4px;font-size: 12px;
			font-weight:bold;width: 100px;background:#ffb600;">Ara</frm:button></td>
			</tr>			
	</frm:form>
		
		<tr>
			<th>Id</th>
			<th>Kurs Adı</th>
			<th>Saat</th>
			<th>Ogretmen</th>
			<th>İşlem</th>
		</tr></thead>	
		<tbody>
		<c:forEach items="${kurslar}" var="kurs">
		<c:url var="updatelink" value="/kursguncelle">
		<c:param name="kursid" value="${kurs.id}"></c:param>
		</c:url>
		<c:url var="deletelink" value="/kurssil">
		<c:param name="kursid" value="${kurs.id}"></c:param>
		</c:url>
			<tr>
	<td>${kurs.id}</td>
	<td>${kurs.kursAdi}</td>
	<td>${kurs.saat}</td>
	<td>${kurs.ogretmen.name} ${kurs.ogretmen.lastname}</td>
	<td><button class="update-button" onclick="window.location.href='${updatelink}'" >Güncelle</button>
	<button class="delete-button" onclick="if (confirm('Kayıt Silinecek, Emin misiniz?')) window.location.href='${deletelink}'" >Sil</button>
	</td>
			</tr>
			</c:forEach>
		</tbody>
	</table><br/>
	<button class="add-button" onclick="window.location.href='kursekle'">Kurs Ekle</button>
</body>
</html>