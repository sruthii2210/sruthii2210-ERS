<%@page import="com.project.ers.entity.EmpReimbursementEntity" %>
<%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
EmpReimbursementEntity empReimb=new EmpReimbursementEntity();
List<EmpReimbursementEntity>e=new ArrayList<EmpReimbursementEntity>();

empReimb= (EmpReimbursementEntity)request.getAttribute("employeeRegEntityList");
%>

<select onchange="funList()">
<%
	
	

%>
</select>
	


</body>
</html>