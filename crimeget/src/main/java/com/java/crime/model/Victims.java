package com.java.crime.model;

public class Victims {
	private int Victimid;
	private String FirstName;
    private String LastName;
    private int DateofBirth;
    private Gender gender;
    private String Phone;
    private String Address;
	public int getVictimid() {
		return Victimid;
	}
	public void setVictimid(int victimid) {
		Victimid = victimid;
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
	public int getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(int dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Victims [Victimid=" + Victimid + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateofBirth=" + DateofBirth + ", gender=" + gender + ", Phone=" + Phone + ", Address=" + Address
				+ "]";
	}
	
	public Victims(int victimid, String firstName, String lastName, int dateofBirth, Gender gender, String phone,
			String address) {
		super();
		Victimid = victimid;
		FirstName = firstName;
		LastName = lastName;
		DateofBirth = dateofBirth;
		this.gender = gender;
		Phone = phone;
		Address = address;
	}
	public Victims() {
		
	}
    
    
}
