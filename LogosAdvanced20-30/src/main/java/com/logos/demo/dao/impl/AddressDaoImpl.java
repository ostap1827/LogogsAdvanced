package com.logos.demo.dao.impl;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.logos.demo.dao.AddressDao;
import com.logos.demo.model.Address;

@Repository
public class AddressDaoImpl extends BaseDaoImpl<Address, Long> implements AddressDao {

	public AddressDaoImpl() {
		super(Address.class);

	}

	@Transactional
	public Address findByCountry(String country) {
		try{
			return (Address) entityManager.createQuery("");
		}
		catch (NoResultException e) {
			return null;		}
		
	}

	@Transactional
	public Address findByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Address findByAddress(String street, int houseNumber, int flatnumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
