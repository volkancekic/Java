<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lütfen Giriş Yapın</title>
<style type="text/css">
	.error{
	color: red
	}
	.info{
	color:blue
	}
</style>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet">
<link
	href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css"	rel="stylesheet" />
</head>
<body>
	<div class="container">
		<form class="form-signin" method="post"
			action="authenticateTheUser">
			<h2 class="form-signin-heading">Lütfen Giriş Yapın</h2>
			<p>
				<label for="username" class="sr-only">Kullanıcı Adı</label> 
				<input type="text" id="username" name="username" class="form-control"
					placeholder="Username" required autofocus>
			</p>
			<p>
				<label for="password" class="sr-only">Şifre</label> 
				<input type="password" id="password" name="password" class="form-control"
					placeholder="Password" required>
			</p>
			<c:if test="${param.error != null}">
			<p class="error">  
				Hatalı Kullanıcı adı veya Şifre 
			</p>
			</c:if>
			<c:if test="${param.logout != null}">
			<p class="info">  
				Çıkış İşlemi Başarılı
			</p>
			</c:if>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">Giriş Yap</button>
		</form>
	</div>
</body>
</html>