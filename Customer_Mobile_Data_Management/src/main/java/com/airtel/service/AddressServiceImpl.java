package com.airtel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airtel.domain.Address;
import com.airtel.repository.AddressRepository;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepository addressRepository;
	
	//FETCHING AN ADDRESS
	public Address fetchAddress(int addressId) {
		return addressRepository.fetchAddress(addressId);
	}

}
