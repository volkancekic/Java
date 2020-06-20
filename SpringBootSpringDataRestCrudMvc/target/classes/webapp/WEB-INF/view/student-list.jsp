<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT LIST</title>
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
		<br/>		
		<form method="POST" action="kriteruygula">
		<table>		
	<tr style="background-color:#ffff00;border:2pt solid #1e90ff;">
	<td>
	<label>Gosterilen Kayit Sayisi :</label>
	<select name="kayitsayisi" id="kayitsayisi">
		  <option value="10">10</option>
		  <option value="20">20</option>
		  <option value="30">30</option>
		  <option value="50">50</option>
		  <option value="100">100</option>
		  <option value="150">150</option>
		  <option value="200">200</option>
	</select>
	</td>
	<td>
	<label>Sıralama Kriteri :</label>
	<select name="siralamakriteri" id="siralamakriteri">		
		  <option value="id">Id</option>
		  <option value="firstName">Ad</option>
		  <option value="lastName">Soyad</option>
		  <option value="email">Email</option>
		  <option value="birthDate">Dogum Tarihi</option>		 
	</select>
	</td>
	<td>
	<label>Sıralama Sekli :</label>
	<select name="siralamasekli" id="siralamasekli">	 	
		  <option value="asc">Artan Sırada (A-Z / 0-9)</option>
		  <option value="desc">Azalan Sırada (Z-A / 9-0)</option>				 
	</select>
	</td>
	<td>		
		<input type="submit" style="background-color:#2196F3;color:white;border-color:#2196F3;padding:2px 4px;" value="Uygula"/>
	</td>
	</tr>	
	</table>
	</form>
	
		<br/>
		
	<table>
	<thead>
			<tr>
				<th>Id</th>
				<th>Ad</th>
				<th>Soyad</th>	
				<th>Email</th>			
				<th>Doğum Tarih</th>				
				<th>İşlem</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${ogrenciler}" var="ogr">
			<c:url var="deletelink" value="/deletestudent">
			<c:param name="ogrenciId" value="${ogr.id}"/>
			<c:param name="link" value="${sayfalink.self}"/>
			</c:url>
			<c:url var="updateLink" value="/getstudent">
			<c:param name="ogrenciId" value="${ogr.id}"/>
			<c:param name="link" value="${sayfalink.self}"/>
			</c:url>			
				<tr>
					<td>${ogr.id}</td>
					<td>${ogr.firstName}</td>
					<td>${ogr.lastName}</td>
					<td>${ogr.email}</td>
					<td>${ogr.birthDate}</td>									
					<td>
					<button style="background-color:#2196F3;color:white;border-color:#2196F3;padding:2px 4px;" onclick="window.location.href='${updateLink}'">Güncelle</button>
					<button style="background-color:#ff3030;color:white;border-color:#ff3030;padding:2px 18px;" onclick="if (confirm('Kayıt Silinecek, Emin misin?')) window.location.href='${deletelink}'">Sil</button>
	
					</td>
				</tr>
			</c:forEach>			
		</tbody>		
	</table>
	<br/>
	<table>
	<tr style="background-color:#ffff00;border:2pt solid #1e90ff;">
	<c:choose>
		<c:when test="${sayfalink.first!=null}">
			<c:url var="firstlink" value="/pageButtonLink">
				<c:param name="link" value="${sayfalink.first}"/>
			</c:url>
		<td style="width:20%;">
			<button style="
    border: 2px solid black;
  background-color: dodgerblue;
  color: black;
  padding: 8px 12px;
  font-size: 12px;border-radius:4px;
  cursor: pointer; border-color: #2196F3;
  color: white" onclick="window.location.href='${firstlink}'"><b><</b> First</button>
 		</td>
 		 </c:when>						 					 
	</c:choose>
		<c:choose>
		<c:when test="${sayfalink.prev!=null}">
		<c:url var="prevlink" value="/pageButtonLink">
				<c:param name="link" value="${sayfalink.prev}"/>
			</c:url>
		<td>
			<button style="
    border: 2px solid black;
  background-color: orange;
  color: black;
  padding: 8px 12px;
  font-size: 12px;border-radius:4px;
  cursor: pointer; border-color: #ff9800;
  color: white;" onclick="window.location.href='${prevlink}'"><b><<</b> Prev</button>
 		</td>
 		 </c:when>						 					 
	</c:choose>	
		<c:choose>
		<c:when test="${sayfalink.next!=null}">
		<c:url var="nextlink" value="/pageButtonLink">
				<c:param name="link" value="${sayfalink.next}"/>
			</c:url>
		<td>
			<button style="
    border: 2px solid black;
  background-color: orange;
  color: black;
  padding: 8px 12px;
  font-size: 12px;border-radius:4px;
  cursor: pointer; border-color: #ff9800;
  color: white;" onclick="window.location.href='${nextlink}'">Next <b>>></b></button>
 		</td>
 		 </c:when>						 					 
	</c:choose>	
			<c:choose>
		<c:when test="${sayfalink.last!=null}">
		<c:url var="lastlink" value="/pageButtonLink">
				<c:param name="link" value="${sayfalink.last}"/>
			</c:url>
		<td>
			<button style="
    border: 2px solid black;
  background-color: dodgerblue;
  color: black;
  padding: 8px 12px;
  font-size: 12px; border-radius:4px;
  cursor: pointer; border-color: #2196F3;
  color: white" onclick="window.location.href='${lastlink}'">Last <b>></b></button>
 		</td>
 		 </c:when>						 					 
	</c:choose>	
			<c:url var="addstdnt" value="/addstudent">
				<c:param name="link" value="${sayfalink.self}"/>
			</c:url>
			<td><button style="
    border: 2px solid black;
  background-color: green;
  color: black;
  padding: 8px 12px;
  font-size: 12px;border-radius:4px;
  cursor: pointer; border-color: #4CAF50;
  color: white;" onclick="window.location.href='${addstdnt}'">Student Ekle</button>
			</td>
			</tr>
			
			<tr style="background-color:white;">
			<td><br/></td>
			</tr>
			
			<tr>
			<td>
			<p>Bulundugunuz Sayfa: ${sayfalink.pageNumber+1}</p>
			</td>
			<td>
			<p>Gosterilen Kayit Sayisi: ${sayfalink.pageSize}</p>
			</td>						
			<td>
			<p>Toplam Sayfa: ${sayfalink.totalPages}</p>
			</td>
			<td>
			<p>Toplam Kayit: ${sayfalink.totalElements}</p>
			</td>
			</tr>
	</table>
	
</body>
</html>