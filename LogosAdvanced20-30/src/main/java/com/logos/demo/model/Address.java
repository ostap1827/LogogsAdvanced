package com.logos.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String Street;
	@Column
	private Integer houseNumber;
	@Column
	private Integer flatNumber;
	@ManyToOne
	private Cities cities;

	public Address() {
		super();
	}

	public Address(String street, Integer houseNumber, Integer flatNumber) {

		Street = street;
		this.houseNumber = houseNumber;
		this.flatNumber = flatNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public Integer getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(Integer flatNumber) {
		this.flatNumber = flatNumber;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", Street=" + Street + ", houseNumber=" + houseNumber + ", flatNumber="
				+ flatNumber + "]";
	}

}
