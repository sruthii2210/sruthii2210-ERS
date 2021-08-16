<%@page import="java.util.*"%>
<%@page import="com.project.ers.entity.EmpReimbursementEntity" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>


.ab
{
background-color:pink;
height:30px;
text-align:center;
}

.topnav {
  overflow: hidden;
  background-color: grey;
}
button
{
float:right;
background-color:green;
color:white;
width:100px; 
height:25px
}

.topnav a {
  float: left;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color:grey;
  color: white;
  }
  
  .topnav a.active {
  background-color: #04AA6D;
  color: white;
}
</style>

</head>

<body>

<script>
function validate()
{
	location.href="http://localhost:8080/ERS/index.jsp";
}

</script>



<button onclick=validate()>Logout</button>
<%String username= (String)request.getAttribute("attributeName");
//out.println(username);
%>
<div class="ab">
<%
out.println("<h2>"+"Welcome "+username+"!!"+"</h2>");
 
%>
</div>
<br>

<div class="topnav">
  <a class="active" href="http://localhost:8080/ERS/EmployeeDetailsServlet">View Profile</a>
   <a href="http://localhost:8080/ERS/UpdateEmpDetailsServlet">Update Information</a>
   <a href="http://localhost:8080/ERS/ReimbursementRequest.html">Send Reimbursement Request</a>
  <a href="http://localhost:8080/ERS/ReimbursementStatusServlet">View Reimbursement Requests</a>
  <a href="http://localhost:8080/ERS/ApprovedRequestServlet">Reimbursement Approved</a>
  <a href="http://localhost:8080/ERS/PendingRequestServlet">Reimbursement Pending</a>
  <a href="http://localhost:8080/ERS/DeniedRequestsServlet">Reimbursement Denied</a>
</div>


<br>

 
 <%--      
<%

ArrayList<EmpReimbursementEntity> emp = (ArrayList<EmpReimbursementEntity>)request.getAttribute("ReimbList");


<h1 text-align:center>Displaying Reimbursement Requests</h1>
      <table border ="1" width="500" align="center">
         <tr bgcolor="00FF7F">
          <th><b>ReimbursementId</b></th>
          <th><b>ReimbursementType</b></th>
          <th><b>ReimbursementAmount</b></th>
          <th><b>ReimbursementDate</b></th>
          <th><b>ReimbursementStatus</b></th>
          <th><b>ReimbursementEmail</b></th>
          <th><b>ReimbursementUserName</b></th>
         </tr>
for(EmpReimbursementEntity e:emp)
{%>
       
            <tr>
                <td><%=e.getReimbursementId()%></td>
                <td><%=e.getReimbursementType()%></td>
                <td><%=e.getPrice()%></td>
                <td><%=e.getDate()%></td>
                <td><%=e.getStatus()%></td>
                <td><%=e.getEmpEmail()%></td>
                <td><%=e.getEmpEmail().getName()%></td>
            </tr>
            
 <%}
 
 %>
        </table> 
        <hr/>

 --%> 

</body>
</html>