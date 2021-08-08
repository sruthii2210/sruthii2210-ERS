package com.project.ers.dao;

import org.hibernate.Session;

import com.project.ers.Util.HibernateUtil;
import com.project.ers.dto.EmployeeLogin;

import com.project.ers.mapper.EmployeeLoginMapper;

public class EmployeeLoginDaoImp implements EmployeeLoginDao{

	 public int addEmpLogin(EmployeeLogin e) {
			
		 int flag=0;
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();  
				String result=null;
				result=(String)session.save(EmployeeLoginMapper.mapEmployeeLogin(e));
				if(result!=null)
				{
					flag=1;
					System.out.println("Password created..");
				}
				else
					System.out.println("err");
				
				session.getTransaction().commit();
				
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			return flag;
}
}
