package com.logos.demo.dao;

import com.logos.demo.model.Address;

public interface AddressDao extends BaseDao<Address, Long> {
	
	Address findByCountry(String country);
	Address findByCity(String city);
	Address findByAddress(String street,int houseNumber,int flatnumber);
	
	
}
