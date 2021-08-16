package com.project.ers.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.project.ers.Util.HibernateUtil;
import com.project.ers.dto.EmployeeReg;
import com.project.ers.entity.EmployeeLoginEntity;
import com.project.ers.entity.EmployeeRegEntity;
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

	@Override
	public List<EmployeeRegEntity> viewEmpDetails(String email) {
		
		List<EmployeeRegEntity>employeeRegEntity=new ArrayList<EmployeeRegEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
		
			Query query=session.createQuery("from EmployeeRegEntity where email=:username");
			query.setParameter("username", email);
			
		
			employeeRegEntity=query.list();
		
			session.getTransaction().commit();
			
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		return employeeRegEntity;
		
		
	}

	@Override
	public List<EmployeeRegEntity> AllEmployeeDetailsServlet() {
		
List<EmployeeRegEntity>employeeRegEntity=new ArrayList<EmployeeRegEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
		
			Query query=session.createQuery("from EmployeeRegEntity where type=:empType");
			query.setParameter("empType", "Employee");
			employeeRegEntity=query.list();
		
		
			session.getTransaction().commit();
			
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		return employeeRegEntity;
	
	}

	@Override
	public int updateDetails(EmployeeReg employeeReg) {

		 int flag=0;
		 
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();  
				
				
				EmployeeRegEntity e=EmployeeMapper.mapEmployeeReg(employeeReg);
				session.find(EmployeeRegEntity.class, employeeReg.getEmail());
				EmployeeRegEntity empReg=session.load(EmployeeRegEntity.class, employeeReg.getEmail());
				
				empReg.setName(e.getName());
				empReg.setType(e.getType());
				empReg.setEmail(e.getEmail());
				empReg.setDob(e.getDob());
				empReg.setPhnNo(e.getPhnNo());
				empReg.setAddress(e.getAddress());
				empReg.setGender(e.getGender());
				
				session.merge(empReg);
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