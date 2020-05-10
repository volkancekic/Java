<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Öğrenciler</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Öğrenci Listesi</h2>
			<br/>
		</div>
	</div>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Isim</th>
				<th>Soyisim</th>
				<th>Ogrenci No</th>
				<th>İşlem</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ogrenciler}" var="ogrenci">
			<c:url var="updatelink" value="/ogrenciguncelle">
			<c:param name="ogrenciid" value="${ogrenci.id}"/>
			</c:url>			
			<c:url var="deletelink" value="/ogrencisil">
			<c:param name="ogrenciid" value="${ogrenci.id}"/>
			</c:url>
				<tr>
					<td>${ogrenci.id}</td>
					<td>${ogrenci.isim}</td>
					<td>${ogrenci.soyisim}</td>
					<td>${ogrenci.ogrenci_no}</td>
					<td>
					<button class="update-button" onclick="window.location.href='${updatelink}'">Güncelle</button>
					<button class="delete-button" onclick="if (confirm('Kayıt Silinecek, Emin misin?')) window.location.href='${deletelink}'">Sil</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<hr/>
<button class="add-button" onclick="window.location.href='ogrenciekle'">Öğrenci Ekle</button>


</body>
</html>