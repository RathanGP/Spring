package com.jsp.Spring.Product.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jsp.Spring.Product.entity.Product;

@Repository
public class ProductRepository 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql_config");
	
	
	public void addProduct(Product product)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(product);
		
		et.commit();
		em.close();
	}
	public void findProduct(int productId)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Product product=em.find(Product.class, productId);
		
		et.commit();
		em.close();
	}
	public void updateProduct(Product product)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.merge(product);
		
		et.commit();
		em.close();
	}
	

}
