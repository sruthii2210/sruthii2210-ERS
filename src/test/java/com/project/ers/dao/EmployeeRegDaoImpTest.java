package com.project.ers.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmployeeRegEntity;

class EmployeeRegDaoImpTest {

	EmployeeRegDao emp=new EmployeeRegDaoImp();
	EmployeeReg e=new EmployeeReg();
	@Test
	void testAddEmployee() {
		int flag=emp.addEmployee(e);
		assertNotNull(flag);
	}

	
	@Test
	void testAllEmployeeDetailsServlet() {
		List<EmployeeRegEntity>employeeRegEntity=new ArrayList<EmployeeRegEntity>();
		employeeRegEntity=emp.AllEmployeeDetailsServlet();
		assertNotNull(employeeRegEntity);
	}

	@Test
	void testUpdateDetails() {
		int flag=emp.updateDetails(e);
		assertNotNull(flag);
	}

}
