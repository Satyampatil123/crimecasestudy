package com.java.crime.model;

public class LawEnforcementAgencies {
	private int AgencyId;
	private String AgencyName;
	private String Jurisdiction;
	private String phone;
	private String Address;
	public int getAgencyId() {
		return AgencyId;
	}
	public void setAgencyId(int agencyId) {
		AgencyId = agencyId;
	}
	public String getAgencyName() {
		return AgencyName;
	}
	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}
	public String getJurisdiction() {
		return Jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		Jurisdiction = jurisdiction;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "LawEnforcementAgencies [AgencyId=" + AgencyId + ", AgencyName=" + AgencyName + ", Jurisdiction="
				+ Jurisdiction + ", phone=" + phone + ", Address=" + Address + "]";
	}
	public LawEnforcementAgencies(int agencyId, String agencyName, String jurisdiction, String phone, String address) {
		super();
		AgencyId = agencyId;
		AgencyName = agencyName;
		Jurisdiction = jurisdiction;
		this.phone = phone;
		Address = address;
	}
	public LawEnforcementAgencies() {
		
	}
	

}
