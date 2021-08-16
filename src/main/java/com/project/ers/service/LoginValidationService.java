package com.project.ers.service;

import java.util.List;

import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;

public interface LoginValidationService {
	
	public int loginValidate(EmployeeLogin employeeLogin);

}
