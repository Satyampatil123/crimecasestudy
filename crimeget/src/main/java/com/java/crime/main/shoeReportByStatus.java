package com.java.crime.main;

import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.ReportDaoImpl;
import com.java.crime.dao.ReportsDao;
import com.java.crime.model.Reports;

public class shoeReportByStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Status;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Status ");
		Status = sc.next();
		ReportsDao dao = new ReportDaoImpl();
     try {
    	 List<Reports> report = dao.showReportByStatus(Status);
    	 for (Reports reports : report) {
    		 System.out.println(reports);
			
		}

		
	} catch (Exception e) {
		// TODO: handle exception
	}
		

	}

}
