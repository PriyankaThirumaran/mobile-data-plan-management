package com.airtel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airtel.domain.Customer;
import com.airtel.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	//ADDING A CUSTOMER
	public String createCustomer(Customer customer) {
		customerRepository.saveAndFlush(customer);
		return "Customer with Phone number "+customer.getPhoneNo()+" added successfully";
	}
	
	//FETCHING A CUSTOMER
	public Customer fetchCustomer(long phoneNo) {
		return customerRepository.fetchCustomer(phoneNo);
	}
	
	//DELETING A CUSTOMER
	public String deleteCustomer(long phoneNo) {
		customerRepository.deleteCustomer(phoneNo);	
		return "customer of phoneNumber " + phoneNo + " got deleted successfully";
	}
	 
}



////DELETING A CUSTOMER
//	public String deleteCustomer(long phoneNo) {
//		String response = "Customer of: "+phoneNo+" does not exist";
//		
//		Customer customer = customerRepository.fetchCustomer(phoneNo);
//		if (!customer.equals(null)) {
//			customerRepository.deleteCustomer(customer);	
//			response = customer.getName() + " of phoneNumber " + customer.getPhoneNo()
//						+ " got deleted successfully";
//		} 
//		return response;
//	}




////UPDATE A CUSTOMER
//public String updateCustomer(long phoneNumber, Customer customer)
//{
//	String response = "Customer of: "+phoneNumber+" does not exist";
//	
//	for(Customer cust : customerDAO.fetchCustomer())
//	{
//		if(cust.getPhoneNo() == phoneNumber)
//		{
//			if(customer.getName()!=null)
//				cust.setName(customer.getName());
//			if(customer.getAddress()!=null)
//				cust.setAddress(customer.getAddress());
//			if(customer.getPassword()!=null) 
//				cust.setPassword(customer.getPassword());
//			
//			response = "Customer of phoneNumber "+cust.getPhoneNo()+" got updated successfully";
//			break;
//		}
//	}
//	
//	return response;
//}