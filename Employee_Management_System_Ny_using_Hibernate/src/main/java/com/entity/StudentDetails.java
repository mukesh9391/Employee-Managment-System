package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class StudentDetails 
{
	@Id
	@Column(name = "Student_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int stuid;
	@Column(name = "Student_Name",nullable = false)
private String stuName;
private String stuBranch;
private double stuPercentage;
@Column(name = "Student_Mobile_Number",unique = true,nullable = false,length = 10)
private long stiMobileNumber;
@Column(unique = true,nullable = false)
private String emailid;
private String password;
@Column(nullable = false)
private String gender;
public StudentDetails() {
	super();
}

public StudentDetails(int stuid, String stuName, String stuBranch, double stuPercentage, long stiMobileNumber,
		String emailid, String password, String gender) {
	super();
	this.stuid = stuid;
	this.stuName = stuName;
	this.stuBranch = stuBranch;
	this.stuPercentage = stuPercentage;
	this.stiMobileNumber = stiMobileNumber;
	this.emailid = emailid;
	this.password = password;
	this.gender = gender;
}

@Override
public String toString() {
	return "StudentDetails [stuid=" + stuid + ", stuName=" + stuName + ", stuBranch=" + stuBranch + ", stuPercentage="
			+ stuPercentage + ", stiMobileNumber=" + stiMobileNumber + ", emailid=" + emailid + ", password=" + password
			+ ", gender=" + gender + "]";
}
public int getStuid() {
	return stuid;
}
public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public void setStuid(int stuid) {
	this.stuid = stuid;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public String getStuBranch() {
	return stuBranch;
}
public void setStuBranch(String stuBranch) {
	this.stuBranch = stuBranch;
}
public double getStuPercentage() {
	return stuPercentage;
}
public void setStuPercentage(double stuPercentage) {
	this.stuPercentage = stuPercentage;
}
public long getStiMobileNumber() {
	return stiMobileNumber;
}
public void setStiMobileNumber(long stiMobileNumber) {
	this.stiMobileNumber = stiMobileNumber;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
