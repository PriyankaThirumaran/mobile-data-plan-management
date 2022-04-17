package com.airtel.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement //Maps a class or an enum type to an XML element.
@Entity
public class Plan {
	
	@Id
	Integer planId;
	String planName;
	Integer rate;
	
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Plan(Integer planId, String planName, Integer rate) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.rate = rate;
	}
	public Plan() {
		super();
	}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", rate=" + rate + "]";
	}
}

