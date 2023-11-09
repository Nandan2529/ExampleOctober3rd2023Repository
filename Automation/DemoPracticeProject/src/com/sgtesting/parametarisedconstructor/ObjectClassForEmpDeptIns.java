package com.sgtesting.parametarisedconstructor;

class Employees
{
	int EmpID;
	String EmpName;
	int EmpPhone;
	int EmpSalary;
	Employees (int EmpID,String EmpName,int EmpPhone,int EmpSalary)
	{
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("------------------------");
		EmpID = EmpID;
		System.out.println("Employee ID: "+EmpID);
		EmpName = EmpName;
		System.out.println("Employee Name: "+EmpName);
		EmpPhone = EmpPhone;
		System.out.println("Employee Phone: "+EmpPhone);
		EmpSalary = EmpSalary;
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
	Department (int DeptID,String DeptName,String DeptLocation,String DeptFloor)
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
	Insurance (int InsNo,String InsType,int InsYear,int InsAmt)
	{
		System.out.println("INSURANCE DETAILS:");
		System.out.println("------------------------");
		InsNo = InsNo;
		System.out.println("Insurance Number: "+InsNo);
		InsType = InsType;
		System.out.println("Insurance Type: "+InsType);
		InsYear = InsYear;
		System.out.println("Insurance Date: "+InsYear);
		InsAmt = InsAmt;
		System.out.println("Insurance Amount: "+InsAmt);
		System.out.println("************************");	
	}
}

public class ObjectClassForEmpDeptIns {

	public static void main(String[] args) {
		// Object class For Employee Department Insurance
		Employees obj1 = new Employees(01,"Bharath H R",958746213,50000);
		
		Department obj2 = new Department(10,"R D","Bangalore","Third Floor");
		
		Insurance obj3 = new Insurance(121,"Life",2020,12500);
		
		
	}
}