<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOG FORM</title>
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
		
		<br/>		
		<form method="GET" action="logList">
		<table>		
	<tr style="background-color:#ffff00;border:2pt solid #1e90ff;">
	<td>
	<label>Kaç saniyede bir kontrol edilecek ? :</label>
	<input type="number" name="sure" id="sure" min="1" required />
	</td>
	<td>
	</td>
	<td>		
		<input type="submit" style="background-color:#2196F3;color:white;border-color:#2196F3;padding:2px 4px;" value="Uygula"/>
	</td>
	</tr>	
	</table>
	</form>
	
</body>
</html>