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

import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.entity.EmployeeRegEntity;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;
import com.project.ers.service.EmployeeRegService;
import com.project.ers.service.EmployeeRegServiceImp;

public class EmployeeDetailsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeReg employeeReg=new EmployeeReg();
		
		EmployeeRegService employeeRegService= new EmployeeRegServiceImp();
	   	 
	   	 List<EmployeeRegEntity>employeeRegEntityList=new ArrayList<>();
	   	 
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie reimbUserName[]=request.getCookies();
	   	String email=reimbUserName[0].getValue();
	   	
	   	employeeRegEntityList=employeeRegService.viewEmpDetails(email);
	   	
	   	out.println("<center>");
	   	out.println("<table border='2'>");
	   	out.println("<tr>");
	   	out.println("<td>EmployeeName</td>");
	   	out.println("<td>"+employeeRegEntityList.get(0).getName()+"</td>");
	   	out.println("</tr>");
	 	out.println("<tr>");
	 	out.println("<td>EmployeeType</td>");
	   	out.println("<td>"+employeeRegEntityList.get(0).getType()+"</td>");
	   	out.println("</tr>");
		
	 	out.println("<tr>");
	 	out.println("<td>EmployeeDob</td>");
	 	out.println("<td>"+employeeRegEntityList.get(0).getDob()+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>EmployeeAddress</td>");
	 	out.println("<td>"+employeeRegEntityList.get(0).getAddress()+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>EmployeePhnNo</td>");
	 	out.println("<td>"+employeeRegEntityList.get(0).getPhnNo()+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>EmployeeGender</td>");
	 	out.println("<td>"+employeeRegEntityList.get(0).getGender()+"</td>");
		out.println("</tr>");
		
		
		out.println("</table>");
		out.println("</center>");
	   	
	   	
		
		
	}

}
