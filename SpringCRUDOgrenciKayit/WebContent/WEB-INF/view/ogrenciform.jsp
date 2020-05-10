<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Öğrenci Formu</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<style>
.error{	color:red;}
</style>
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
			<h2>Öğrenci Formu</h2>
			<br/>
			<frm:form action="ogrencikaydet" modelAttribute="ogrenci" method="post">
			<frm:hidden path="id"/>
			<table>
			<tr>
			<td><label>İsim:</label></td>
			<td><frm:input path="isim"/>&nbsp;&nbsp;<frm:errors class="error" path="isim"/><br/></td>
			</tr>
			<tr>
			<td><label>Soysim:</label></td>
			<td><frm:input path="soyisim"/>&nbsp;&nbsp;<frm:errors class="error" path="soyisim"/><br/></td>
			</tr>
			<tr>
			<td><label>Öğrenci No:</label></td>
			<td><frm:input path="ogrenci_no"/>&nbsp;&nbsp;<frm:errors class="error" path="ogrenci_no"/><br/></td>
			</tr>
			<tr>
			<td></td>
			<td>
			<frm:button class="save-button" value="save" name="save">Kaydet</frm:button></td>
			</tr>
			</table>
			</frm:form>
		</div>
	</div>


</body>
</html>