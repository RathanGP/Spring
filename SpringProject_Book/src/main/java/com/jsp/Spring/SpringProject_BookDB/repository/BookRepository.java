package com.jsp.Spring.SpringProject_BookDB.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jsp.Spring.SpringProject_BookDB.entity.Book;

@Repository
public class BookRepository 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql_config");
	
	public  void addBook(Book book)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(book);
		et.commit();
		em.close();
	}
	public  Book findBookById(int bookId)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Book book = em.find(Book.class,bookId);
		et.commit();
		em.close();
		return book;
	}
	public  void updateBook(Book book)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(book);
		et.commit();
		em.close();
	}
	public  void deleteBook(int bookById)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Book book = em.find(Book.class, bookById);
		et.begin();
		em.remove(book);
		et.commit();
		em.close();
	}
	
}
