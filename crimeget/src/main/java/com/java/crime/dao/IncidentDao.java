package com.java.crime.dao;

import java.sql.Date;
import java.sql.SQLException;

import java.util.List;

import com.java.crime.model.Incidents;

public interface IncidentDao {
	List<Incidents> showIncidentDao() throws SQLException, ClassNotFoundException;
	Boolean updateIncidentStatus(String Status,int IncidentID) throws ClassNotFoundException, SQLException;
	Boolean CreateIncident(Incidents incident) throws ClassNotFoundException,SQLException;
	List<Incidents> SearchIncidents(String IncidentType) throws ClassNotFoundException, SQLException;
	List<Incidents>getIncidentsDateRange(Date startDate,Date endDate) throws ClassNotFoundException, SQLException;
	List<Incidents>genrateIncidentReport() throws ClassNotFoundException, SQLException;
	
	 
}
