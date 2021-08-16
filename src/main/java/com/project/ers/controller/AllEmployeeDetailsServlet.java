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
import com.project.ers.entity.EmployeeRegEntity;
import com.project.ers.service.EmployeeRegService;
import com.project.ers.service.EmployeeRegServiceImp;

public class AllEmployeeDetailsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        EmployeeReg employeeReg=new EmployeeReg();
		
		EmployeeRegService employeeRegService= new EmployeeRegServiceImp();
	   	 
	   	 List<EmployeeRegEntity>employeeRegEntityList=new ArrayList<>();
	   	 
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//Cookie reimbUserName[]=request.getCookies();
	   //	String email=reimbUserName[0].getValue();
	   	
	   	employeeRegEntityList=employeeRegService.AllEmployeeDetailsServlet();
	   	
//	   for(int i=0;i<employeeRegEntityList.size();i++)
//		{
//	   	out.println("<h3>");
//		out.println("\n"+employeeRegEntityList.get(i).getName());
//		out.println(employeeRegEntityList.get(i).getType());
//		
//		out.println(employeeRegEntityList.get(i).getDob());
//		
//		out.println(employeeRegEntityList.get(i).getAddress());
//		out.println(employeeRegEntityList.get(i).getPhnNo());
//		out.println(employeeRegEntityList.get(i).getGender());
//		
//		out.println("</h3>");
//		out.println();
//		}
	
	   	out.println("<table border='2'>");
	   	out.println("<tr>");
	   	out.println("<td>EmployeeName</td><td>EmployeeType</td><td>EmployeeDOB</td><td>EmployeeAddress</td><td>EmployeePhnNo</td><td>Gender</td>");
	   	
	   	out.println("</tr>");
	   	for(int i=0;i<employeeRegEntityList.size();i++)
	   	{
	   		out.println("<tr>");
	   		out.println("<td>"+employeeRegEntityList.get(i).getName()+"</td><td>"+employeeRegEntityList.get(i).getType()+"<td>"+employeeRegEntityList.get(i).getDob()+"<td>"+employeeRegEntityList.get(i).getAddress()+"<td>"+employeeRegEntityList.get(i).getPhnNo()+"<td>"+employeeRegEntityList.get(i).getGender()+"</td>");
	   	 	out.println("</tr>");
	   	}
	   	
	  
	   	out.println("</table>");
	   	
	}

}
