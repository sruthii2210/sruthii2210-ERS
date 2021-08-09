package com.project.ers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeeLogin")
public class EmployeeLoginEntity {

	@Id
	@OneToOne(mappedBy="email")
	   private String username;
	
	@Column(nullable=false)
	   private String pwd;
		
		@Column(nullable=false)
		private String confirmPwd;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
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
