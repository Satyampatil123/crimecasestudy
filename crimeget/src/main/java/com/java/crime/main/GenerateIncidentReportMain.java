package com.java.crime.main;

import java.util.List;
import com.java.crime.dao.*;
import java.sql.SQLException;

import com.java.crime.model.Incidents;

public class GenerateIncidentReportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncidentDao dao=new IncidentDaoImpl();
		  try {
			List<Incidents> IncidentList =  dao.genrateIncidentReport();
			for (Incidents incidents : IncidentList) {
				System.out.println(incidents);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}


