package com.DAO;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.EmployeeDetails;
import com.entity.StudentDetails;

public class StudentDetailsDAOImpl implements StudentDetailsDAO
{

	@Override
	public void insertStudentDetails() 
	{
		Scanner sc = new Scanner(System.in);
		StudentDetails studentDetails = new StudentDetails();
		System.out.println("Enter Student Name");
		studentDetails.setStuName(sc.next());
		System.out.println("Enter Student percentage ");
		studentDetails.setStuPercentage(sc.nextDouble());
		System.out.println("Enter Student mobile Number");
		studentDetails.setStiMobileNumber(sc.nextLong());
		System.out.println("Enter Student branch ");
		studentDetails.setStuBranch(sc.next());
		System.out.println("Enter Student Email");
		studentDetails.setEmailid(sc.next());
		System.out.println("Enter Student Password");
		studentDetails.setPassword(sc.next());
		System.out.println("Enter Student Gender");
		studentDetails.setGender(sc.next());
		
		//step-1)Load the Persistance.xml file
		 EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		//step-2)Establish  the connection
		//step-3)create platform
		 	EntityManager entityManager = entityManagerFactory.createEntityManager();
		 	
		 	EntityTransaction entityTransaction = entityManager.getTransaction();
		//step-4)Begin the transaction 
		 	entityTransaction.begin();
		 	entityManager.persist(studentDetails);
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
	public void selectStudentDetailsByUsingStream() 
	{
		String select = "select stu from StudentDetails stu where stu.stuBranch= 'cse'";
		  EntityManagerFactory entityManagerFactory =   Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
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
		 		 System.out.println("No student Found");
		 	 }
	}

}
