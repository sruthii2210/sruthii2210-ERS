package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;
import com.project.ers.entity.EmployeeRegEntity;
import com.project.ers.service.EmployeeRegService;
import com.project.ers.service.EmployeeRegServiceImp;
import com.project.ers.service.LoginValidationService;
import com.project.ers.service.LoginValidationServiceImp;


public class LoginValidationServlet extends HttpServlet {
	
   Logger logger=Logger.getLogger("LoginValidationServlet.class");
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	logger.info("In servlet-LoginVaidationServlet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("username");
		String pass=request.getParameter("password");
		
		EmployeeLogin employeeLogin=new EmployeeLogin();
		employeeLogin.setUserName(userName);
		employeeLogin.setPwd(pass);
		
		Cookie c=new Cookie("cname",userName);
		response.addCookie(c);

//   		EmployeeLoginEntity empLoginEntity=new EmployeeLoginEntity();
//	     
//   		EmployeeRegEntity empRegEntity=new EmployeeRegEntity();
		
		LoginValidationService loginValidationService= new LoginValidationServiceImp();
		
   		EmployeeRegService employeeRegService=new EmployeeRegServiceImp();
   		List<EmployeeRegEntity>empRegList;
   		
   		empRegList=employeeRegService.viewEmpDetails(userName);
   		int status=0;
   		
   		String type=empRegList.get(0).getType();
   	
       if(type.compareTo("Employee")==0)
       {
    	   int flag=0;
		
		        flag=loginValidationService.loginValidate(employeeLogin);
		 
			
				if(flag==1)
				{
					request.setAttribute("attributeName",userName);
					RequestDispatcher rd = request.getRequestDispatcher("employee.jsp");
					rd.forward(request,response);
				}
			//response.sendRedirect("http://localhost:8080/ERS/sample.jsp");
		
       }
       
       
       
       if(type.compareTo("Manager")==0)
       {
    	   int flag=0;
		
		        flag=loginValidationService.loginValidate(employeeLogin);
		 
			
				if(flag==1)
				{
					request.setAttribute("attributeName",userName);
					RequestDispatcher rd = request.getRequestDispatcher("manager.jsp");
					rd.forward(request,response);
				}
			//response.sendRedirect("http://localhost:8080/ERS/sample.jsp");
		
       }
	}

	

}
