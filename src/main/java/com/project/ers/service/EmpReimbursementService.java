package com.project.ers.service;

import java.util.List;

import com.project.ers.dto.EmpReimbursement;
import com.project.ers.entity.EmpReimbursementEntity;

public interface EmpReimbursementService {

	
	public int sendReimbursement(EmpReimbursement empReimbursement,String email);
	
	public List<EmpReimbursementEntity> viewReimbursement(String email);
	
	public List<EmpReimbursementEntity> viewPendingRequests(String email);
	public List<EmpReimbursementEntity> viewDeniedRequests(String email);
	
	public List<EmpReimbursementEntity> viewApprovedRequests(String email);
	
	public List<EmpReimbursementEntity> viewPendingRequests();
	public List<EmpReimbursementEntity> viewDeniedRequests();
	
	
	public List<EmpReimbursementEntity>viewReimbId(String reimbId);
	
	public List<EmpReimbursementEntity> viewApprovedRequests();
	public int setApproval(EmpReimbursement e);
	public int setDeny(EmpReimbursement e);
}
