package com.java.crime.main;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import com.java.crime.dao.*;
import com.google.protobuf.TextFormat.ParseException;
import com.java.crime.model.Reports;
import java.sql.SQLException;

public class ShowReportByDate {
	
		public static void main(String[] args) throws java.text.ParseException, ParseException {
	        Scanner sc = new Scanner(System.in);
	        Reports report=new Reports();

	        System.out.print("Enter date (yyyy-MM-dd): ");
			String DateString=sc.nextLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        java.util.Date date = dateFormat.parse(DateString);
			 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			  report.setReportDate(sqlDate);
	        ReportsDao dao=new ReportDaoImpl();
	        try {
				List<Reports>reportList=dao.showReportByDate(report.getReportDate());
				for (Reports reports : reportList) {
					System.out.println(reports);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }
	
		
	}


