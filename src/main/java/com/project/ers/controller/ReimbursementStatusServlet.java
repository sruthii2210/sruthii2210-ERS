package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;


public class ReimbursementStatusServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 EmpReimbursementService empReimbursementService= new EmpReimbursementServiceImp();
	   	 
	   	 List<EmpReimbursementEntity>empReimbursementEntity=new ArrayList<>();
	   	 
	   	Cookie reimbUserName[]=request.getCookies();
	   	 String email=reimbUserName[0].getValue();
	   	empReimbursementEntity=empReimbursementService.viewReimbursement(email);
	   	
	   	

	   	out.println("<br>");
	   	   out.println("<center>");
	   		out.println("<table border='2'>");
	   		out.println("<tr>");
	   		out.println("<td>ReimbursementId</td><td>ReimbursementType</td><td>ReimbursementStatus</td><td>ReimbursementAmount</td><td>Date</td>");
	   		out.println("</tr>");
	   		
		   	for(EmpReimbursementEntity e:empReimbursementEntity)
		   	{
		   		out.println("<tr>");
		   		out.println("<td>"+e.getReimbursementId()+"</td><td>"+e.getReimbursementType()+"</td><td>"+e.getStatus()+"</td><td>"+e.getPrice()+"</td><td>"+e.getDate()+"</td>");
		   		out.println("</tr>");
	   		
		   	}
	   		
		   	out.println("</table>");
	   		out.println("</center>");
	   		out.println("<br>");
	   		out.println("<a href='employee.jsp'>Back to Home Page</a>");
	   		
	}

}
