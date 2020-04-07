<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Result</title>
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
			}					
		</style>
</head>
<body>
<h1>Update Successful</h1><br/>
<p><br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Id : ${dprtmn.id}<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Name : ${dprtmn.name}<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Location id : ${dprtmn.location_id}<br/><br/></p>
<br/><a href="homepage">Go to Main Page</a></body>
</html>