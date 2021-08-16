package com.project.ers.dao;

import java.util.List;

import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;

public interface LoginValidationDao {
	
	public int loginValidate(EmployeeLogin employeeLogin);

}
