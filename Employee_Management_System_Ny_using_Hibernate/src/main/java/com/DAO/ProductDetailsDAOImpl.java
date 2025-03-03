package com.DAO;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.EmployeeDetails;


public class ProductDetailsDAOImpl implements ProductDetailsDAO
{
    Scanner sc  = new Scanner(System.in);
	@Override
	public void insertProductDetails() 
	{
		com.entity.ProductDetails productDetails = new com.entity.ProductDetails();
		System.out.println("Enter Product Name");
		productDetails.setProductName(sc.next());
		System.out.println("Enter Product Price");
		productDetails.setPrice(sc.nextDouble());
		System.out.println("Enter Product Discount");
		productDetails.setDiscount(sc.nextDouble());
		System.out.println("Enter Product Quantity");
		productDetails.setQuantity(sc.nextInt());
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(productDetails);
		System.out.println("Data Inserted");
		//step-5)Perform Operation
		 	/* Insetion
		 	 * Updation
		 	 * Deletion
		 	 * Selection
		 	 * */
		//step-5)commit the Transaction
		 	entityTransaction.commit();
		//step-7)close the connection
		 	entityManager.close();
		//step-8)close the EntityManagerFactory
		 	entityManagerFactory.close();
		
	}
	@Override
	public void selectProductDetailsByUsingDiscount() 
	{
		String select = "select pro from ProductDetails pro where pro.discount>50";
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	 	EntityTransaction entityTransaction = entityManager.getTransaction();
	 	entityTransaction.begin();
	 	Query query = entityManager.createQuery(select);
	 	System.out.println(query);
	 	 List<EmployeeDetails> list =  query.getResultList();
	 	 if(list.size()!=0)
	 	 {
	 	 System.out.println(list);
	 	 }
	 	 else
	 	 {
	 		 System.out.println("No product Found");
	 	 }
	}
	@Override
	public void displayProductDetailsByusingNameStartWithS() 
	{
		
		String select = "select pro from ProductDetails pro where pro.productName like 's%'";
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	 	EntityTransaction entityTransaction = entityManager.getTransaction();
	 	entityTransaction.begin();
	 	Query query = entityManager.createQuery(select);
	 	System.out.println(query);
	 	 List<EmployeeDetails> list =  query.getResultList();
	 	 if(list.size()!=0)
	 	 {
	 	 System.out.println(list);
	 	 }
	 	 else
	 	 {
	 		 System.out.println("No product Found");
	 	 }
	}
	@Override
	public void displayProductDetailsByUsingPrice() 
	{
		String select = "select pro from ProductDetails pro where pro.price between 10 and 100";
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	 	EntityTransaction entityTransaction = entityManager.getTransaction();
	 	entityTransaction.begin();
	 	Query query = entityManager.createQuery(select);
	 	System.out.println(query);
	 	 List<EmployeeDetails> list =  query.getResultList();
	 	 if(list.size()!=0)
	 	 {
	 	 System.out.println(list);
	 	 }
	 	 else
	 	 {
	 		 System.out.println("No product Found");
	 	 }
		
	}

}
