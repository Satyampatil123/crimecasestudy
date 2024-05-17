package com.java.crime.dao;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

import com.java.crime.model.Incidents;
import com.java.crime.model.Reports;


public interface ReportsDao {
    Reports showReportByReportId(int ReportId) throws ClassNotFoundException, SQLException;
	List<Reports> showReportByDate(Date ReportDate) throws ClassNotFoundException, SQLException;
	List<Reports> showReportByReportingOfficer(int ReportingOfficer) throws ClassNotFoundException, SQLException;
    List<Reports> showReportByStatus(String Status) throws ClassNotFoundException, SQLException;

}
