package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.dto.EmployeeReg;
import com.project.ers.service.EmployeeRegService;
import com.project.ers.service.EmployeeRegServiceImp;


public class UpdateDetailsServlet extends HttpServlet {

  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
  		response.setContentType("text/html");
  		System.out.println("In updateDetailservlet");
		PrintWriter out=response.getWriter();
		EmployeeReg employeeReg=new EmployeeReg();
		
		String name=request.getParameter("name");
		String dob=request.getParameter("date");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String phn=request.getParameter("phnNo");
		String gender=request.getParameter("gender");
		String type=request.getParameter("type");
		
		long phnNo=Long.parseLong(phn);
		
		employeeReg.setName(name);
		employeeReg.setDob(dob);
		employeeReg.setEmail(email);
		employeeReg.setAddress(address);
		employeeReg.setPhnNo(phnNo);
		employeeReg.setGender(gender);
		employeeReg.setType(type);
		
		
		
		EmployeeRegService employeeRegService= new EmployeeRegServiceImp();

   		Cookie reimbUserName[]=request.getCookies();
   		out.println(reimbUserName[0].getValue());
   		String mail=reimbUserName[0].getValue();
		
		int status=0;
		status=employeeRegService.updateDetails(employeeReg);
		
		
//		if(type=="Employee"&&status==1)
//		{
//			request.setAttribute("attributeName",mail);
//			RequestDispatcher rd = request.getRequestDispatcher("employee.jsp");
//			rd.forward(request,response);
//		}
//		
//		if(type=="Manager"&&status==1)
//		{
//			request.setAttribute("attributeName",mail);
//			RequestDispatcher rd = request.getRequestDispatcher("manager.jsp");
//			rd.forward(request,response);
//		}

  	
  	}

}
