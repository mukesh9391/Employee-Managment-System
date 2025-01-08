package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails 
{
	@Id
	@Column(name = "Employee_Id")
private int empid;
	@Column(name = "Employee_Name",nullable = false)
private String empname;
private double empsalary;
@Column(name = "Employee_Mobile_Number",unique = true,nullable = false,length = 10)
private long empmobilenumber;
@Column(unique = true,nullable = false)
private String empemailid;
private int empdeptno;

public EmployeeDetails()
{
	
}

public EmployeeDetails(int empid, String empname, double empsalary, long empmobilenumber, String empemailid,
		int empdeptno) 
{
	this.empid = empid;
	this.empname = empname;
	this.empsalary = empsalary;
	this.empmobilenumber = empmobilenumber;
	this.empemailid = empemailid;
	this.empdeptno = empdeptno;
}

@Override
public String toString() {
	return "EmployeeDetails [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary
			+ ", empmobilenumber=" + empmobilenumber + ", empemailid=" + empemailid + ", empdeptno=" + empdeptno + "]";
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public double getEmpsalary() {
	return empsalary;
}

public void setEmpsalary(double empsalary) {
	this.empsalary = empsalary;
}

public long getEmpmobilenumber() {
	return empmobilenumber;
}

public void setEmpmobilenumber(long empmobilenumber) {
	this.empmobilenumber = empmobilenumber;
}

public String getEmpemailid() {
	return empemailid;
}

public void setEmpemailid(String empemailid) {
	this.empemailid = empemailid;
}

public int getEmpdeptno() {
	return empdeptno;
}

public void setEmpdeptno(int empdeptno) {
	this.empdeptno = empdeptno;
}

}
