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


public class ApprovedRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    PrintWriter out=response.getWriter();
        Cookie c[]=request.getCookies();
        String userName=c[0].getValue();
        out.println("<body>");
        out.println("<center>");
        out.println("Approved Requests of "+userName);
        EmpReimbursementService reimbRequest = new EmpReimbursementServiceImp();
        
        List<EmpReimbursementEntity> approved =reimbRequest.viewApprovedRequests(userName);
     
       
        for(EmpReimbursementEntity r: approved)
        {
            System.out.println(r.getReimbursementId());
            System.out.println(r.getReimbursementType());
            System.out.println(r.getEmpEmail().getEmail());
            System.out.println(r.getPrice());
            System.out.println(r.getDate());
            System.out.println(r.getStatus());
        }
        out.println("<table border='2'>");
        out.println("<tr>");
        out.println("<td>Reimbursement ID</td><td>Reimbursement Type</td><td>Reimbursement Email</td><td>Reimbursement Price</td><td>Reimbursement Date</td><td>Reimbursement Status</td>");
        out.println("</tr>");

        
      for(EmpReimbursementEntity list :approved)
      {
    	  out.println("<tr>");
          out.println("<td>"+list.getReimbursementId()+"</td>");
          out.println("<td>"+list.getReimbursementType()+"</td>");
          out.println("<td>"+list.getEmpEmail().getEmail()+"</td>");
          out.println("<td>"+list.getPrice()+"</td>");
          out.println("<td>"+list.getDate()+"</td>");
          out.println("<td>"+list.getStatus()+"</td>");
          out.println("<tr>");
      }
        
        out.println("</table>");
       // out.println("<form action='http://localhost:8080/EmployeeReimbursementSystem/Employee.html'> <input type='submit' value='Back to Home'></form> ");
        out.println("</center>");
        out.println("</body>");
        
        out.println("<br>");
        out.println("<a href='employee.jsp'>Back to Home Page</a>");
    }
	
	}



