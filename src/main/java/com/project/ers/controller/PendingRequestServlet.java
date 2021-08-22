package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;

public class PendingRequestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		    response.setContentType("text/html");
		        PrintWriter out=response.getWriter();
		        Cookie c[]=request.getCookies();
		        String userName=c[0].getValue();
		        out.println("<body>");
		        out.println("<center>");
		        out.println("Pending Requests of "+" "+userName);
		        EmpReimbursementService reimbRequest = new EmpReimbursementServiceImp();
		        
		        List<EmpReimbursementEntity> pendingList =reimbRequest.viewPendingRequests(userName);
		        System.out.println(pendingList);
		        out.println("<br>");
		       
		        for(EmpReimbursementEntity r: pendingList)
		        {
		            System.out.println(r.getReimbursementId());
		            System.out.println(r.getReimbursementType());
		            System.out.println(r.getEmpEmail().getEmail());
		            System.out.println(r.getPrice());
		            System.out.println(r.getDate());
		            System.out.println(r.getStatus());
		        }
		       
		        for(EmpReimbursementEntity list :pendingList)
		        {
		        	 out.println("<table border='2'>");
		            out.println("<tr><td>Request ID</td>"+"<td>"+list.getReimbursementId()+"</td></tr>");
		            out.println("<tr><td>Type</td>"+"<td>"+list.getReimbursementType()+"</td></tr>");
		            out.println("<tr><td>Amount</td>"+"<td>"+list.getEmpEmail().getEmail()+"</td></tr>");
		            out.println("<tr><td>Status</td>"+"<td>"+list.getPrice()+"</td></tr>");
		            out.println("<tr><td>Date</td>"+"<td>"+list.getDate()+"</td></tr>");
		            out.println("<tr><td>Date</td>"+"<td>"+list.getStatus()+"</td></tr>");
		            out.println("<br>");
		            out.println("</table>");
		        }
		        
		       // out.println("<form action='http://localhost:8080/EmployeeReimbursementSystem/Employee.html'> <input type='submit' value='Back to Home'></form> ");
		        out.println("</center>");
		        out.println("</body>");
		        
		        out.println("<br>");
		        out.println("<a href='employee.jsp'>Back to Home Page</a>");
		    }
		    
		
	
	}


