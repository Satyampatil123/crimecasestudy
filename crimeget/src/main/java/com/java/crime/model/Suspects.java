package com.java.crime.model;

public class Suspects {
	private int SuspectId;
	private String FirstName;
	private String Lastname;
	private String DateofBirth;
	private Gender gender;
	private String phone;
	private String Address;
	public int getSuspectId() {
		return SuspectId;
	}
	public void setSuspectId(int suspectId) {
		SuspectId = suspectId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
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
		return "Suspects [SuspectId=" + SuspectId + ", FirstName=" + FirstName + ", Lastname=" + Lastname
				+ ", DateofBirth=" + DateofBirth + ", gender=" + gender + ", phone=" + phone + ", Address=" + Address
				+ "]";
	}
	public Suspects() {
		
	}
	public Suspects(int suspectId, String firstName, String lastname, String dateofBirth, Gender gender, String phone,
			String address) {
		super();
		SuspectId = suspectId;
		FirstName = firstName;
		Lastname = lastname;
		DateofBirth = dateofBirth;
		this.gender = gender;
		this.phone = phone;
		Address = address;
	}
	

}
