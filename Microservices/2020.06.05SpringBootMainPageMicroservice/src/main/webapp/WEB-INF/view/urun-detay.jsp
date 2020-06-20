<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>URUN DETAY</title>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<div class="row mt-3 mb-3">
<a href="${pageContext.request.contextPath}/mainpage" class="btn btn-primary">Anasayfa</a>
</div>
  <div class="row">
 <div class="col-md-2"></div>
 
 <div class="col-md-4">
  <div class="border border-primary text-center">   
        <img src="${pageContext.request.contextPath}/images/${urun.resimAdi}.jpg" class="img-rounded mt-2" alt="${urun.resimAdi}" width="280" height="220">                 
 </div>
 </div>
 <div class="col-md-4 border border-primary text-center">
 	<h6 class="mt-2 text-primary">${urun.urunAdi}</h6><br/>
 	<p class="text-primary">Ürün Fiyatı: ${urun.satisFiyati} ₺ </p>
 	<p class="text-primary">Stok Sayısı: ${urun.stokSayisi} Adet </p>
 	<p class="text-primary">Tarih: ${urun.tarih}</p>
 	
 </div>
 
 <div class="col-md-2"></div>
 </div>
 <br/>
  <div class="row">
 <div class="col-md-2"></div>
 <div class="col-md-8 border border-primary">
 <h6 class="text-center text-primary mt-2">Ürün Yorumları</h6><br/>
   <c:forEach items="${yorumlar}" var="yorum">    
	<h6 class="text-primary">${yorum.yorum}</h6>
	<p style="font-style:italic;" class="text-primary">${yorum.isim} ${yorum.soyisim} - ${yorum.tarih}</p> <hr/>		 
     </c:forEach>     
 </div>
 <div class="col-md-2"></div>
 </div>
 
  <br/>
  <div class="row">
 <div class="col-md-2"></div>
 <div class="col-md-8 text-center border border-primary">
 <h6 class="text-primary mt-2">Yorum Yap</h6><br/>
   
   <br/>
			<frm:form action="${pageContext.request.contextPath}/yorumkaydet" modelAttribute="yorum" method="post">			
			
			<frm:hidden value="${urun.id}" path="urun_id"/>		
			<label>Ad:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
			<frm:input class="border border-primary" path="isim" /><br/>
			<label>Soyad:</label>
			<frm:input class="border border-primary" path="soyisim"/><br/>
			<label>Yorum:</label><br/>
			<frm:textarea class="border border-primary" rows="3" cols="50" maxlength="200" path="yorum"/><br/>			
			<frm:button class="btn-primary  mb-2" value="save" name="save">Kaydet</frm:button>
			
			</frm:form>
      
 </div>
 <div class="col-md-2"></div>
 </div>
 <br/><br/><br/>
</div>

</body>
</html>

