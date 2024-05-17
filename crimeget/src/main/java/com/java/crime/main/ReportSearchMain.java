package com.java.crime.main;
import com.java.crime.dao.*;
import com.java.crime.model.Reports;
import java.sql.SQLException;

import java.util.List;
import java.util.Scanner;

public class ReportSearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ReportID");
		
		int ReportID=sc.nextInt();
		ReportsDao dao=new ReportDaoImpl();
		try {
			
			Reports report=dao.showReportByReportId(ReportID);
			if(report==null) {
				System.out.println("invalid ReportID");
			}
			else {
				System.out.println(report);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		}
		
	}
		
		
		

	


