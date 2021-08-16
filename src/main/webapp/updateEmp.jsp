<%@page import="com.project.ers.entity.EmployeeRegEntity" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		
	 
	   	<form action='http://localhost:8080/ERS/UpdateDetailsServlet' method='get'>
	   	<table border='2'>
	 <% 
	 List<EmployeeRegEntity>employeeRegEntityList= (List)request.getAttribute("list");
	 
	   	for(EmployeeRegEntity e:employeeRegEntityList)
	   	{%>
	   		
	   		<tr>
	   		<td>EmployeeName</td>
	   		<td><input type='text' name='name' value='<%= e.getName()%>'></td>
	   		</tr>
	   		
	   		
	   		<tr>
	   		<td>EmployeeEmail</td>
	   		<td><input type='text' name='email'value='<%= e.getEmail()%>'></td>
	   		</tr>
	   		
	   		<tr>
	   		<td>EmployeeType</td>
	   		<td><input type='text' name='type'value='<%= e.getType()%>'></td>
	   		</tr>
	   		
	   		<tr>
	   		<td>EmployeeDOB</td>
	   		<td><input type='date' name='date' value='<%=e.getDob()%>'></td>
	   		</tr>
	   		
	   		<tr>
	   		<td>EmployeeAddress</td>
	   		<td><input type='text' name='address'value='<%=e.getAddress()%>'></td>
	   		</tr>
	   		
	   		<tr>
	   		<td>EmployeePhnNo</td>
	   		<td><input type='tel' name='phnNo' value='<%=e.getPhnNo()%>'></td>
	   		</tr>
	   		
	   		<tr>
	   		<td>EmployeeGender</td>
	   		<td><input type='text' name='gender'value='<%=e.getGender()%>'></td></tr>
	   		<tr><td><button>update</button></td>
	   		</tr>
	   		<tr>
	   		<td><button>update</button></td>
	   		</tr>
	   		
	   	<% }%>
		</table>
		</form>
		
	




</body>
</html>