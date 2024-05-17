package com.java.crime.model;

public class Officers {
	private int OfficerID;
	private String FirstName;
	private String LastName;
	private int BadgeNumber;
	private String Ranking;
	private String phone;
	private String Address;
	private int AgencyID;
	public int getOfficerID() {
		return OfficerID;
	}
	public void setOfficerID(int officerID) {
		OfficerID = officerID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getBadgeNumber() {
		return BadgeNumber;
	}
	public void setBadgeNumber(int badgeNumber) {
		BadgeNumber = badgeNumber;
	}
	public String getRanking() {
		return Ranking;
	}
	public void setRanking(String ranking) {
		Ranking = ranking;
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
	public int getAgencyID() {
		return AgencyID;
	}
	public void setAgencyID(int agencyID) {
		AgencyID = agencyID;
	}
	public Officers(int officerID, String firstName, String lastName, int badgeNumber, String ranking, String phone,
			String address, int agencyID) {
		
		OfficerID = officerID;
		FirstName = firstName;
		LastName = lastName;
		BadgeNumber = badgeNumber;
		Ranking = ranking;
		this.phone = phone;
		Address = address;
		AgencyID = agencyID;
	}
	public Officers() {
		
	}
	@Override
	public String toString() {
		return "Officers [OfficerID=" + OfficerID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", BadgeNumber=" + BadgeNumber + ", Ranking=" + Ranking + ", phone=" + phone + ", Address=" + Address
				+ ", AgencyID=" + AgencyID + "]";
	}
	

}
