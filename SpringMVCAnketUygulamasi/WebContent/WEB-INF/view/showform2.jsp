<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>anket1 form</title>
</head>
<body>


	<f:form action="anketconfirm" method="GET" modelAttribute="anket1">
	Öğrenim Durumunuz :<f:select path="ogrenim_durumu">
	
	<f:options items="${anket1.ogr_durum}"/>	
	</f:select><br/>
	
	
	Çalıştığınız Sektör : :<f:radiobutton path="sektor" value="Ozel"/>Ozel &nbsp;&nbsp;
	<f:radiobutton path="sektor" value="Kamu"/>Kamu<br/>
	<f:radiobutton path="sektor" value="Serbest"/>Serbest<br/>
	
	<br/>
	Aylık Geliriniz : :<f:select path="gelir">
	
	<f:options items="${anket1.aylik_gelir}"/>	
	</f:select><br/>
	
	Kazancınızı En Çok Neye Harcıyorsunuz? :
	<f:checkbox path="harcama" value="Ev Kirasi-Faturalar"/>Ev Kirasi-Faturalar&nbsp;
	<f:checkbox path="harcama" value="Giyim"/>Giyim
	<f:checkbox path="harcama" value="Yiyecek_Icecek"/>Yiyecek_Icecek
	<f:checkbox path="harcama" value="Seyahat"/>Seyahat<br/> 
	
	Boş Zamanlarınızı Nasıl Değerlendiriyorsunuz? :
	<f:checkbox path="bos_zaman" value="Kitap Okumak"/>Kitap Okumak&nbsp;
	<f:checkbox path="bos_zaman" value="Arkadaslarla Bulusmak"/>Arkadaslarla Bulusmak&nbsp;
	<f:checkbox path="bos_zaman" value="Sinemaya Gitmek"/>Sinemaya Gitmek&nbsp;
	<f:checkbox path="bos_zaman" value="Oyun Oynamak"/>Oyun Oynamak<br/> 
	
	
	
	
	<br/><input value="Sonuçları Gönder" type="Submit"/>
	</f:form>


</body>
</html>