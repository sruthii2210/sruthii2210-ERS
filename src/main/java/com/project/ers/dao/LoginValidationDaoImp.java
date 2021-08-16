package com.project.ers.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.project.ers.Util.HibernateUtil;
import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;
import com.project.ers.mapper.EmployeeLoginValidationMapper;


public class LoginValidationDaoImp implements LoginValidationDao {
	
	 Logger logger=Logger.getLogger("LoginValidationDaoImp.class");
	 public int loginValidate(EmployeeLogin employeeLogin) {
			
		 logger.info("In Dao-LoginValidation");
		 List<EmployeeLoginEntity>empList=new ArrayList<>();
		 int flag=0;
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();  
			
				System.out.println("BeforeQuery");
				Query query= session.createQuery("from EmployeeLoginEntity ");
				
						//query.setParameter("username",loginEntity.getUsername());
						
				 empList=query.list();
				
				
				 
				System.out.println(employeeLogin.getUserName()+" "+employeeLogin.getPwd());
				 
				for(EmployeeLoginEntity object : empList)
				{
					
					if(object.getUsername().getEmail().equals(employeeLogin.getUserName())&&object.getPwd().equals(employeeLogin.getPwd()))
						{
						    flag=1;
						    System.out.println("Login successfully");
						}
					
				}
			
				if(flag==0)
				{
					System.out.println("Login failed");
				}
				//session.getTransaction().commit();
				
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			return flag;
}

}
