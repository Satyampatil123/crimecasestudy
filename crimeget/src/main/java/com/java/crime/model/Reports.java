package com.java.crime.model;

import java.sql.Date;

public class Reports {
	private int ReportId;
	private int IncidentId;
	private int ReportingOfficer;
	private Date ReportDate;
	private String ReportDetails;
	private String Status;
	public int getReportId() {
		return ReportId;
	}
	public void setReportId(int reportId) {
		ReportId = reportId;
	}
	public int getIncidentId() {
		return IncidentId;
	}
	public void setIncidentId(int incidentId) {
		IncidentId = incidentId;
	}
	public int getReportingOfficer() {
		return ReportingOfficer;
	}
	public void setReportingOfficer(int reportingOfficer) {
		ReportingOfficer = reportingOfficer;
	}
	public Date getReportDate() {
		return ReportDate;
	}
	public void setReportDate(Date reportDate) {
		ReportDate = reportDate;
	}
	public String getReportDetails() {
		return ReportDetails;
	}
	public void setReportDetails(String reportDetails) {
		ReportDetails = reportDetails;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Reports(int reportId, int incidentId, int reportingOfficer, Date reportDate, String reportDetails,
			String status) {
		
		ReportId = reportId;
		IncidentId = incidentId;
		ReportingOfficer = reportingOfficer;
		ReportDate = reportDate;
		ReportDetails = reportDetails;
		Status = status;
	}
	public Reports() {
		
	}
	@Override
	public String toString() {
		return "Reports [ReportId=" + ReportId + ", IncidentId=" + IncidentId + ", ReportingOfficer=" + ReportingOfficer
				+ ", ReportDate=" + ReportDate + ", ReportDetails=" + ReportDetails + ", Status=" + Status + "]";
	}
	
	

	

}
