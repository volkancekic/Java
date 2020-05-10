<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kurs Formu</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

</head>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Kurs Formu</h2>
			<br/>
			<frm:form action="kurskaydet" modelAttribute="kurs" method="post">
			<frm:hidden path="id"/>
			<table>
			<tr>
			<td><label>Kurs Adı:</label></td>
			<td><frm:input path="kursAdi"/></td>
			</tr>
			<tr>
			<td><label>Saat:</label></td>
			<td><frm:input path="saat"/></td>
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