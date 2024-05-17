package com.java.crime.main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

import com.java.crime.dao.*;

import com.java.crime.model.Incidents;

public class CreateIncident {
public static void main(String[] args) throws java.text.ParseException {
	Incidents incident=new Incidents();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter IncidentID");
	incident.setIncidentId(Integer.parseInt(sc.nextLine()));
	
	System.out.println("enter IncidentType");
	incident.setIncidentType(sc.nextLine());
	System.out.print("Enter date (yyyy-MM-dd): ");
	String DateString=sc.nextLine();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
		java.util.Date date = dateFormat.parse(DateString);
		 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		  incident.setIncidentDate(sqlDate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	System.out.println("enter Latitude");
	incident.setLatitude(Double.parseDouble(sc.nextLine()));
	
	System.out.println("enter Longitude");

	incident.setLongitude(Double.parseDouble(sc.nextLine()));
	System.out.println("enter status");
	incident.setStatus(sc.nextLine());
	System.out.println("enter victimID");
	incident.setVictimid(Integer.parseInt(sc.nextLine()));
	System.out.println("enter SuspectID");
	incident.setSuspectId(Integer.parseInt(sc.nextLine()));
	
	
	System.out.println("enter Description");
	
	incident.setDes(sc.nextLine());
	System.out.println(incident);
	
    IncidentDao dao=new IncidentDaoImpl();
	try {
		Boolean Success=dao.CreateIncident(incident);
		if(Success==true) {
			System.out.println("*data inserted succesfully*");
		}
		else {
			System.out.println("*data not inserted*");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        
}

}
	


	        
	
	

