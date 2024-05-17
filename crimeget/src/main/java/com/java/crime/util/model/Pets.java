package com.java.crime.util.model;

public class Pets {
	private int PetId;
	private String name;
	private int age;
	private String Breed;
	private String TypeOfPet;
	private int AvailableForAdoption;
	public int getPetId() {
		return PetId;
	}
	public void setPetId(int petId) {
		PetId = petId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public String getTypeOfPet() {
		return TypeOfPet;
	}
	public void setTypeOfPet(String typeOfPet) {
		TypeOfPet = typeOfPet;
	}
	public int getAvailableForAdoption() {
		return AvailableForAdoption;
	}
	public void setAvailableForAdoption(int availableForAdoption) {
		AvailableForAdoption = availableForAdoption;
	}
	public Pets() {
		
	}
	public Pets(int petId, String name, int age, String breed, String typeOfPet, int availableForAdoption) {
		super();
		PetId = petId;
		this.name = name;
		this.age = age;
		Breed = breed;
		TypeOfPet = typeOfPet;
		AvailableForAdoption = availableForAdoption;
	}
	@Override
	public String toString() {
		return "Pets [PetId=" + PetId + ", name=" + name + ", age=" + age + ", Breed=" + Breed + ", TypeOfPet="
				+ TypeOfPet + ", AvailableForAdoption=" + AvailableForAdoption + "]";
	}
	

}
