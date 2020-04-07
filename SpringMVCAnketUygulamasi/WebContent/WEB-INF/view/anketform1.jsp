<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>anket1 form</title>
</head>
<body>


	<f:form action="showform2" method="GET" modelAttribute="anket">
	Ad :<f:input path="ad"/><br/>
	Soyad :<f:input path="soyad"/><br/>
	Cinsiyet :<f:radiobutton path="cinsiyet" value="Kadin"/>Kadin &nbsp;&nbsp;
	<f:radiobutton path="cinsiyet" value="Erkek"/>Erkek<br/>
	
	
	<br/>
	Sehir :<f:select path="sehir">
	
	<f:options items="${anket.sehirlerlistesi}"/>	
	</f:select><br/>
	
	Yaşınız :
	<f:radiobutton path="yas" value="18-24"/>18-24
	<f:radiobutton path="yas" value="25-34"/>25-34
	<f:radiobutton path="yas" value="35-54"/>35-54
	<f:radiobutton path="yas" value="55 ve üzeri"/>55 ve üzeri


	<br/><input value="Sonraki Sayfa" type="Submit"/>
	</f:form>


</body>
</html>