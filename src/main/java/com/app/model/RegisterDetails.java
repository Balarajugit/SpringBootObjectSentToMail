package com.app.model;

import org.springframework.stereotype.Component;

@Component
public class RegisterDetails {
	
	private String name;
	private String education;
	private String email;
	private String address;
	public RegisterDetails() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "RegisterDetails [name=" + name + ", education=" + education + ", email=" + email + ", address="
				+ address + "]";
	}
	
	

}
