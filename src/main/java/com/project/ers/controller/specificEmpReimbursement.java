package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;

public class specificEmpReimbursement extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 EmpReimbursementService empReimbursementService= new EmpReimbursementServiceImp();
		
		 List<EmpReimbursementEntity>empReimbursement=new ArrayList<EmpReimbursementEntity>();
	   	 
		 String empEmail=request.getParameter("empList");
	 
		   	empReimbursement=empReimbursementService.viewReimbursement(empEmail);
		   	
		   	for(EmpReimbursementEntity e:empReimbursement)
		   	{
		   		
		   	   out.println("<br>");
		   	   
		   	   out.println("<center>");
		   		out.println("<table border='2'>");
		   		out.println("<tr>");
		   		out.println("<td>ReimbursementId</td>");
		   		out.println("<td><input type='text' name='name' value="+e.getReimbursementId()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println(" <td>ReimbursementType</td>");
		   		out.println(" <td><input type='text' name='email'value="+e.getReimbursementType()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println("<td>ReimbursementStatus</td>");
		   		out.println("<td><input type='text' name='type'value="+e.getStatus()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println("<td>ReimbursementAmount</td>");
		   		out.println("<td><input type='date' name='date' value="+e.getPrice()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("<tr>");
		   		out.println("<td>EmployeeEmail</td>");
		   		out.println("<td><input type='text' name='address' value="+e.getEmpEmail().getName()+"></td>");
		   		out.println("</tr>");
		   		
		   		out.println("</table>");
		   		out.println("</center>");
		   	}

   		
		    	   out.println("<a href='manager.jsp'>Back to Home Page</a>");

				
		       
		   			
	}

}
