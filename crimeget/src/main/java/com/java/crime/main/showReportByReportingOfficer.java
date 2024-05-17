package com.java.crime.main;

import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.ReportDaoImpl;
import com.java.crime.dao.ReportsDao;
import com.java.crime.model.Reports;

public class showReportByReportingOfficer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ReportingOfficer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ReportingOfficer ");
		ReportingOfficer = sc.nextInt();
		ReportsDao dao = new ReportDaoImpl();
		try {
			List<Reports> report = dao.showReportByReportingOfficer(ReportingOfficer);
			for (Reports reports : report) {
				System.out.println(reports);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
