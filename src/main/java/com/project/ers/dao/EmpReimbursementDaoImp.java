package com.project.ers.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.project.ers.Util.HibernateUtil;
import com.project.ers.dto.EmpReimbursement;
import com.project.ers.entity.EmpReimbursementEntity;
import com.project.ers.entity.EmployeeLoginEntity;
import com.project.ers.entity.EmployeeRegEntity;
import com.project.ers.mapper.EmpReimbursementMapper;
import com.project.ers.mapper.EmployeeLoginMapper;
import com.project.ers.mapper.EmployeeMapper;

public class EmpReimbursementDaoImp implements EmpReimbursementDao {

	public int sendReimbursement(EmpReimbursement empReimbursement, String email) {

		int flag = 0;
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			String result = null;
			result = (String) session.save(EmpReimbursementMapper.mapEmpReimbursement(empReimbursement, email));
			if (result != null) {
				flag = 1;
				System.out.println("Request is sent");
			} else
				System.out.println("err");

			session.getTransaction().commit();

		} catch (Exception e1) {

			e1.printStackTrace();
		}
		return flag;

	}

	public List<EmpReimbursementEntity> viewReimbursement(String user) {

		List<EmpReimbursementEntity> empReimbursement = new ArrayList<EmpReimbursementEntity>();

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			// session.beginTransaction();
			System.out.println("string is " + user);
			Query query = session.createQuery("from EmpReimbursementEntity e where email=:username");
			query.setParameter("username", user);
			empReimbursement = query.list();
			System.out.println(empReimbursement.size());

			System.out.println(empReimbursement);
		}

		catch (Exception e1) {

			e1.printStackTrace();
		}

		return empReimbursement;

	}

	@Override
	public List<EmpReimbursementEntity> viewPendingRequests(String email) {

		List<EmpReimbursementEntity> empReimbursement = new ArrayList<EmpReimbursementEntity>();

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			// session.beginTransaction();
			System.out.println("string is " + email);
			Query query = session
					.createQuery("from EmpReimbursementEntity e where email=:username and status=:statusType");
			query.setParameter("username", email);
			query.setParameter("statusType", "pending");
			empReimbursement = query.list();
			System.out.println(empReimbursement);

		}

		catch (Exception e1) {

			e1.printStackTrace();
		}

		return empReimbursement;
	}
	
	public List<EmpReimbursementEntity> viewPendingRequests() {

		List<EmpReimbursementEntity> empReimbursement = new ArrayList<EmpReimbursementEntity>();

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			// session.beginTransaction();
		
			Query query = session.createQuery("from EmpReimbursementEntity where status=:statusType");
		
			query.setParameter("statusType", "pending");
			empReimbursement = query.list();
			System.out.println(empReimbursement);

		}

		catch (Exception e1) {

			e1.printStackTrace();
		}

		return empReimbursement;
	}

	@Override
	public List<EmpReimbursementEntity> viewApprovedRequests(String email) {
		EmpReimbursementEntity empReimbursementEntity = new EmpReimbursementEntity();
		List<EmpReimbursementEntity> empReimbursement = new ArrayList<>();

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			// session.beginTransaction();
			System.out.println("string is " + email);
			Query query = session
					.createQuery("from EmpReimbursementEntity e where email=:username and status=:statusType");
			query.setParameter("username", email);
			query.setParameter("statusType", "approved");
			empReimbursement = query.list();
			System.out.println(empReimbursement);

		}

		catch (Exception e1) {

			e1.printStackTrace();
		}

		return empReimbursement;
	}
	
	public List<EmpReimbursementEntity> viewApprovedRequests() {
		EmpReimbursementEntity empReimbursementEntity = new EmpReimbursementEntity();
		List<EmpReimbursementEntity> empReimbursement = new ArrayList<>();

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			// session.beginTransaction();
			Query query = session.createQuery("from EmpReimbursementEntity e where status=:statusType");
			
			query.setParameter("statusType", "approved");
			empReimbursement = query.list();
			

		}

		catch (Exception e1) {

			e1.printStackTrace();
		}

		return empReimbursement;
	}

	@Override
	public List<EmpReimbursementEntity> viewDeniedRequests(String email) {

		EmpReimbursementEntity empReimbursementEntity = new EmpReimbursementEntity();
		List<EmpReimbursementEntity> empReimbursement = new ArrayList<>();

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
		
			System.out.println("string is " + email);
			Query query = session
					.createQuery("from EmpReimbursementEntity e where email=:username and status=:statusType");
			query.setParameter("username", email);
			query.setParameter("statusType", "denied");
			empReimbursement = query.list();
			System.out.println(empReimbursement);

		}

		catch (Exception e1) {

			e1.printStackTrace();
		}

		return empReimbursement;
	}

	
	public List<EmpReimbursementEntity> viewDeniedRequests() {

		
		List<EmpReimbursementEntity> empReimbursement = new ArrayList<>();

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			
			Query query = session.createQuery("from EmpReimbursementEntity e where status=:statusType");
			
			query.setParameter("statusType", "denied");
			empReimbursement = query.list();

		}

		catch (Exception e1) {

			e1.printStackTrace();
		}

		return empReimbursement;
	}

	

	@Override
	public List<EmpReimbursementEntity> viewReimbId(String reimbId) {

		List<EmpReimbursementEntity> empReimbursement = new ArrayList<EmpReimbursementEntity>();

		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			// session.beginTransaction();

			Query query = session.createQuery("from EmpReimbursementEntity where reimbursementId=:id");
			query.setParameter("id", reimbId);
			empReimbursement = query.getResultList();
		}

		catch (Exception e1) {

			e1.printStackTrace();
		}

		return empReimbursement;

	}

	@Override
	public int setApproval(EmpReimbursement emp) {

		int flag = 0;

		try {
//			
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query query = session.createQuery("Update EmpReimbursementEntity set status=:type where reimbursementId=:rid");
			query.setParameter("type", "approved");
			query.setParameter("rid", emp.getReimbursementId());
			flag = query.executeUpdate();
			session.getTransaction().commit();
			session.close();
			

		} catch (Exception e1) {

			e1.printStackTrace();
		}

		return flag;

	}

	public int setDeny(EmpReimbursement emp) {

		int flag = 0;

		try {
			System.out.println("In Dao-SetApproval-start");
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();

			Query query = session.createQuery("Update EmpReimbursementEntity set status=:type where reimbursementId=:rid");
			query.setParameter("type", "denied");
			query.setParameter("rid", emp.getReimbursementId());
			flag = query.executeUpdate();
			session.getTransaction().commit();
			session.close();

		} catch (Exception e1) {

			e1.printStackTrace();
		}

		return flag;

	}

}
