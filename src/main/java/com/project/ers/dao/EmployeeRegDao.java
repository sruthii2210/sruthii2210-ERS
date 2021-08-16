package com.project.ers.dao;

import java.util.List;

import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmployeeRegEntity;

public interface EmployeeRegDao {

	public int addEmployee(EmployeeReg employeeReg);
	
	public List<EmployeeRegEntity> viewEmpDetails(String email);
	
	public List<EmployeeRegEntity>AllEmployeeDetailsServlet();
	
	public int updateDetails(EmployeeReg employeeReg);
}
