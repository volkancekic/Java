<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kurslar</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Kurs Listesi</h2>
			<br/>
		</div>
	</div>
	
	<table>
		<thead><tr>
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