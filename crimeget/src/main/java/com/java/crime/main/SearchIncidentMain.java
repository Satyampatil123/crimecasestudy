package com.java.crime.main;

import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;
import com.java.crime.dao.*;

import java.util.List;

import com.java.crime.model.Incidents;


public class SearchIncidentMain {
	public static void main(String[] args) {
		
	
	String IncidentType;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter incidentType");
	IncidentType=sc.next();
	IncidentDao dao=new IncidentDaoImpl();
	try {
		List<Incidents>incidentList=dao.SearchIncidents(IncidentType);
		for (Incidents incidents : incidentList) {
			System.out.println(incidents);
			
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


}

