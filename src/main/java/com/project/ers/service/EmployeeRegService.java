package com.project.ers.service;

import java.util.List;

import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmployeeRegEntity;

public interface EmployeeRegService {

	public int addEmployee(EmployeeReg employeeReg);
	
	public List<EmployeeRegEntity> viewEmpDetails(String email);
	
	public List<EmployeeRegEntity>AllEmployeeDetailsServlet();
	
	public int updateDetails(EmployeeReg employeeReg);
}
