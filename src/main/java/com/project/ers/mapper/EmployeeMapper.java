package com.project.ers.mapper;

import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmployeeRegEntity;

public class EmployeeMapper {

	public static EmployeeRegEntity mapEmployeeReg(EmployeeReg e) {
			
		EmployeeRegEntity entity=new EmployeeRegEntity();
		
		           entity.setName(e.getName());	
		           entity.setDob(e.getDob());
		           entity.setEmail(e.getEmail());
		           entity.setAddress(e.getAddress());
		           entity.setPhnNo(e.getPhnNo());
		           entity.setGender(e.getGender());
		           entity.setType(e.getType());
				
					return entity;
					
	
	}
}
