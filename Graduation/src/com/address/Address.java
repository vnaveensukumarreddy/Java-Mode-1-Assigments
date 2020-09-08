package com.address;

public class Address {

	private String doorNumber;
	private String city;
	private String district;
	private String state;
	private String country;

	public Address(String doorNumber, String city, String district, String state, String country) {
		super();
		this.doorNumber = doorNumber;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", city=" + city + ", district=" + district + ", state=" + state
				+ ", country=" + country + "]";
	}

}
