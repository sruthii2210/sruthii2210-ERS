package com.project.ers.service;

import com.project.ers.dao.EmployeeLoginDao;
import com.project.ers.dao.EmployeeLoginDaoImp;
import com.project.ers.dto.EmployeeLogin;


public class EmployeeLoginServiceImp implements EmployeeLoginService{
	
	EmployeeLoginDaoImp employeeLoginDao=new EmployeeLoginDaoImp();
	
	public int addEmpLogin(EmployeeLogin e) {
		 int flag=employeeLoginDao.addEmpLogin(e);
		 return flag;
		 
	 }
	
	public int newEmpLogin(EmployeeLogin e) {
		 int flag=employeeLoginDao.newEmpLogin(e);
		 return flag;
		 
	 }

}
