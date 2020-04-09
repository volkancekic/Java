<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page</title>
<style>

body {
	max-width: 500px;
	margin: auto;
	background: white;
	padding: 20px;
}

.formElement {
	width: 45%;
	padding: 7px 14px;
	margin: 3px 0;
	box-sizing: border-box;
	border: 1px solid DeepSkyBlue;
	border-radius: 3px;
}

.button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 6px 14px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 12px;
	margin: 3px 2px;
	transition-duration: 0.4s;
	cursor: pointer;
}

.button2 {
	background-color: white;
	color: black;
	border: 2px solid #008CBA;
}

.button2:hover {
	background-color: #008CBA;
	color: white;
}
</style>
</head>
<body>
	<form action="homepage" method="POST">
		Department Id :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
			class="formElement" type="text" pattern="\d*" required name="idno" />
		&nbsp;&nbsp;&nbsp;&nbsp;<input class="button button2" type="submit"
			value="Search" />
	</form>

	<hr />

	<f:form action="homepage" method="GET" modelAttribute="bilgiler">
		Department Id :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<f:input
			class="formElement" path="id" readonly="true" />
		<br />Department Name :<f:input class="formElement" path="name"
			pattern="[A-Za-z0-9]{2,}"
			title="Yalnızca harf veya rakam girilebilir." required="True" />
		<br />Manager Id :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<f:input
			class="formElement" required="True" pattern="\d*"
			title="Yalnızca sayı girilebilir." path="manager_id" />
		<br />Location Id :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<f:input
			class="formElement" required="True" pattern="\d*"
			title="Yalnızca sayı girilebilir." path="location_id" />
		<br />
		<br />
		<input class="button button2" type="submit" value="Update" />


	</f:form>
	<p style="color: DarkOrange; text-align: center; font-size: 27px;">${message2}</p>
	<br />
	<p style="color: red; text-align: center; font-size: 27px;">${message}</p>

</body>
</html>