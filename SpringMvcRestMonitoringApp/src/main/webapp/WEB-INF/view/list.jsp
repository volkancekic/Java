<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOG LIST</title>
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
		<c:choose>
		<c:when test="${mesaj!=null}">	
				<p style="background-color: #4CAF50;padding:10px;color:white;text-align:center;font-size:18px;">${mesaj}</p>
		</c:when>						 					 
	</c:choose>	
		
	<table>
	<thead>
			<tr>
				<th>Tarih</th>	
				<th>App1</th>
				<th>App2</th>
				<th>App3</th>				
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${veriler}" var="veri">
						
				<tr>
					<td>${veri.tarih}</td>
					<td>${veri.app1}</td>
					<td>${veri.app2}</td>
					<td>${veri.app3}</td>					
				</tr>
			</c:forEach>			
		</tbody>		
	</table>
	<br/>
<a href="${pageContext.request.contextPath}/form">Anasayfa</a>


<script>
var sure='${saniye}';
var milisaniye='${saniye}'*1000;
var myVar = setInterval(refreshPageWithLink, milisaniye);
function refreshPageWithLink() {
  location.replace("http://localhost:8081/2020.05.27SpringMvcRestMonitoringApp/logList?sure="+sure);
}
</script>	

</body>
</html>