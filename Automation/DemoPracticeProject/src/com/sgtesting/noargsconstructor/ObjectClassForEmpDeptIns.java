package com.sgtesting.noargsconstructor;

class Employees
{
	int EmpID;
	String EmpName;
	int EmpPhone;
	int EmpSalary;
	Employees ()
	{
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("------------------------");
		EmpID = 1;
		System.out.println("Employee ID: "+EmpID);
		EmpName = "Bharath H R";
		System.out.println("Employee Name: "+EmpName);
		EmpPhone = 958746213;
		System.out.println("Employee Phone: "+EmpPhone);
		EmpSalary = 50000;
		System.out.println("Employee Salary: "+EmpSalary);
		System.out.println("************************");	
	}
}

class Department
{
	int DeptID;
	String DeptName;
	String DeptLocation;
	String DeptFloor;
	Department ()
	{
		DeptID = 10;
		System.out.println("Department ID: "+DeptID);
		DeptName = "R and D";
		System.out.println("Department Name: "+DeptName);
		DeptLocation = "Bangalore";
		System.out.println("Department Location: "+DeptLocation);
		DeptFloor = "Third Floor";
		System.out.println("Department Floor: "+DeptFloor);
		System.out.println("************************");	
	}
}

class Insurance
{
	int InsNo;
	String InsType;
	int InsYear;
	int InsAmt;
	Insurance ()
	{
		System.out.println("INSURANCE DETAILS:");
		System.out.println("------------------------");
		InsNo = 121;
		System.out.println("Insurance Number: "+InsNo);
		InsType = "Life";
		System.out.println("Insurance Type: "+InsType);
		InsYear = 2020;
		System.out.println("Insurance Date: "+InsYear);
		InsAmt = 12500;
		System.out.println("Insurance Amount: "+InsAmt);
		System.out.println("************************");	
	}
}

public class ObjectClassForEmpDeptIns {

	public static void main(String[] args) {
		// Object class For Employee Department Insurance
		Employees obj1 = new Employees();
		
		Department obj2 = new Department();
		
		Insurance obj3 = new Insurance();
		
		
	}
}