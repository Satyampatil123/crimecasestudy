package com.java.crime.main;

import java.util.Scanner;
import java.sql.SQLException;

import com.java.crime.model.Incidents;
import com.java.crime.dao.*;

public class updateIncidentStatus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    Incidents incident= new Incidents();
	    System.out.println("enter IncidentID");
	    incident.setIncidentId(sc.nextInt());
	    System.out.println("enter status");
	    incident.setStatus(sc.next());
	    IncidentDao  dao=new IncidentDaoImpl();
	    try {
			Boolean Success=dao.updateIncidentStatus(incident.getStatus(), incident.getIncidentId());
			if(Success==true) {
				System.out.println("*data updated succesfully*");
			}
			else {
				System.out.println("*data not updated*");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	    
	}

}

