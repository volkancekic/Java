<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	
	Ad :${anket2.ad}

	Soyad :${anket2.soyad}
	
	Cinsiyet :${anket2.cinsiyet}
	
	Sehir :${anket2.sehir}
	
	Yas :${anket2.yas}
	Ogrenim Durumu:${anket2.ogrenim_durumu}
	
	Calıstıgı Sektor :${anket2.sektor}
	Gelir Aralıgı :${anket2.gelir}
	En Çok Harcama Yapılanlar :
	<c:forEach items="${anket2.harcama}" var="rec">
		${rec},
	</c:forEach>
	
	Bos Zaman Degerlendirme :
	<c:forEach items="${anket2.bos_zaman}" var="rec">
		${rec},
	</c:forEach>
		
	



</body>
</html>


<!-- taglib eklendi checkbox sonucunu yazdırabilmek için -->