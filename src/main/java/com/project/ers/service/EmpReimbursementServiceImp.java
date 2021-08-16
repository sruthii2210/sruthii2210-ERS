package com.project.ers.service;

import java.util.List;

import com.project.ers.dao.EmpReimbursementDao;
import com.project.ers.dao.EmpReimbursementDaoImp;
import com.project.ers.dto.EmpReimbursement;
import com.project.ers.entity.EmpReimbursementEntity;

public class EmpReimbursementServiceImp implements EmpReimbursementService{

	
	EmpReimbursementDao empReimbursementDao=new EmpReimbursementDaoImp();
	public int sendReimbursement(EmpReimbursement empReimbursement,String email)
	{
		int status=empReimbursementDao.sendReimbursement(empReimbursement,email);
		return status;
	}
	
	public int setApproval(EmpReimbursement e)
	
	{
		int status=empReimbursementDao.setApproval( e);
		return status;
	}
	
	public int setDeny(EmpReimbursement e)
	
	{
		int status=empReimbursementDao.setDeny(e);
		return status;
	}
	
	
	@Override
	public List<EmpReimbursementEntity> viewReimbursement(String email) {
	
		//EmpReimbursementEntity empReimbursementEntity=new EmpReimbursementEntity();
		
		List<EmpReimbursementEntity>empReimbursement;
		
		empReimbursement=empReimbursementDao.viewReimbursement(email);
		
		return empReimbursement;
	}
	
	
	
	@Override
	public List<EmpReimbursementEntity> viewPendingRequests(String email) {
		
     List<EmpReimbursementEntity>empReimbursement;
		
		empReimbursement=empReimbursementDao.viewPendingRequests(email);
		
		return empReimbursement;
	}
	@Override
	public List<EmpReimbursementEntity> viewApprovedRequests(String email) {
		
		List<EmpReimbursementEntity>empReimbursement;
		
		empReimbursement=empReimbursementDao.viewApprovedRequests(email);
		
		return empReimbursement;
	}
	
	public List<EmpReimbursementEntity> viewApprovedRequests() {
		
		List<EmpReimbursementEntity>empReimbursement;
		
		empReimbursement=empReimbursementDao.viewApprovedRequests();
		
		return empReimbursement;
	}
	@Override
	public List<EmpReimbursementEntity> viewDeniedRequests(String email) {
		List<EmpReimbursementEntity>empReimbursement;
		
		empReimbursement=empReimbursementDao.viewDeniedRequests(email);
		
		return empReimbursement;
		
	}
	
	public List<EmpReimbursementEntity> viewDeniedRequests() {
		List<EmpReimbursementEntity>empReimbursement;
		
		empReimbursement=empReimbursementDao.viewDeniedRequests();
		
		return empReimbursement;
		
	}
	public List<EmpReimbursementEntity> viewPendingRequests() {
		
	     List<EmpReimbursementEntity>empReimbursement;
			
			empReimbursement=empReimbursementDao.viewPendingRequests();
			
			return empReimbursement;
		}
	
	
	public List<EmpReimbursementEntity>viewReimbId(String reimbId)
	{
		List<EmpReimbursementEntity>empReimbursement;
		
		empReimbursement=empReimbursementDao.viewReimbId(reimbId);
		
		return empReimbursement;
	}
}
