package com.project.ers.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empReimbursement")
public class EmpReimbursementEntity {
	
	@ManyToOne
	@JoinColumn(name="email", nullable=false)
	private EmployeeRegEntity empEmail; 
	
	
	public EmployeeRegEntity getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(EmployeeRegEntity empEmail) {
		this.empEmail = empEmail;
	}
	@Id
	private String reimbursementId;
	@Column(nullable=false)
	private String reimbursementType;
	@Column(nullable=false)
	private Double price;
	@Column(nullable=false)
	private String date;
	@Column(nullable=false)
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
	@Override
	public String toString() {
		return "EmpReimbursementEntity [ reimbursementId=" + reimbursementId
				+ ", reimbursementType=" + reimbursementType + ", price=" + price + ", date=" + date + ", status="
				+ status + "]";
	}
	
	
	

	

}
