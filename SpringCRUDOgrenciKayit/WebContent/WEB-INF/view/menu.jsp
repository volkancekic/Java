<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menü</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

<ul class="menu_ul">
  <li class="menu_li"><a class="active" href="menu">Anasayfa</a></li>  
  <li class="menu_li"><a href="list">Ögrenci Listesi</a></li>
  <li class="menu_li"><a href="kurslist">Kurs Listesi</a></li>
  <li class="menu_li"><a href="employeeslist">Employees Listesi</a></li>
  <li class="menu_li" style="float:right"><a href="logout">Çıkış Yap</a></li>
</ul>

<img src="${pageContext.request.contextPath}/resources/images/mp.png" style="margin-left:40%;margin-top:15%;" alt="Main Page Logo" width="10%" height="10%"/>
</body>
</html>