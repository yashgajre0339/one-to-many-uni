package com.jsp.HospitalBranch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestHospitalBranch {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("yash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Hospital hospital =new Hospital();
		hospital.setName("Apollo");
		hospital.setGst_no("apollo12345");
		
		Branch branch1=new Branch();
		branch1.setName("Apollo_1");
		branch1.setLocation("vashi");
		
		Branch branch2 =new Branch();
		branch2.setName("Apollo_2");
		branch2.setLocation("Thane");
		
		Branch branch3 =new Branch();
		branch3.setName("Apollo_3");
		branch3.setLocation("Panvel");
		
		List<Branch> branch =new ArrayList<Branch>();
		branch.add(branch1);
		branch.add(branch2);
		branch.add(branch3);
		//uni-direction
		hospital.setBranches(branch);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
	
	}

}
