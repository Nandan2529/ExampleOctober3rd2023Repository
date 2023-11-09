package com.sgtesting.parametarisedconstructor;

class Country
{
	int CtyNo;
	String ContinentName;
	String CtyName;
	Country (int CNo,String CName,String CtyName)
	{
		System.out.println("COUNTRY DETAILS:");
		System.out.println("------------------------");
		CtyNo = CtyNo;
		System.out.println("Continent Number: "+CtyNo);
		ContinentName = ContinentName;
		System.out.println("Continent Name: "+ContinentName);
		CtyName = CtyName;
		System.out.println("Country Name: "+CtyName);
		System.out.println("************************");
	}
}

class State
{
	int StateNo;
	String StateName;
	String StateCapital;
	State (int StateNo,String StateName,String StateCapital)
	{
		System.out.println("STATE DETAILS:");
		System.out.println("------------------------");
		StateNo = StateNo;
		System.out.println("State Number: "+StateNo);
		StateName = StateName;
		System.out.println("State Name: "+StateName);
		StateCapital = StateCapital;
		System.out.println("State Capital: "+StateCapital);
		System.out.println("************************");	
	}
}

class District
{
	int DistNo;
	String DistName;
	String DistStateName;
	District (int DistNo,String DistName,String DistStateName)
	{
		System.out.println("DISTRICT DETAILS:");
		System.out.println("------------------------");
		DistNo = DistNo;
		System.out.println("District Number: "+DistNo);
		DistName = DistName;
		System.out.println("District Name: "+DistName);
		DistStateName = DistStateName;
		System.out.println("District State Name: "+DistStateName);
		System.out.println("************************");	
	}
	
}

class Taluk
{
	int TlkNo;
	String TalukName;
	String DistName;
	Taluk (int TlkNo,String TalukName,String DistName)
	{
		TlkNo = TlkNo;
		System.out.println("Taluk Number: "+TlkNo);
		TalukName = TalukName;
		System.out.println("Taluk Name: "+TalukName);
	    DistName = DistName;
		System.out.println("Taluk District Name: "+DistName);
		System.out.println("************************");	
	}
}

public class ObjectClassForCountryStateDistrictTaluk {

	public static void main(String[] args) {
		// Object Class For Country State District Taluk
		Country o = new Country (01,"Asia","India");
		
		State o1 = new State (14,"Karnataka","Bangaloru");
		
		District o2 = new District(13,"Dudda","Hassan");
		
		Taluk o3 = new Taluk(18,"Hassan","Karnataka");
		
	}
}