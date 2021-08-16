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

public class DeniedRequestsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
        Cookie c[]=request.getCookies();
        String userName=c[0].getValue();
        out.println("<body>");
        out.println("<center>");
        EmpReimbursementService reimbRequest = new EmpReimbursementServiceImp();
        
        List<EmpReimbursementEntity> denied =reimbRequest.viewDeniedRequests(userName);
      
       
        for(EmpReimbursementEntity r: denied)
        {
            System.out.println(r.getReimbursementId());
            System.out.println(r.getReimbursementType());
            System.out.println(r.getEmpEmail().getEmail());
            System.out.println(r.getPrice());
            System.out.println(r.getDate());
            System.out.println(r.getStatus());
        }
        
        out.println("Denied Requests of"+userName);
        
        for(EmpReimbursementEntity list :denied)
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
	
	}

}
