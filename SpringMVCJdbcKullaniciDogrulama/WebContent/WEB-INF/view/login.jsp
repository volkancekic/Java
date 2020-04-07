<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
			.formElement{
			  width: 45%;
			  padding: 10px 20px;
			  margin: 4px 0;
			  box-sizing: border-box;
			  border: 2px solid DeepSkyBlue;
			  border-radius: 4px;
			}
			 .button {
			  background-color: #4CAF50; 
			  border: none;
			  color: white;
			  padding: 12px 24px;
			  text-align: center;
			  text-decoration: none;
			  display: inline-block;
			  font-size: 14px;
			  margin: 4px 2px;
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
			#border_css{
			  border-style: solid;
			  border-color: #008CBA;
			  border-radius: 10px;
			  padding:20px;			  	
			{		
		</style>
</head>
<body>
	
	<form action="usercontrol" method="get">
	<p id="border_css">
		Username :<br/><input class="formElement" type="text" name="username" required/>
		<br/>Password :<br/><input class="formElement" type="password" name="password" required/>
		
		<br/><input class="button button2" type="submit" value="Login"/>
	
	
	&nbsp;
	<a href="cancel" class="button button2">Cancel</a>
	</p>
	</form>
</body>
</html>