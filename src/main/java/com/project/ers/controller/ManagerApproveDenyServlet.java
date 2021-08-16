package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;

public class ManagerApproveDenyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		 String reimbId=request.getParameter("reimbIdList");
		 
		 List<EmpReimbursementEntity>empReimbursementEntity=new ArrayList<EmpReimbursementEntity>();
		 EmpReimbursementService empReimbursementService= new EmpReimbursementServiceImp();
		 empReimbursementEntity=empReimbursementService.viewReimbId(reimbId);
		 for(EmpReimbursementEntity e:empReimbursementEntity)
		   	{
		   	   
		   	   out.println("<body>");
		   	   out.println("<br>");
		   	   out.println("<center>");
		   	  out.println("<form>");
		   		out.println("<table border='2'>");
		   		out.println("<tr>");
		   		out.println("<td>ReimbursementId</td>");
		   	
		   		out.println("<td><input name='id' type='text' value="+e.getReimbursementId()+" ></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println(" <td>ReimbursementType</td>");
		   		out.println(" <td><input name='type' type='text' value="+e.getReimbursementType()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println("<td>ReimbursementStatus</td>");
		   		out.println("<td><input name='status' type='text' value="+e.getStatus()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println("<td>ReimbursementDate</td>");
		   		out.println("<td><input name='date' type='date' value="+e.getDate()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println("<td>ReimbursementAmount</td>");
		   		out.println("<td><input name='price' type='number' value="+e.getPrice()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println("<td>EmployeeEmail</td>");
		   		out.println("<td><input name='name' type='text' value="+e.getEmpEmail().getName()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		
		   		out.println("<td><a href='http://localhost:8080/ERS/ManagerApprovalServlet?id="+e.getReimbursementId()+"'>Approve</a></td>");
		   		out.println("</form>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println("<td><a href='http://localhost:8080/ERS/ManagerDenyServlet?id="+e.getReimbursementId()+"'>Deny</a></td>");
		   		out.println("</tr>");
		   		
		   		out.println("</table>");
		   	 out.println("</form>");
		   		out.println("</center>");
		   		out.println("<br>");
		   		out.println("<br>");
		   	 out.println("</body>");
		   	}
		 
		 
		 
	
	}


}
