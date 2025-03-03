package com;

import java.util.Scanner;

import com.DAO.EmployeeDetailsDAO;
import com.DAO.EmplyeeDetailsImpl;
import com.DAO.ProductDetailsDAO;
import com.DAO.ProductDetailsDAOImpl;
import com.DAO.StudentDetailsDAO;
import com.DAO.StudentDetailsDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDetailsDAO employeeDetailsDAO = new EmplyeeDetailsImpl();
    	Scanner sc = new Scanner(System.in);
        boolean cond = true;

        while (cond) {
                System.out.println("Enter :\n 1) User Registration \n 2) User Login \n 3) User Update \n 4) User Delete \n 5) Close");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1: 
                    employeeDetailsDAO.insertEmployeeDetails();
                    break;
                case 2: 
                    employeeDetailsDAO.selectEmployeeDetailsByUsingDeptNo();
                    break;
                case 3: 
                    employeeDetailsDAO.updateEmployeeDetailsByusingId();
                    break;
                case 4: 
                    employeeDetailsDAO.deleteEmployeeDetailsByUsingId();
                    break;
                case 5:
                    cond = false; 
                    break;
                default:
                    System.out.println("Enter a valid option.");
                    break;
            }
        } 
        }
}
