package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.dto.EmpReimbursement;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;


public class ManagerDenyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int flag=0;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		EmpReimbursement e=new EmpReimbursement();
		EmpReimbursementService empReimbursementService= new EmpReimbursementServiceImp();
		String id=request.getParameter("id");
		
		e.setReimbursementId(id);

		flag=empReimbursementService.setDeny(e);
		System.out.println(flag);
		
		if(flag>0)
		{
			out.println("Denied");
		response.sendRedirect("manager.jsp");
		}
	
	}

}
