package com.project.ers.service;

import java.util.List;

import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;

public interface EmployeeLoginService {
	
	
	public int addEmpLogin(EmployeeLogin employeeLogin);
	
	public int newEmpLogin(EmployeeLogin employeeLogin);
	
}
