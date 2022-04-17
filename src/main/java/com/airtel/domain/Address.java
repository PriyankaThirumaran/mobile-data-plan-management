package com.airtel.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	private int addressId;
	private int houseNo;
	private String street;
	private String city;
	private long pincode;
	
	@OneToOne(mappedBy = "address")
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public Address(int addressId, int houseNo, String street, String city, long pincode) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + " street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
}

