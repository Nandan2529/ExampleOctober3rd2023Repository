package com.sgtesting.classassignment;

class Employees
{
	int EmpID;
	String EmpName;
	int EmpPhone;
	int EmpSalary;
}

class Department
{
	int DeptID;
	String DeptName;
	String DeptLocation;
	String DeptFloor;
}

class Insurance
{
	int InsNo;
	String InsType;
	int InsYear;
	int InsAmt;
}

public class ObjectClassForEmpDeptIns {

	public static void main(String[] args) {
		// Object class For Employee Department Insurance
		Employees obj1 = new Employees();
		
		obj1.EmpID = 114;
		System.out.println("Employee ID: "+obj1.EmpID);
		obj1.EmpName = "Prakash M";
		System.out.println("Employee Name: "+obj1.EmpName);
		obj1.EmpPhone = 958446213;
		System.out.println("Employee Phone: "+obj1.EmpPhone);
		obj1.EmpSalary = 30000;
		System.out.println("Employee Salary: "+obj1.EmpSalary);
		System.out.println("************************");
		
		Department obj2 = new Department();
		
		obj2.DeptID = 14;
		System.out.println("Department ID: "+obj2.DeptID);
		obj2.DeptName = "R and D";
		System.out.println("Department Name: "+obj2.DeptName);
		obj2.DeptLocation = "Bangalore";
		System.out.println("Department Location: "+obj2.DeptLocation);
		obj2.DeptFloor = "Third Floor";
		System.out.println("Department Floor: "+obj2.DeptFloor);
		System.out.println("************************");
		
		Insurance obj3 = new Insurance();
		
		obj3.InsNo = 24;
		System.out.println("Insurance Number: "+obj3.InsNo);
		obj3.InsType = "Bike";
		System.out.println("Insurance Type: "+obj3.InsType);
		obj3.InsYear = 2023;
		System.out.println("Insurance Date: "+obj3.InsYear);
		obj3.InsAmt = 26000;
		System.out.println("Insurance Amount: "+obj3.InsAmt);
		System.out.println("************************");
	}
}