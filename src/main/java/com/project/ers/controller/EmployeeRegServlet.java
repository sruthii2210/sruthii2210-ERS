package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.dto.EmployeeReg;
import com.project.ers.service.EmployeeRegService;
import com.project.ers.service.EmployeeRegServiceImp;

public class EmployeeRegServlet extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		response.setContentType("text/html");
		int ct=0;
		String name=request.getParameter("user");
		String dob=request.getParameter("dob");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String phn=request.getParameter("phnNo");
		String gender=request.getParameter("gender");
		String type=request.getParameter("typeEmp");
		
		long phnNo=Long.parseLong(phn);
		
		EmployeeReg employeeReg=new EmployeeReg();
		employeeReg.setName(name);
		employeeReg.setDob(dob);
		employeeReg.setEmail(email);
		employeeReg.setAddress(address);
		employeeReg.setPhnNo(phnNo);
		employeeReg.setGender(gender);
		employeeReg.setType(type);
		
		
		EmployeeRegService employeeRegService= new EmployeeRegServiceImp();
		
		
		if(type=="Employee")
		{
			int result=employeeRegService.addEmployee(employeeReg);
		
			if(result==1)
			response.sendRedirect("http://localhost:8080/ERS/userpass.html");  
		}
		
		else
		{
			ct=ct+1;
			
			
			if(ct==1)
			{
				int result=employeeRegService.addEmployee(employeeReg);
				if(result==1)
					response.sendRedirect("http://localhost:8080/ERS/userpass.html"); 
				else
					out.println("Only one manager is allowed");
				
			}
		}
		
				
		
	}
	
	 
}