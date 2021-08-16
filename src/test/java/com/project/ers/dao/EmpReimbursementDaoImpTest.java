package com.project.ers.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.project.ers.dto.EmpReimbursement;
import com.project.ers.entity.EmpReimbursementEntity;

class EmpReimbursementDaoImpTest {

	
	EmpReimbursementDao emp=new EmpReimbursementDaoImp();
	EmpReimbursement e=new EmpReimbursement();

	@Test
	void testViewPendingRequests() {
		List<EmpReimbursementEntity> empReimbursement = new ArrayList<EmpReimbursementEntity>();
		empReimbursement=emp.viewPendingRequests();
		assertNotNull(empReimbursement);
	}


	@Test
	void testViewApprovedRequests() {
		List<EmpReimbursementEntity> empReimbursement = new ArrayList<EmpReimbursementEntity>();
		empReimbursement=emp.viewApprovedRequests();
		assertNotNull(empReimbursement);
	}

	@Test
	void testViewDeniedRequests() {
		List<EmpReimbursementEntity> empReimbursement = new ArrayList<EmpReimbursementEntity>();
		empReimbursement=emp.viewDeniedRequests();
		assertNotNull(empReimbursement);
	}

	@Test
	void testSetApproval() {
		int flag=emp.setApproval(e);
		assertNotNull(flag);
	}

	@Test
	void testSetDeny() {
		int flag=emp.setDeny(e);
		assertNotNull(flag);
	}

}
