package com.java.crime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import com.java.crime.main.Incident;

public class Report {
	private int reportId;
	private int incidentId;
	private int reportingOfficer;
	private Date reportDate;
	private String reportDetails;
	private String status;
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getIncidentId() {
		return incidentId;
	}
	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}
	public int getReportingOfficer() {
		return reportingOfficer;
	}
	public void setReportingOfficer(int reportingOfficer) {
		this.reportingOfficer = reportingOfficer;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportDetails() {
		return reportDetails;
	}
	public void setReportDetails(String reportDetails) {
		this.reportDetails = reportDetails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Report(int reportId, int incidentId, int reportingOfficer, Date reportDate, String reportDetails,
			String status) {
		super();
		this.reportId = reportId;
		this.incidentId = incidentId;
		this.reportingOfficer = reportingOfficer;
		this.reportDate = reportDate;
		this.reportDetails = reportDetails;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", incidentId=" + incidentId + ", reportingOfficer=" + reportingOfficer
				+ ", reportDate=" + reportDate + ", reportDetails=" + reportDetails + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(reportId, incidentId,reportingOfficer, reportDate, reportDetails,
				status);
		
	
	}
	@Override
	public boolean equals(Object obj) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Report report = (Report)obj;
		if (report.getReportId() == incidentId && report.getIncidentId() == incidentId 
			&& report.getReportingOfficer()== reportingOfficer && report.getReportDate().compareTo(reportDate) == 0 
				&& report.getReportDetails() == reportDetails && report.getStatus() == status
			)
		{
			return true;
		}
		return false;
		
	

	}
}
