package com.airtel.service;

import com.airtel.domain.Customer;

public interface CustomerService {
	
	//ADDING A CUSTOMER
	public String createCustomer(Customer customer);
	
	//FETCHING A CUSTOMER
	public Customer fetchCustomer(long phoneNo);
	
	//DELETING A CUSTOMER
	public String deleteCustomer(long phoneNo);
}


