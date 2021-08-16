package com.project.ers.mapper;

import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;
import com.project.ers.entity.EmployeeRegEntity;


public class EmployeeLoginMapper {

	public static EmployeeLoginEntity mapEmployeeLogin(EmployeeLogin e) {
		
		EmployeeLoginEntity entity=new EmployeeLoginEntity();
		
		         EmployeeRegEntity e1=new EmployeeRegEntity();
		        // System.out.println("Start of Mapper");
		         
		         e1.setEmail(e.getUserName());
		         entity.setUsername(e1);
		          entity.setPwd(e.getPwd());
		          entity.setConfirmPwd(e.getConfirmPwd());
		          
		          //System.out.println("End of Mapper");
		         
					return entity;
	}
	
	
	
}
