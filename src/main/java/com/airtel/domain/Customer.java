package com.airtel.domain;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	long phoneNo;
	String name;
	
	@OneToOne(cascade=CascadeType.ALL)                             //????????????Manytoone and cascade type //bidirectional relationship using mapped by
	@JoinColumn(name = "address")
	Address address;
	
	@ManyToOne                                     //no cascade
	@JoinColumn(name = "currentPlan")
	Plan currentPlan;
	
	public Plan getCurrentPlan() {
		return currentPlan;
	}
	public void setCurrentPlan(Plan currentPlan) {
		this.currentPlan = currentPlan;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(String name, long phoneNo, Address address, Plan currentPlan) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.currentPlan = currentPlan;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", PhoneNo=" + phoneNo + ", address=" + address + ", currentPlan= " + currentPlan + "]";
	}

}
