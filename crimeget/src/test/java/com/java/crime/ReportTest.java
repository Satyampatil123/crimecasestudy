package com.java.crime;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.java.crime.main.Incident;



public class ReportTest {

	@Test
	public void testToString() throws ParseException {
		
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Report rep = new Report(3,4 , 7,sdf.parse("2024-07-07"), "Initial report filed",
					"finalised");
					
	
	}

	@Test
	public void testconstructors() throws ParseException {
		
		Report report = new Report();
		assertNotNull(report);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Report rep = new Report(3,4 , 7,sdf.parse("2024-07-07"), "Initial report filed",
				"finalised");
		assertEquals(3,rep.getReportId());
		assertEquals(4,rep.getIncidentId());
		assertEquals(7,rep.getReportingOfficer());

		
		assertEquals(sdf.parse("2024-07-07"),rep.getReportDate());
		assertEquals("Initial report filed",rep.getReportDetails());
		assertEquals("finalised",rep.getStatus());
		
		

	}
	@Test
	public void testGettersAndSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Report report = new Report();
		report.setReportId(3);
		report.setIncidentId(4);
		report.setReportingOfficer(7);
		report.setReportDate(sdf.parse("2024-07-07"));
		report.setReportDetails("Initial report filed");
		report.setStatus("finalised");
		assertEquals(3,report.getReportId());
		assertEquals(4,report.getIncidentId());
		assertEquals(7,report.getReportingOfficer());

		
		assertEquals(sdf.parse("2024-07-07"),report.getReportDate());
		assertEquals("Initial report filed",report.getReportDetails());
		assertEquals("finalised",report.getStatus());
		

	}
	@Test
	public void testHashCode() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	     Report rep1 = new Report(3,4 , 7,sdf.parse("2024-07-07"), "Initial report filed",
					"finalised");
	     Report rep2 = new Report(3,4 , 7,sdf.parse("2024-07-07"), "Initial report filed",
					"finalised");
		
		assertEquals(rep1.hashCode(), rep2.hashCode());
	}
	@Test
	public void testEquals() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Report rep1 = new Report(3,4 , 7,sdf.parse("2024-07-07"), "Initial report filed",
				"finalised");
		Report rep2 = new Report(3,4 , 7,sdf.parse("2024-07-07"), "Initial report filed",
				"finalised");
		Report rep3= new Report(3,4, 7,sdf.parse("2024-07-07"), "Initial report filed",
				"finalised");
		
		
		
		
		assertTrue(rep1.equals(rep2));
		assertFalse(rep1.equals(rep3));
}
}
