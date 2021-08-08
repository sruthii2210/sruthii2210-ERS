package com.project.ers.dao;

import org.hibernate.Session;

import com.project.ers.Util.HibernateUtil;
import com.project.ers.dto.EmployeeReg;
import com.project.ers.mapper.EmployeeMapper;


public class EmployeeRegDaoImp implements EmployeeRegDao {

	 public int addEmployee(EmployeeReg e) {
			
		 int flag=0;
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();  
				String result=null;
				result=(String)session.save(EmployeeMapper.mapEmployeeReg(e));
				if(result!=null)
				{
					flag=1;
					System.out.println("Registered successfully");
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
