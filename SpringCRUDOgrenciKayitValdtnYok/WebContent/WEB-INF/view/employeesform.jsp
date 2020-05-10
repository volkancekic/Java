<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees Formu</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Employees Formu</h2>
			<br/>
			<frm:form action="employeeskaydet" modelAttribute="employees" method="post">
			<frm:hidden path="id"/>
			<table>
			<tr>
			<td><label>First Name:</label></td>
			<td><frm:input path="firstName"/></td>
			</tr>
			<tr>
			<td><label>Last Name:</label></td>
			<td><frm:input path="lastName"/></td>
			</tr>
			<tr>
			<td><label>Email:</label></td>
			<td><frm:input path="email"/></td>
			</tr>
			<tr>
			<td><label>Phone Number:</label></td>
			<td><frm:input path="phoneNumber"/></td>
			</tr>
			<tr>
			<td><label>Hire Date:</label></td>
			<td><frm:input type="date" path="date"/></td>			
			</tr>
			<tr>
			<td><label>Job:</label></td>
			<td><frm:select path="job.id">
			<frm:options items="${jobList}"></frm:options>
			</frm:select></td>
			</tr>
			<tr>
			<td><label>Salary:</label></td>
			<td><frm:input path="salary"/></td>
			</tr>
			<tr>
			<td><label>Commission Pct:</label></td>
			<td><frm:input path="commissionPct"/></td>
			</tr>
			<tr>
			<td><label>Manager:</label></td>
			<td><frm:select path="manager.id">
			<frm:options items="${managerList}"></frm:options>
			</frm:select></td>
			</tr>
			<tr>
			<td><label>Department:</label></td>
			<td><frm:select path="department.id">
			<frm:options items="${departmentList}"></frm:options>
			</frm:select></td>
			</tr>			
			<tr>
			<td></td>
			<td>
			<frm:button class="save-button" value="save" name="save">Kaydet</frm:button>
			</td>
			</tr>
			</table>
			</frm:form>
		</div>
	</div>


</body>
</html>