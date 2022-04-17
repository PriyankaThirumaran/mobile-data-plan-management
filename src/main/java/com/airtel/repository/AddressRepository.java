package com.airtel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.airtel.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	//FETCHING AN ADDRESS
	@Query(value = "SELECT * FROM Address WHERE addressId = ?1", nativeQuery = true)
	public Address fetchAddress(int addressId);

}
