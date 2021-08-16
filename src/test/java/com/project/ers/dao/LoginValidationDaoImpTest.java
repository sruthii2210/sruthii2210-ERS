package com.project.ers.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.project.ers.dto.EmployeeLogin;

class LoginValidationDaoImpTest {

	LoginValidationDao login=new LoginValidationDaoImp();
	EmployeeLogin e=new EmployeeLogin();
	@Test
	void testLoginValidate() {
		int flag=login.loginValidate(e);
		assertNotNull(flag);
	}

}
