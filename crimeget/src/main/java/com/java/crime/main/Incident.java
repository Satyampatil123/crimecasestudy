package com.java.crime.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Incident {
	private int incidentId;
	private String incidenttype;
	private Date incidentDate;
	private Double latitude;
	private Double longitude;
	private String des;
	private String status;
	private int victimId;
	private int suspectId;
	public int getIncidentId() {
		return incidentId;
	}
	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}
	public String getIncidenttype() {
		return incidenttype;
	}
	public void setIncidenttype(String incidenttype) {
		this.incidenttype = incidenttype;
	}
	public Date getIncidentDate() {
		return incidentDate;
	}
	public void setIncidentDate(Date incidentDate) {
		this.incidentDate = incidentDate;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
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
	public int getVictimId() {
		return victimId;
	}
	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}
	public int getSuspectId() {
		return suspectId;
	}
	public void setSuspectId(int suspectId) {
		this.suspectId = suspectId;
	}
	public Incident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Incident(int incidentId, String incidenttype, Date incidentDate, Double latitude, Double longitude,
			String des, String status, int victimId, int suspectId) {
		super();
		this.incidentId = incidentId;
		this.incidenttype = incidenttype;
		this.incidentDate = incidentDate;
		this.latitude = latitude;
		this.longitude = longitude;
		this.des = des;
		this.status = status;
		this.victimId = victimId;
		this.suspectId = suspectId;
	}
	@Override
	public String toString() {
		return "Incident [incidentId=" + incidentId + ", incidenttype=" + incidenttype + ", incidentDate="
				+ incidentDate + ", latitude=" + latitude + ", longitude=" + longitude + ", des=" + des + ", status="
				+ status + ", victimId=" + victimId + ", suspectId=" + suspectId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(incidentId, incidenttype,incidentDate, latitude, longitude,
				des, status,victimId,suspectId);
	}
	@Override
	public boolean equals(Object obj) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Incident incident = (Incident)obj;
		if (incident.getIncidentId() == incidentId && incident.getIncidenttype() == incidenttype 
			&& incident.getIncidentDate().compareTo(incidentDate)==0 && incident.getLatitude().compareTo(latitude) == 0 
				&& incident.getLongitude().compareTo(longitude) == 0 && incident.getDes() == des 
				&& incident.getStatus() == status
			&& incident.getVictimId() == victimId 
			&& incident.getSuspectId()== suspectId)
		{
			return true;
		}
		return false;
		
	

	}
}
