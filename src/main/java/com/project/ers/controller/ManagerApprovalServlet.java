package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.dto.EmpReimbursement;
import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;

public class ManagerApprovalServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int flag=0;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		EmpReimbursement e=new EmpReimbursement();
		EmpReimbursementService empReimbursementService= new EmpReimbursementServiceImp();
		String id=request.getParameter("id");

		e.setReimbursementId(id);

		flag=empReimbursementService.setApproval(e);
		System.out.println(flag);
		
		if(flag>0)
		{
			out.println("Approved");
			response.sendRedirect("manager.jsp");
		}
		

	
	}

}
