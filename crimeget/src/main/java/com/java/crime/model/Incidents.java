package com.java.crime.model;

import java.sql.Date;

public class Incidents {
	private int IncidentId;
	private String IncidentType;
	private Date IncidentDate;
	private Double Longitude;
	private Double latitude;
	private String des;
	private String status;
	private int Victimid;
	private int SuspectId;
	public int getIncidentId() {
		return IncidentId;
	}
	
	public String getIncidentType() {
		return IncidentType;
	}

	public void setIncidentType(String incidentType) {
		IncidentType = incidentType;
	}

	public Date getIncidentDate() {
		return IncidentDate;
	}

	public void setIncidentDate(Date string) {
		IncidentDate = string;
	}

	public Double getLongitude() {
		return Longitude;
	}

	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double string) {
		this.latitude = string;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getVictimid() {
		return Victimid;
	}

	public void setVictimid(int victimid) {
		Victimid = victimid;
	}

	public int getSuspectId() {
		return SuspectId;
	}

	public void setSuspectId(int suspectId) {
		SuspectId = suspectId;
	}

	public void setIncidentId(int incidentId) {
		IncidentId = incidentId;
	}

	public Incidents(int incidentId, String incidentType, java.util.Date date, Double longitude, Double latitude,
			String des, String status, int victimid, int suspectId) {
		IncidentId = incidentId;
		IncidentType = incidentType;
		IncidentDate = (Date) date;
		Longitude = longitude;
		this.latitude = latitude;
		this.des = des;
		this.status = status;
		Victimid = victimid;
		SuspectId = suspectId;
	}
	public Incidents(int i, String string, java.util.Date date, double d, double e, String string4, String string5, String string6, String string7, int j, int k) {
		
	}
	public Incidents() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Incidents [IncidentId=" + IncidentId + ", IncidentType=" + IncidentType + ", IncidentDate="
				+ IncidentDate + ", Longitude=" + Longitude + ", latitude=" + latitude + ", des=" + des + ", status="
				+ status + ", Victimid=" + Victimid + ", SuspectId=" + SuspectId + "]";
	}

	public void setDescription(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setAgencyID(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	public void setDate(java.util.Date parse) {
		// TODO Auto-generated method stub
		
	}

	public Object getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
