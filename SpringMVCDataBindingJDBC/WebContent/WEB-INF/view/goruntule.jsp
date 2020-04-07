<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Department Display</title>
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
		</style>
</head>
<body>

<f:form action="update" method="GET" modelAttribute="departman">
	<br/>Id :<br/><f:input class="formElement" path="id" readonly="true"/>
	<br/>Department Name :<br/><f:input class="formElement" path="name"/>
	<br/>Location Id :<br/><f:input class="formElement" path="location_id"/>
	<br/><input class="button button2" value="Update" type="Submit"/>

	</f:form>
	
</body>
</html>