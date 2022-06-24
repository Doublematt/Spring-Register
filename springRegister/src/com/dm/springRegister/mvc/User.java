package com.dm.springRegister.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	/*
	 * Declarations of user's attributes
	 * validation of attributes
	 */
	@NotNull(message = "field required")
	@Size(min = 1, message ="field required")
	private String firstName;
	
	@NotNull(message = "field required")
	@Size(min = 1, message = "field required")
	private String lastName;
	
	@NotNull(message = "field required")
	@Min(value = 18, message = "Only for adults")
	@Max( value =100, message = "Too old to be true")
	private Integer age;
	private String gender;
	
	@NotNull(message = "field required")
	@Size(min = 1, message = "field required")
	//simple regex for e-mail validation checking if '@' is present
	@Pattern(regexp="^(.+)@(.+)$", message = "not an e-mail")
	private String emailAddress;
	
	private String country;
	
	//to store countries and their IDs
	private LinkedHashMap <String, String> countryOptions;
	
	public User () {
		
		//init country options
		countryOptions = new LinkedHashMap<String, String>();
		
		//setting country options used in register form
		countryOptions.put("Poland", "PL");
		countryOptions.put("Germany", "DE");
		countryOptions.put("United Kingdom", "UK");
		countryOptions.put("France", "FE");
		countryOptions.put("United States", "USA");

	}
	
	//getters and setters
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAdress) {
		this.emailAddress = emailAdress;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
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
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	

}
