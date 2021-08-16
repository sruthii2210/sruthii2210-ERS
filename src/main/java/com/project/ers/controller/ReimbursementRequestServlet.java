package com.project.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.protobuf.TextFormat.ParseException;
import com.project.ers.dto.EmpReimbursement;
import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.service.EmpReimbursementService;
import com.project.ers.service.EmpReimbursementServiceImp;
import com.project.ers.service.LoginValidationService;
import com.project.ers.service.LoginValidationServiceImp;


public class ReimbursementRequestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out=response.getWriter();
		String ReimbursementId=request.getParameter("reimbId");
   		String ReimbursementType=request.getParameter("type");
   		String reimbPrice=request.getParameter("price");
   		System.out.println("In servlet"+ReimbursementId+" "+ReimbursementType+" "+reimbPrice);
   		double ReimbursementPrice=Double.parseDouble(reimbPrice);
   		
   		String ReimbursementDate=request.getParameter("date");
   		
   		System.out.println("In servlet"+ReimbursementId+" "+ReimbursementType+" "+ReimbursementPrice+" "+ReimbursementDate);
   		
   		
   		
   		Cookie reimbUserName[]=request.getCookies();
   		out.println(reimbUserName[0].getValue());
   		String email=reimbUserName[0].getValue();
   		
   		
   		EmpReimbursement reimbursement=new EmpReimbursement();
   		reimbursement.setReimbursementId(ReimbursementId);
   		reimbursement.setReimbursementType(ReimbursementType);
   		reimbursement.setPrice(ReimbursementPrice);
   		reimbursement.setDate(ReimbursementDate);
   		reimbursement.setStatus("pending");
   		
   	 EmpReimbursementService empReimbursementService= new EmpReimbursementServiceImp();
   	 
   	 int status=0;
   	 
   	 status=empReimbursementService.sendReimbursement(reimbursement,email);
	
	}

}
