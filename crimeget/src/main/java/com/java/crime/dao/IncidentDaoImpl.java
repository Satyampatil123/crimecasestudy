package com.java.crime.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.crime.model.Incidents;
import com.java.crime.util.DBConnUtil;
import com.java.crime.util.DBPropertyUtil;

public class IncidentDaoImpl implements IncidentDao{
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Incidents> showIncidentDao() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "select * from Incidents";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Incidents> IncidentsList = new ArrayList<Incidents>();
		Incidents incident = null;
		while(rs.next()) {
			incident = new Incidents();
			incident.setIncidentId(rs.getInt("IncidentId"));
			incident.setIncidentType(rs.getString("IncidentType"));
			incident.setIncidentDate(rs.getDate("IncidentDate"));
			incident.setLatitude(rs.getDouble("Latitude"));
			incident.setLongitude(rs.getDouble("Longitude"));
			incident.setDes(rs.getString("Des"));
			incident.setStatus(rs.getString("Status"));
			incident.setVictimid(rs.getInt("VictimID"));
			incident.setSuspectId(rs.getInt("SuspectID"));
			IncidentsList.add(incident);
		}
		return IncidentsList;
	}

	@Override
	public Boolean updateIncidentStatus(String Status, int IncidentID) throws ClassNotFoundException, SQLException {
		
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String  cmd="update Incidents set status=? where IncidentID=? ";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, Status);
		pst.setInt(2, IncidentID);
		
	
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}
		
	
	}

	@Override
	public Boolean CreateIncident(Incidents incident) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "Insert into Incidents(IncidentID, IncidentType, IncidentDate, Latitude, Longitude, Des,Status,"
				+ "VictimID,SuspectID) "
				+ " values(?,?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,incident.getIncidentId());
		pst.setString(2,incident.getIncidentType());
		pst.setDate(3,incident.getIncidentDate());
		pst.setDouble(4,incident.getLatitude());
		pst.setDouble(5,incident.getLongitude());
		pst.setString(6,incident.getDes());
		pst.setString(7,incident.getStatus());
		pst.setInt(8,incident.getVictimid());
		pst.setInt(9,incident.getSuspectId());
		
		
		
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
		
		
		
	
	

	

	@Override
	public List<Incidents> SearchIncidents(String IncidentType) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd="select * from incidents where Incidenttype=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, IncidentType);
		ResultSet rs=pst.executeQuery();
		List<Incidents> incidentList=new ArrayList<Incidents>();
		Incidents incidents=null;
		while(rs.next()) {
			incidents = new Incidents();
			incidents.setIncidentId(rs.getInt("IncidentId"));
			incidents.setIncidentType(rs.getString("IncidentType"));
			incidents.setIncidentDate(rs.getDate("IncidentDate"));
			incidents.setLatitude(rs.getDouble("Latitude"));
			incidents.setLongitude(rs.getDouble("Longitude"));
			incidents.setDescription(rs.getString("Des"));
			incidents.setStatus(rs.getString("status"));
			incidents.setVictimid(rs.getInt("VictimID"));
			incidents.setSuspectId(rs.getInt("SuspectID"));
			incidentList.add(incidents);
			
		}
		
		return incidentList;
		
		
	}

	@Override
	public List<Incidents> getIncidentsDateRange(Date startDate, Date endDate)
			throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.getConnectionString("DB");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd ="select * from incidents where IncidentDate between ? and ? ";
		
		pst=connection.prepareStatement(cmd);
		pst.setDate(1, startDate);
		pst.setDate(2, endDate);
		
		ResultSet rs=pst.executeQuery();
		List<Incidents> incidentList = new ArrayList<Incidents>();
		Incidents incident=null;
		while(rs.next()) {
			incident= new Incidents();
			incident.setIncidentId(rs.getInt("IncidentID"));
			incident.setIncidentType(rs.getString("IncidentType"));
			incident.setIncidentDate(rs.getDate("IncidentDate"));
			incident.setLatitude(rs.getDouble("Latitude"));
			incident.setLongitude(rs.getDouble("Longitude"));
			incident.setDescription(rs.getString("Des"));
			incident.setStatus(rs.getString("status"));
			incident.setVictimid(rs.getInt("VictimID"));
			incident.setSuspectId(rs.getInt("SuspectID"));
			incidentList.add(incident);
			
		}
		return incidentList;
	}

	@Override
	public List<Incidents> genrateIncidentReport() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String connStr = DBPropertyUtil.getConnectionString("DB");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd=" select * from Incidents";
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		List<Incidents> incidentList = new ArrayList<Incidents>();
		Incidents incident1= null;
		while(rs.next()) {
			incident1=new Incidents();
			incident1.setIncidentId(rs.getInt("IncidentID"));
			incident1.setIncidentType(rs.getString("IncidentType"));
			incident1.setIncidentDate(rs.getDate("IncidentDate"));
			incident1.setLatitude(rs.getDouble("Latitude"));
			incident1.setLongitude(rs.getDouble("Longitude"));
			incident1.setDescription(rs.getString("Des"));
			incident1.setStatus(rs.getString("status"));
			incident1.setVictimid(rs.getInt("VictimID"));
			incident1.setSuspectId(rs.getInt("SuspectID"));
			incidentList.add(incident1);
			
		}
		return incidentList;
	}


	
}



	
	


