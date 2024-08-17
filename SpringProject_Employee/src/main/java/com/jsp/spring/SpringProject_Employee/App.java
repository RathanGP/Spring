package com.jsp.spring.SpringProject_Employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
       Employee employee1=(Employee) ac.getBean("employee1-bean");
       Employee employee2=(Employee) ac.getBean("employee2-bean");
       Employee employee3=(Employee) ac.getBean("employee3-bean");
       Employee employee4=(Employee) ac.getBean("employee4-bean");

       
       Project project1=(Project) ac.getBean("project1-bean");
       Project project2=(Project) ac.getBean("project2-bean");
       Project project3=(Project) ac.getBean("project3-bean");
       Project project4=(Project) ac.getBean("project4-bean");
       System.out.println(project1);

       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql_config");

   	
   	
   		EntityManager em = emf.createEntityManager();
   		EntityTransaction et = em.getTransaction();
   		et.begin();
   		
   		
   		
   		
   		em.persist(employee1);
   		em.persist(employee2);
   		em.persist(employee3);
   		em.persist(employee4);
   		em.persist(project1);
   		em.persist(project2);
   		em.persist(project3);
   		em.persist(project4);
   
   		
   		et.commit();
   		em.close();
   	
    }
}
