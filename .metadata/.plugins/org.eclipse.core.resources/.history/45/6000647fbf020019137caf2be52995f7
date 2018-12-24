package com.prayas.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.*;


@Entity
@Table(name="mycustomers2")
public class Customer {
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer cid;
	@Column(name="firstname")
private String firstname;
	@Column(name="lastname")
private String lastname;
	@Column(name="email")
private String email;
	@Column(name="phone")
private String phone;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
private Address address;
public Customer() {}
public Customer(String firstname, String lastname, String email, String phone) {
	
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phone = phone;
	
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
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