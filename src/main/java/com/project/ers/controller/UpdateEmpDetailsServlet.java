package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmployeeRegEntity;
import com.project.ers.service.EmployeeRegService;
import com.project.ers.service.EmployeeRegServiceImp;


public class UpdateEmpDetailsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		//EmployeeReg employeeReg=new EmployeeReg();
		
		EmployeeRegService employeeRegService= new EmployeeRegServiceImp();
	   	 
	   	 List<EmployeeRegEntity> employeeRegEntityList=new ArrayList<>();
	   	 
	   	 
	   	Cookie userName[]=request.getCookies();
	   	String email=userName[0].getValue();
	   	 
	   	employeeRegEntityList=employeeRegService.viewEmpDetails(email);
	   	
	   	System.out.println(employeeRegEntityList);

	   	if(employeeRegEntityList!=null)
	   	{
		out.println("<br>");
		
	   	out.println("<center>");
	   	out.println("<form action='http://localhost:8080/ERS/UpdateDetailsServlet' method='get'> ");
			
	   		out.println("<table border='2'>");
	   		out.println("<tr>");
	   		out.println("<td>EmployeeName</td>");
	   		out.println("<td><input type='text' name='name' value="+employeeRegEntityList.get(0).getName()+"></td>");
	   		out.println("</tr>");
	   		
	   		out.println("<tr>");
	   		out.println(" <td>EmployeeEmail</td>");
	   		out.println(" <td><input type='text' name='email'value="+employeeRegEntityList.get(0).getEmail()+"></td>");
	   		out.println("</tr>");
	   		
	   		out.println("<tr>");
	   		out.println("<td>EmployeeType</td>");
	   		out.println("<td><input type='text' name='type'value="+employeeRegEntityList.get(0).getType()+"></td>");
	   		out.println("</tr>");
	   		
	   		out.println("<tr>");
	   		out.println("<td>EmployeeDOB</td>");
	   		out.println("<td><input type='date' name='date' value="+employeeRegEntityList.get(0).getDob()+"></td>");
	   		out.println("</tr>");
	   		
	   		out.println("<tr>");
	   		out.println("<td>EmployeeAddress</td>");
	   		out.println("<td><input type='text' name='address' value="+employeeRegEntityList.get(0).getAddress()+"></td>");
	   		out.println("</tr>");
	   		
	   		out.println("<tr>");
	   		out.println("<td>EmployeePhnNo</td>");
	   		out.println("<td><input type='tel' name='phnNo' value="+employeeRegEntityList.get(0).getPhnNo()+"></td>");
	   		out.println("</tr>");
	   		
	   		
	   		out.println("<tr>");
	   		out.println("<td>EmployeeGender</td>");
	   		out.println("<td><input type='text' name='gender' value="+employeeRegEntityList.get(0).getGender()+"></td>");
	   		out.println("</tr>");
	   		
	   		
	   		
	   		out.println("<tr>");
	   		out.println("<td><input type='submit' value='update'></td>");
	   		out.println("</tr>");
	   		
	   		//out.println("<tr><td><a href='http://localhost:8080/ERS/UpdateDetailsServlet?list="+e+"'>update</a></td></tr>");
	   		out.println("</table>");
	   		
			out.println("</form>");
	   	
		
		out.println("</center>");
		
		
		
		
	   	}
	   	 
	   	 
	   	 
	   	 
	
	}

}
