package com.project.ers.dto;

import java.util.Date;

public class EmpReimbursement {

	private String reimbursementId;
	private String reimbursementType;
	private Double price;
	private String date;
	private String email;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReimbursementId() {
		return reimbursementId;
	}
	public void setReimbursementId(String reimbursementId) {
		this.reimbursementId = reimbursementId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getReimbursementType() {
		return reimbursementType;
	}
	public void setReimbursementType(String reimbursementType) {
		this.reimbursementType = reimbursementType;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
