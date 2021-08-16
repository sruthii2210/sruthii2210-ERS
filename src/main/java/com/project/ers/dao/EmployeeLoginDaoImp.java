package com.project.ers.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.project.ers.Util.HibernateUtil;
import com.project.ers.dto.EmployeeLogin;
import com.project.ers.entity.EmployeeLoginEntity;
import com.project.ers.entity.EmployeeRegEntity;
import com.project.ers.mapper.EmployeeLoginMapper;
import com.project.ers.mapper.EmployeeMapper;

public class EmployeeLoginDaoImp implements EmployeeLoginDao{

	 public int addEmpLogin(EmployeeLogin e) {
			
		 int flag=0;
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();  
				int result=0;
				result=(Integer)session.save(EmployeeLoginMapper.mapEmployeeLogin(e));
				if(result!=0)
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

	@Override
	public int newEmpLogin(EmployeeLogin employeeLogin) {
		
		int flag=0;
		List<Integer>id=new ArrayList<Integer>();
		
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
			
			Query query=session.createSQLQuery("select id from employeeLogin where email=:mail ");
			query.setParameter("mail",employeeLogin.getUserName());
			id=query.getResultList();
			System.out.println("List "+id);
			
			EmployeeLoginEntity e=EmployeeLoginMapper.mapEmployeeLogin(employeeLogin);
			session.find(EmployeeLoginEntity.class, id.get(0));
			EmployeeLoginEntity empLogin=session.load(EmployeeLoginEntity.class,  id.get(0));
			
			
			empLogin.setPwd(employeeLogin.getPwd());
			empLogin.setConfirmPwd(employeeLogin.getConfirmPwd());
			session.merge(empLogin);
			session.flush();
			
			flag=1;
			session.getTransaction().commit();
			session.close();
			
		}
		catch (Exception e1) {
			
			e1.printStackTrace();
		}
		return flag;
}
}