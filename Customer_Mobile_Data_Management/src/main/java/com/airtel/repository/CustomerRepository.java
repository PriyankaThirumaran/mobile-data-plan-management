package com.airtel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.airtel.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	//ADDING A CUSTOMER (saveAndFlush(S Entity) method)
		
	//FETCHING A CUSTOMER
	@Query(value = "SELECT * FROM Customer WHERE phoneNo = ?1",nativeQuery = true)
	public Customer fetchCustomer(long phoneNo);
	
	//DELETING A CUSTOMER
	@Query(value = "DELETE FROM Customer WHERE phoneNo = ?1",nativeQuery = true)
	public void deleteCustomer(long phoneNo);

}



