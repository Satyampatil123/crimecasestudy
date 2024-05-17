package com.java.crime.model;

import java.text.SimpleDateFormat;
import java.util.Objects;

import com.java.crime.main.Incident;

public class Lawenforcement {
	private int agencyId;
	private String agencyName;
	private String jurisdiction;
	private String phone;
	private String address;
	public int getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Lawenforcement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lawenforcement(int agencyId, String agencyName, String jurisdiction, String phone, String address) {
		super();
		this.agencyId = agencyId;
		this.agencyName = agencyName;
		this.jurisdiction = jurisdiction;
		this.phone = phone;
		this.address = address;
		}
	@Override
	public String toString() {
		return "Lawenforcement [agencyId=" + agencyId + ", agencyName=" + agencyName + ", jurisdiction=" + jurisdiction
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(agencyId, agencyName,jurisdiction, phone, address);
	}
	@Override
	public boolean equals(Object obj) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Lawenforcement law = (Lawenforcement)obj;
		if (law.getAgencyId() == agencyId && law.getAgencyName() == agencyName 
			&& law.getJurisdiction() == jurisdiction && law.getPhone() == phone 
				&& law.getAddress()== address)
		{
			return true;
		}
		return false;
		
	

	}
}