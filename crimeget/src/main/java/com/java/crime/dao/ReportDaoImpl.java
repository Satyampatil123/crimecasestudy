package com.java.crime.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.java.crime.model.Reports;
import com.java.crime.util.DBConnUtil;
import com.java.crime.util.DBPropertyUtil;

public class ReportDaoImpl implements ReportsDao {
	Connection connection;
	PreparedStatement pst;

	@Override
	public Reports showReportByReportId(int ReportId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "Select * from Reports where ReportId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, ReportId);
		ResultSet rs  = pst.executeQuery();
		List<Reports> reportList = new ArrayList<Reports>();
		Reports report = null;
		while(rs.next()) {
			report = new Reports();
			report.setReportId(rs.getInt("ReportId"));
			report.setIncidentId(rs.getInt("IncidentId"));
			report.setReportingOfficer(rs.getInt("ReportingOfficer"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setStatus(rs.getString("Status"));
			
			
			
		}
		
		return report;
	}

	@Override
	public List<Reports> showReportByDate(Date ReportDate) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd="select * from Reports where ReportDate=?";
		pst=connection.prepareStatement(cmd);
		pst.setDate(1, ReportDate);
		
		
	    ResultSet rs=pst.executeQuery();
        List<Reports>reportList=new ArrayList<Reports>();
        while(rs.next()) {
        	Reports report=new Reports();
			report.setReportId(rs.getInt("ReportID"));
			report.setIncidentId(rs.getInt("IncidentID"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setReportingOfficer(rs.getInt("reportingOfficer"));
			report.setStatus(rs.getString("Status"));
			reportList.add(report);
		}
		return reportList;
			
		
	}

	@Override
	public List<Reports> showReportByReportingOfficer(int ReportingOfficer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "Select * from Reports where ReportingOfficer=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, ReportingOfficer);
		ResultSet rs = pst.executeQuery();
		List<Reports> reportList = new ArrayList<Reports>();
		while(rs.next())
		{
			Reports report=new Reports();
			report.setReportId(rs.getInt("ReportID"));
			report.setIncidentId(rs.getInt("IncidentID"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setReportingOfficer(rs.getInt("reportingOfficer"));
			report.setStatus(rs.getString("Status"));
			reportList.add(report);
		}
		
		
		return reportList;
	}

	@Override
	public List<Reports> showReportByStatus(String Status) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "Select * from Reports where Status = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, Status);
		ResultSet rs = pst.executeQuery();
		List<Reports> reportList = new ArrayList<Reports>();
		while(rs.next())
		{

			Reports report=new Reports();
			report.setReportId(rs.getInt("ReportID"));
			report.setIncidentId(rs.getInt("IncidentID"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setReportingOfficer(rs.getInt("reportingOfficer"));
			report.setStatus(rs.getString("Status"));
			reportList.add(report);
			
		}
		
		
		
		return reportList;
	}



	}
	


