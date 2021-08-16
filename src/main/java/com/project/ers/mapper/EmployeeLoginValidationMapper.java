package com.project.ers.mapper;

import com.project.ers.dto.EmployeeLogin;
import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmployeeLoginEntity;
import com.project.ers.entity.EmployeeRegEntity;

public class EmployeeLoginValidationMapper {

	
	public static EmployeeLoginEntity mapEmployeeLoginValid(EmployeeLogin e) {
	
	EmployeeLoginEntity entity=new EmployeeLoginEntity();
	
	EmployeeRegEntity regEntity=new EmployeeRegEntity();
	
	regEntity.setEmail(e.getUserName());
	entity.setUsername(regEntity);
	entity.setPwd(e.getPwd());
	
    
		return entity;
	}
}
