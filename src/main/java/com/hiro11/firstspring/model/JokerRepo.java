package com.hiro11.firstspring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class JokerRepo {
	@PersistenceContext
	private EntityManager em;
	
	//Method ดึงข้อมูล
	public List<Joker> findAll(){
			Query q = em.createQuery("from Joker");
			return q.getResultList();
	}
	
}
