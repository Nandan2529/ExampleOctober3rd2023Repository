package com.sgtesting.noargsconstructor;

class Student
{
	int StdNo;
	String StdName;
	int StdDYear;
	Student ()
	{
		System.out.println("STUDENT DETAILS:");
		System.out.println("------------------------");
		StdNo = 1;
		System.out.println("Student No: "+StdNo);
		StdName = "Prajwal";
		System.out.println("Student Name: "+StdName);
		StdDYear = 2003;
		System.out.println("Student Birth Year: "+StdDYear);
		System.out.println("************************");	
	}
}

class Library
{
	int LibID;
	String BookName;
	String IssueM;
	Library ()
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
	Sports ()
	{
		System.out.println("SPORTS DETAILS:");
		System.out.println("------------------------");
		SptID = 07;
		System.out.println("Sports ID: "+SptID);
		SptType = "Outdoor";
		System.out.println("Sports Type: "+SptType);
		SptName = "Cricket";
		System.out.println("Sports Name: "+SptName);
		System.out.println("************************");	
	}
}

class CSDepartment
{
	int CSDeptNo;
	String CSDeptName;
	String CSDeptDay;
	CSDepartment ()
	{
		System.out.println("CS Department DETAILS:");
		System.out.println("------------------------");
		CSDeptNo = 1;
		System.out.println("CS Department ID: "+CSDeptNo);
		CSDeptName = "Java Lab";
		System.out.println("CS Department Name: "+CSDeptName);
		CSDeptDay = "Mon";
		System.out.println("Sports Name: "+CSDeptDay);
		System.out.println("************************");	
	}
}

public class OrderClassForStudentLibrarySportsCSDepartment {

	public static void main(String[] args) {
		// Order Class For Student Library Sports CSDepartment
		Student obj1 = new Student();
		
		Library obj2 = new Library();
		
		obj2.LibID = 22;
		
		Sports obj3 = new Sports();
		
		CSDepartment obj4 = new CSDepartment();
		
	}
}