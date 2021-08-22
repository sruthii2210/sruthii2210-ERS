<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ManagerHomePage</title>
<style>
.ab
{
background-color:PaleTurquoise;
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
out.println("<i><h2>"+"Welcome Manager!!"+"</h2></i>");
 
%>
</div>
<br>

<div class="topnav">
  <a class="active" href="http://localhost:8080/ERS/EmployeeDetailsServlet">View Profile</a>
   <a href="http://localhost:8080/ERS/UpdateEmpDetailsServlet">Update Information</a>
   <a href="http://localhost:8080/ERS/EmpReimbursementRequests">view Reimbursement Requests of Particular User</a>
  <a href="http://localhost:8080/ERS/ManagerApprovalDenyServlet">View Pending Requests</a>
  <a href="http://localhost:8080/ERS/ManagerApprovalRequestsServlet">view Approval Requests</a>
  <a href="http://localhost:8080/ERS/ManagerDenyRequestsServlet">view Denied Requests</a>
  <a href="http://localhost:8080/ERS/AllEmployeeDetailsServlet">EmployeeDetails</a>
</div>


</body>
</html>