package com.project.ers.mapper;

import com.project.ers.dto.EmpReimbursement;
import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.entity.EmployeeRegEntity;

public class EmpReimbursementMapper {

	public static EmpReimbursementEntity mapEmpReimbursement(EmpReimbursement empReimbursement,String email)
	{

		
		EmpReimbursementEntity empReimbursementEntity=new EmpReimbursementEntity();
		empReimbursementEntity.setReimbursementId(empReimbursement.getReimbursementId());
		empReimbursementEntity.setReimbursementType(empReimbursement.getReimbursementType());
		  EmployeeRegEntity employeeRegEntity=new EmployeeRegEntity();
		  employeeRegEntity .setEmail(email);
	         empReimbursementEntity.setEmpEmail(employeeRegEntity);
	         
	         empReimbursementEntity.setPrice(empReimbursement.getPrice());
	         empReimbursementEntity.setDate(empReimbursement.getDate());
	         empReimbursementEntity.setStatus(empReimbursement.getStatus());
	         
	         return empReimbursementEntity;
	
	}
	
}
