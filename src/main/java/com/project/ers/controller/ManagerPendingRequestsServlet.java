package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;

public class ManagerPendingRequestsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        EmpReimbursementService reimbRequest = new EmpReimbursementServiceImp();
	        
	        List<EmpReimbursementEntity> pendingList =reimbRequest.viewPendingRequests();
	        out.println("<center>");
	        out.println("Pending List of Reimbursements");
	        
//	        for(EmpReimbursementEntity r: pendingList)
//	        {
//	            System.out.println(r.getReimbursementId());
//	            System.out.println(r.getReimbursementType());
//	            System.out.println(r.getEmpEmail().getEmail());
//	            System.out.println(r.getPrice());
//	            System.out.println(r.getDate());
//	            System.out.println(r.getStatus());
//	        }
	        
	        for(int i=0;i<pendingList.size();i++)// 
	        {
	        	 out.println("<table border='2'>");
	            out.println("<tr><td>Request ID</td>"+"<td>"+pendingList.get(i).getReimbursementId()+"</td></tr>");
	            out.println("<tr><td>Type</td>"+"<td>"+pendingList.get(i).getReimbursementType()+"</td></tr>");
	            out.println("<tr><td>Amount</td>"+"<td>"+pendingList.get(i).getEmpEmail().getEmail()+"</td></tr>");
	            out.println("<tr><td>Status</td>"+"<td>"+pendingList.get(i).getStatus()+"</td></tr>");
	            out.println("<tr><td>Date</td>"+"<td>"+pendingList.get(i).getDate()+"</td></tr>");
	            out.println("<tr><td>Price</td>"+"<td>"+pendingList.get(i).getPrice()+"</td></tr>");
	            out.println("<br><br>");
	            out.println("</table>");
	        }
	       
	       // out.println("<form action='http://localhost:8080/EmployeeReimbursementSystem/Employee.html'> <input type='submit' value='Back to Home'></form> ");
	        out.println("</center>");
	        out.println("</body>");
	    }
	
	}


