package com.project.ers.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.project.ers.dto.EmployeeLogin;

class EmployeeLoginDaoImpTest {
	EmployeeLoginDao emp=new EmployeeLoginDaoImp();
	EmployeeLogin e=new EmployeeLogin();

	@Test
	void testAddEmpLogin() {
		int flag=emp.addEmpLogin(e);
		assertNotNull(flag);
	}

	@Test
	void testNewEmpLogin() {
		int flag=emp.newEmpLogin(e);
		assertNotNull(flag);
	}

}
