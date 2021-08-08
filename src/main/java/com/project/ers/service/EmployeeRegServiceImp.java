package com.project.ers.service;

import com.project.ers.dao.EmployeeRegDaoImp;
import com.project.ers.dto.EmployeeReg;

public class EmployeeRegServiceImp implements EmployeeRegService {

	EmployeeRegDaoImp employeeDao=new EmployeeRegDaoImp();
	
	public int addEmployee(EmployeeReg e) {
		 int flag=employeeDao.addEmployee(e);
		 return flag;
		 
	 }
}
