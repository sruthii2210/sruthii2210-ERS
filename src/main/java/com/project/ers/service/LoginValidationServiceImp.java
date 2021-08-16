package com.project.ers.service;

import java.util.List;

import com.project.ers.dao.LoginValidationDao;
import com.project.ers.dao.LoginValidationDaoImp;
import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;

public class LoginValidationServiceImp implements LoginValidationService {

	
	LoginValidationDao loginValidationDao=new LoginValidationDaoImp();
	public int loginValidate(EmployeeLogin employeeLogin)
	{
		
		int result=loginValidationDao.loginValidate(employeeLogin);
		
		return result;
	}
}

