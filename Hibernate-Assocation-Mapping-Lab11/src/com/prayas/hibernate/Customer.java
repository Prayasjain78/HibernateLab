package com.prayas.hibernate;

public class Customer {
int cid;
String firstname;
String lastname;
String email;
String phone;
Address address;
public Customer() {}
public Customer(String firstname, String lastname, String email, String phone) {
	
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phone = phone;
	
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}


}
