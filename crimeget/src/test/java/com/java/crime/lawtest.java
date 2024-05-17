package com.java.crime;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.java.crime.main.Incident;
import com.java.crime.model.Lawenforcement;

public class lawtest {

	@Test
	public void testToString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Lawenforcement law = new Lawenforcement(1, "Dhoni policy", "Statewide","7057971007", "sulkud"); 
		
	}

	@Test
	public void testconstructors() throws ParseException {
		
		Lawenforcement law = new Lawenforcement();
		assertNotNull(law);
		Lawenforcement law1 = new Lawenforcement(1, "Dhoni policy", "Statewide","7057971007", "sulkud"); 
		assertEquals(1,law1.getAgencyId());
		assertEquals("Dhoni policy",law1.getAgencyName());
		assertEquals("Statewide",law1.getJurisdiction());
		assertEquals("7057971007",law1.getPhone());
		assertEquals("sulkud",law1.getAddress());
		
		

	}
	@Test
	public void testGettersAndSetters() throws ParseException {
		Lawenforcement law2 = new Lawenforcement();		
		law2.setAgencyId(1);
		law2.setAgencyName("Dhoni Policy");
		law2.setJurisdiction("Statewide");
		law2.setPhone("7057971007");
		law2.setAddress("Sulkud");
		assertEquals(1,law2.getAgencyId());
		assertEquals("Dhoni policy",law2.getAgencyName());
		assertEquals("Statewide",law2.getJurisdiction());
		assertEquals("7057971007",law2.getPhone());
		assertEquals("sulkud",law2.getAddress());

}
	@Test
	public void testHashCode() throws ParseException {
		Lawenforcement law1 = new Lawenforcement(1, "Dhoni policy", "Statewide","7057971007", "sulkud"); 
		Lawenforcement law2 = new Lawenforcement(1, "Dhoni policy", "Statewide","7057971007", "sulkud"); 
		assertEquals(law1.hashCode(), law2.hashCode());
	}
	@Test
	public void testEquals() throws ParseException {
		Lawenforcement law1 = new Lawenforcement(1, "Dhoni policy", "Statewide","7057971007", "sulkud"); 
		Lawenforcement law2 = new Lawenforcement(1, "Dhoni policy", "Statewide","7057971007", "sulkud"); 
		Lawenforcement law3 = new Lawenforcement(1, "Dhoni policy", "Statewide","705771007", "sulkud"); 
		assertTrue(law1.equals(law2));
		assertFalse(law1.equals(law3));
	}
}