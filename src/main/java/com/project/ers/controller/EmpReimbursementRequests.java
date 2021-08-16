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



import com.project.ers.entity.EmployeeRegEntity;
import com.project.ers.service.EmployeeRegService;
import com.project.ers.service.EmployeeRegServiceImp;

public class EmpReimbursementRequests extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<EmployeeRegEntity>employeeRegEntityList=new ArrayList<>();
	   	 
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
//		Cookie reimbUserName[]=request.getCookies();
//	   	String email=reimbUserName[0].getValue();
	   	
		EmployeeRegService employeeRegService= new EmployeeRegServiceImp();
	   	employeeRegEntityList=employeeRegService.AllEmployeeDetailsServlet();
	   	
	   	out.println("<html>");
	   	out.println("<form action='http://localhost:8080/ERS/specificEmpReimbursement'>");
	   	out.println("<select name='empList'>");
	    for(int i=0;i<employeeRegEntityList.size();i++)
		{
		out.println("<option >"+employeeRegEntityList.get(i).getEmail());
		
		out.println("</option>");
	   	
		}
	    out.println("</select>");
	    out.println("<button>GetDetails</button>");
	    out.println("</form>");
	   	out.println("</html>");

	}

}
