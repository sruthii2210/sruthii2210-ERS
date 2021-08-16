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
import com.project.ers.service.EmployeeRegService;
import com.project.ers.service.EmployeeRegServiceImp;


public class ManagerApprovalDenyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//EmployeeRegService employeeRegService= new EmployeeRegServiceImp();
		 EmpReimbursementService empReimbursementService= new EmpReimbursementServiceImp();
	   	 
	   	 List<EmpReimbursementEntity>empReimbursementEntity=new ArrayList<>();
	   	 
	   	Cookie reimbUserName[]=request.getCookies();
	   	 String email=reimbUserName[0].getValue();
	   	
	   	 
	   	empReimbursementEntity=empReimbursementService.viewPendingRequests();
	   	
	   	out.println("<html>");
	   	out.println("<form action='http://localhost:8080/ERS/ManagerApproveDenyServlet'>");
	   	out.println("<select name='reimbIdList'>");
	    for(int i=0;i<empReimbursementEntity.size();i++)
		{
		out.println("<option >"+empReimbursementEntity.get(i).getReimbursementId());
		
		out.println("</option>");
	   	
		}
	    out.println("</select>");
	    out.println("<button>GetDetails</button>");
	    out.println("</form>");
	   	out.println("</html>");
	   	

	
	}

}
