package com.sgtesting.parametarisedconstructor;

class Student
{
	int StdNo;
	String StdName;
	int StdDYear;
	Student (int StdNo,String StdName,int StdDYear)
	{
		System.out.println("STUDENT DETAILS:");
		System.out.println("------------------------");
		StdNo = StdNo;
		System.out.println("Student No: "+StdNo);
		StdName = StdName;
		System.out.println("Student Name: "+StdName);
		StdDYear = StdDYear;
		System.out.println("Student Birth Year: "+StdDYear);
		System.out.println("************************");	
	}
}

class Library
{
	int LibID;
	String BookName;
	String IssueM;
	Library (int LibID,String BookName,String IssueM)
	{
		System.out.println("LIBRARY DETAILS:");
		System.out.println("------------------------");
		LibID = 2;
		System.out.println("Library ID: "+LibID);
		BookName = "Java Script";
		System.out.println("Book Name: "+BookName);
		IssueM = "Nov";
		System.out.println("Issueed Month: "+IssueM);
		System.out.println("************************");	
	}
}

class Sports
{
	int SptID;
	String SptType;
	String SptName;
	Sports (int SptID,String SptType,String SptName)
	{
		System.out.println("SPORTS DETAILS:");
		System.out.println("------------------------");
		SptID = SptID;
		System.out.println("Sports ID: "+SptID);
		SptType = SptType;
		System.out.println("Sports Type: "+SptType);
		SptName = SptName;
		System.out.println("Sports Name: "+SptName);
		System.out.println("************************");	
	}
}

class CSDepartment
{
	int CSDeptNo;
	String CSDeptName;
	String CSDeptDay;
	CSDepartment (int CSDeptNo,String CSDeptName,String CSDeptDay)
	{
		System.out.println("CS Department DETAILS:");
		System.out.println("------------------------");
		CSDeptNo = CSDeptNo;
		System.out.println("CS Department ID: "+CSDeptNo);
		CSDeptName = CSDeptName;
		System.out.println("CS Department Name: "+CSDeptName);
		CSDeptDay = CSDeptDay;
		System.out.println("Sports Name: "+CSDeptDay);
		System.out.println("************************");	
	}
}

public class OrderClassForStudentLibrarySportsCSDepartment {

	public static void main(String[] args) {
		// Order Class For Student Library Sports CSDepartment
		Student obj1 = new Student(01,"Prajwal",2003);
		
		Library obj2 = new Library(02,"Java Script","Nov");
		
		Sports obj3 = new Sports(07,"Outdoor","Cricket");
		
		CSDepartment obj4 = new CSDepartment(01,"Java Lab","Mon");
		
	}
}