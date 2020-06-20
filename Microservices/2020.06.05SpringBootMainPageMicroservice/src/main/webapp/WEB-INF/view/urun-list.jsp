<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>URUNLER</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2 class="mt-2">Anasayfa</h2>
              
 
   <div class="row col-md-12 mt-3 mb-5">
    <c:forEach items="${urunler}" var="urun">
    
    <c:url var="detaylink" value="/urundetay/${urun.id}" />
				
	
    
    <div class="col-md-4 border border-primary text-center">   
    <a href="<c:out value="${detaylink}"/>"><img src="${pageContext.request.contextPath}/images/${urun.resimAdi}.jpg" class="img-rounded mt-2" alt="${urun.resimAdi}" width="200" height="180"></a><br/>                 
 		<a href="<c:out value="${detaylink}"/>"><b>${urun.urunAdi}</b></a>
 	</div>
     </c:forEach>
      
 </div>
 
</div>
</body>
</html>