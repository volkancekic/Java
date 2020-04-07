<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${role1} Main Page</title>
<style>
		body {
			  max-width: 500px;
			  margin: auto;
			  background: white;
			  padding: 20px;
			}
			h1 {
			  text-align: center;			 
			}
			p {
			  border-style: solid;
			  border-color: DeepSkyBlue;
			  border-radius: 5px;	
			  padding:20px;		  	
			}				
		</style>
</head>
<body>

<h1>${role1} page </h1>
<p>Welcome<br/><br/>${role1} :
&nbsp;&nbsp;&nbsp;${user1.name} ${user1.lastname}</p>
	
	<br/><a href="login">Logout</a>
</body>
</html>