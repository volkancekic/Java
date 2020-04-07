<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>personel form</title>
</head>
<body>


	<f:form action="saveform" method="GET" modelAttribute="sahis">
	firstname:<f:input path="firstname"/><br/><f:errors path="firstname"/><br/>
	lastname:<f:input path="lastname"/><br/>
	department:<f:select path="department">
	<!-- <f:option value="hr" label="human resources"></f:option>
	<f:option value="ac" label="accounting"></f:option>
	<f:option value="sa" label="sales"></f:option>
	<f:option value="pr" label="production"></f:option> *Bunun yerine classtan listeden alıyoruz-->
	
	<f:options items="${sahis.departments}"/>	
	</f:select>
	<br/>
	Gender: <f:radiobutton path="gender" value="M"/>Male &nbsp;&nbsp;
	<f:radiobutton path="gender" value="F"/>Female<br/>
	
	Side Benefits: <f:checkbox path="sideBenefits" value="araba"/>Araba&nbsp;
	<f:checkbox path="sideBenefits" value="yemek"/>Yemek&nbsp;
	<f:checkbox path="sideBenefits" value="sigorta"/>Sigorta<br/> 
	salary:<f:input path="salary"/><br/><f:errors path="salary"/><br/>
	postal code:<f:input path="postalCode"/><br/><f:errors path="postalCode"/><br/>
	<br/><input value="gonder" type="Submit"/>
	</f:form>


</body>
</html>