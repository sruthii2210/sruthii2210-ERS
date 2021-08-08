package com.project.ers.mapper;

import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;


public class EmployeeLoginMapper {

	public static EmployeeLoginEntity mapEmployeeLogin(EmployeeLogin e) {
		
		EmployeeLoginEntity entity=new EmployeeLoginEntity();
		
		          entity.setUsername(e.getUserName());
		          entity.setPwd(e.getPwd());
		          entity.setConfirmPwd(e.getConfirmPwd());
				
					return entity;
	}
}
