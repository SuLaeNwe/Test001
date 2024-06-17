package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentMain {
	public static void main(String args[]) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("jpatest");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
//		
//		Student s1=new Student();
//		s1.setName("Ag Ag");
//		Student s2=new Student();
//		s2.setName("Ma Ma");
//		
//		em.persist(s1);
//		em.persist(s2);

		
		Student s = em.find(Student.class, 3);
//		
//		s.setName("AA");
//		em.merge(s);
//		
		em.remove(s);
		em.getTransaction().commit();
	}
}
