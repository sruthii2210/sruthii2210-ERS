package com.project.ers.service;

import java.util.List;

import com.project.ers.dao.EmployeeRegDaoImp;
import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmployeeRegEntity;

public class EmployeeRegServiceImp implements EmployeeRegService {

	EmployeeRegDaoImp employeeDao=new EmployeeRegDaoImp();
	
	public int addEmployee(EmployeeReg e) {
		 int flag=employeeDao.addEmployee(e);
		 return flag;
		 
	 }
	
	public List<EmployeeRegEntity> viewEmpDetails(String email) {
		List<EmployeeRegEntity>e=employeeDao.viewEmpDetails(email);
		 return e;
		 
	 }

	@Override
	public List<EmployeeRegEntity> AllEmployeeDetailsServlet() {
		 List<EmployeeRegEntity>e=employeeDao.AllEmployeeDetailsServlet();
		return e;
	}
	
	
	public int updateDetails(EmployeeReg employeeReg)
	{
		int flag=employeeDao.updateDetails(employeeReg);
		 return flag;
	}
}
