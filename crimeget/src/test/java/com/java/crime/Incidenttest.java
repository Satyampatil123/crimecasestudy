package com.java.crime;

import static org.junit.Assert.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.java.crime.main.Incident;

public class Incidenttest {

	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Incident inc = new Incident(1, "Murder", sdf.parse("2024-07-07"),98.76, 97.78, 
				"Murder in market", "open", 1,2);
		
	
	}
	
	@Test
	public void testconstructors() throws ParseException {
		
		Incident incident = new Incident();
		assertNotNull(incident);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Incident inc = new Incident(1, "Murder", sdf.parse("2024-07-07"),98.76, 97.78, 
				"Murder in market", "open", 1,2);
		assertEquals(1,inc.getIncidentId());
		assertEquals("Murder",inc.getIncidenttype());
		assertEquals(sdf.parse("2024-07-07"),inc.getIncidentDate());
		assertEquals(98.76,inc.getLatitude(),0);
		assertEquals(97.78,inc.getLongitude(),0);
		assertEquals("Murder in market",inc.getDes());
		assertEquals("open",inc.getStatus());
		assertEquals(1,inc.getVictimId());
		assertEquals(2,inc.getSuspectId());
		

	}
	@Test
	public void testGettersAndSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Incident incident = new Incident();
		incident.setIncidentId(1);
		incident.setIncidenttype("Murder");
		incident.setIncidentDate(sdf.parse("2024-07-07"));
		incident.setLatitude(98.76);
		incident.setLongitude(97.78);
		incident.setDes("Murder in market");
		incident.setStatus("open");
		incident.setVictimId(1);
		incident.setSuspectId(2);
		assertEquals(1,incident.getIncidentId());
		assertEquals("Murder",incident.getIncidenttype());
		assertEquals(sdf.parse("2024-07-07"),incident.getIncidentDate());
		assertEquals(98.76,incident.getLatitude(),0);
		assertEquals(97.78,incident.getLongitude(),0);
		assertEquals("Murder in market",incident.getDes());
		assertEquals("open",incident.getStatus());
		assertEquals(1,incident.getVictimId());
		assertEquals(2,incident.getSuspectId());
		
	}
	@Test
	public void testHashCode() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	     Incident inc1 = new Incident(1, "Murder", sdf.parse("2024-07-07"),98.76, 97.78, 
					"Murder in market", "open", 1,2);
	     Incident inc2 = new Incident(1, "Murder", sdf.parse("2024-07-07"),98.76, 97.78, 
					"Murder in market", "open", 1,2);
		
		assertEquals(inc1.hashCode(), inc2.hashCode());
	}
	@Test
	public void testEquals() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Incident inc1 = new Incident(1, "Murder", sdf.parse("2024-07-07"),98.76, 97.78, 
				"Murder in market", "open", 1,2);
		Incident inc2 = new Incident(1, "Murder", sdf.parse("2024-07-07"),98.76, 97.78, 
				"Murder in market", "open", 1,2);
		Incident inc3 = new Incident(1, "Murder", sdf.parse("2024-07-07"),98.7, 97.8, 
				"Murder in market", "open", 1,2);
		
		assertTrue(inc1.equals(inc2));
		assertFalse(inc1.equals(inc3));
	}

}
