package com.airtel.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.airtel.domain.Customer;
import com.airtel.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController 
{
	
	@Autowired
	private CustomerServiceImpl customerService;
		
	//FETCHING A CUSTOMER DETAIL
	@GetMapping(value="/get/{phoneNo}",produces="application/json")
	public  Customer fetchCustomer(@PathVariable long phoneNo) {
		return customerService.fetchCustomer(phoneNo);
	}
			
	//ADDING A CUSTOMER
	@PostMapping(value="/add",consumes="application/json")
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {  
		String response = customerService.createCustomer(customer);
		return ResponseEntity.ok().header("Custom-Header", "Successful").body(response);
	}
	
	//DELETING A CUSTOMER
	@DeleteMapping("/delete/{phoneNumber}")
	@ResponseBody                              //the returned string is treated as HTTP response body
	public String deleteCustomer(@PathVariable("phoneNumber") long phoneNumber) {
		return customerService.deleteCustomer(phoneNumber);
	}
}


	
////Updating an existing customer
//		@PutMapping(value = "/{phoneNumber}", consumes = "application/json")
//		public String updateCustomer(@PathVariable("phoneNumber") long phoneNumber, @RequestBody CustomerDTO customerDTO) 
//		{
//			return customerService.updateCustomer(phoneNumber, customerDTO);
//		}