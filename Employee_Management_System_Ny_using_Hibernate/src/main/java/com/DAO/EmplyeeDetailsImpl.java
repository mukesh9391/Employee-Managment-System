package com.DAO;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.EmployeeDetails;

public class EmplyeeDetailsImpl implements EmployeeDetailsDAO
{
	Scanner sc = new Scanner(System.in);
	@Override
	public void insertEmployeeDetails() 
	{
		EmployeeDetails employeeDetails = new EmployeeDetails();
		System.out.println("Enter Employee Name");
		employeeDetails.setEmpname(sc.next());
		System.out.println("Enter Employee Salary");
		employeeDetails.setEmpsalary(sc.nextDouble());
		System.out.println("Enter Employee Mobile Number");
		employeeDetails.setEmpmobilenumber(sc.nextLong());
		System.out.println("Enter Employee Email");
		employeeDetails.setEmpemailid(sc.next());
		System.out.println("Enter Employee DeptNo");
		employeeDetails.setEmpdeptno(sc.nextInt());
		
		//step-1)Load the Persistance.xml file
		 EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		//step-2)Establish  the connection
		//step-3)create platform
		 	EntityManager entityManager = entityManagerFactory.createEntityManager();
		 	
		 	EntityTransaction entityTransaction = entityManager.getTransaction();
		//step-4)Begin the transaction 
		 	entityTransaction.begin();
		 	entityManager.persist(employeeDetails);
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
	public void updateEmployeeDetailsByusingId() 
	{
		
		//step-1)Load the Persistance.xml file
		 EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		//step-2)Establish  the connection
		//step-3)create platform
		 	EntityManager entityManager = entityManagerFactory.createEntityManager();
		 	
		 	EntityTransaction entityTransaction = entityManager.getTransaction();
		//step-4)Begin the transaction 
		 	entityTransaction.begin();
		 	System.out.println("Enter Employee Id");
		 	EmployeeDetails employeeDetails = entityManager.find(EmployeeDetails.class, sc.nextInt());
		 	if(employeeDetails!=null)
		 	{
		 		System.out.println("Enter New Salary");
		 		employeeDetails.setEmpsalary(sc.nextDouble());
			 	System.out.println("update successfully");
		 	}
		 	else
		 	{
		 		System.out.println("No Data Found");
		 	}
		 	
		 	System.out.println(employeeDetails);
		 	
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
	public void deleteEmployeeDetailsByUsingId() 
	{
		
		//step-1)Load the Persistance.xml file
		 EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		//step-2)Establish  the connection
		//step-3)create platform
		 	EntityManager entityManager = entityManagerFactory.createEntityManager();
		 	
		 	EntityTransaction entityTransaction = entityManager.getTransaction();
		//step-4)Begin the transaction 
		 	entityTransaction.begin();
		 	System.out.println("Enter Employee Id");
		 	EmployeeDetails employeeDetails = entityManager.find(EmployeeDetails.class, sc.nextInt());
		 	if(employeeDetails!=null)
		 	{
		 		entityManager.remove(employeeDetails);
			 	System.out.println("deleted successfully");
		 	}
		 	else
		 	{
		 		System.out.println("No Data Found");
		 	}
		 	
		 	
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
	}

	@Override
	public void selectEmployeeDetailsByUsingMobileNumber() 
	{
		String select =  "select emp from EmployeeDetails emp where emp.empmobilenumber=9391296995";
		 EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Employee_Management_System_Ny_using_Hibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	 	EntityTransaction entityTransaction = entityManager.getTransaction();
	 	entityTransaction.begin();
	 	Query query = entityManager.createQuery(select);
	 	System.out.println(query);
	 	try {
			EmployeeDetails employeeDetails = (EmployeeDetails) query.getSingleResult();
			System.out.println(employeeDetails);
		} catch (Exception e) {
			System.out.println("No employee found");
		}
	 	
	 	}

	@Override
	public void selectEmployeeDetailsByUsingDeptNo() 
	{
		String select =  "select emp from EmployeeDetails emp where emp.empdeptno=30";
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
	 		 System.out.println("No Employee Found");
	 	 }
	}

}
