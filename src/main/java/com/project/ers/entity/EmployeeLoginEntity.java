package com.project.ers.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeeLogin")
public class EmployeeLoginEntity {

	
	@OneToOne
	@JoinColumn(name="email",nullable=false,unique=true)
	
	   private EmployeeRegEntity username;
	
	@Column(nullable=false)
	   private String pwd;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	
		@Column(nullable=false)
		private String confirmPwd;

		

		public EmployeeRegEntity getUsername() {
			return username;
		}

		public void setUsername(EmployeeRegEntity username) {
			this.username = username;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getConfirmPwd() {
			return confirmPwd;
		}

		public void setConfirmPwd(String confirmPwd) {
			this.confirmPwd = confirmPwd;
		}

		
}
