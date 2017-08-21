package com.kevin.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipPostal;
	private Long phoneNumber;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city = city;
	}
	
	public String getState(){
		return state;
	}
	public void setState(String state){
		this.state = state;
	}
	
	public String getZipPostal(){
		return zipPostal;
	}
	public void setZipPostal(String zipPostal){
		this.zipPostal = zipPostal;
	}
	
	public Long getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber2){
		this.phoneNumber = phoneNumber2;
	}

}
