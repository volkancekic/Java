<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kurs Formu</title>
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
			<h2>Kurs Formu</h2>
			<br/>
			<frm:form action="kurskaydet" modelAttribute="kurs" method="post">
			<frm:hidden path="id"/>
			<table>
			<tr>
			<td><label>Kurs Adı:</label></td>
			<td><frm:input path="kursAdi"/>&nbsp;&nbsp;<frm:errors class="error" path="kursAdi"/><br/></td>
			</tr>
			<tr>
			<td><label>Saat:</label></td>
			<td><frm:input path="saat"/>&nbsp;&nbsp;<frm:errors class="error" path="saat"/><br/></td>
			</tr>
			<tr>
			<td><label>Öğretmen:</label></td>
			<td><frm:select path="ogretmen.id">
			<frm:options items="${ogretmenlerList}"></frm:options>
			</frm:select></td>
			</tr>
			<tr>
			<td></td>
			<td>
			<frm:button class="save-button" value="save" name="save">Kaydet</frm:button>
			</td>
			</tr>
			</table>
			</frm:form>
		</div>
	</div>


</body>
</html>