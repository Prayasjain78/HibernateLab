package com.prayas.hibernate;

import javax.persistence.*;

@Entity
@Table(name="ostudents01")

public class OldStudent extends Student{
private String company;
private String email;
private String ctc;
public OldStudent() {}
public OldStudent(String sname,String city,String status,double totalfee,String company, String email, String ctc) {
	super(sname,city,status,totalfee);
	this.company = company;
	this.email = email;
	this.ctc = ctc;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCtc() {
	return ctc;
}
public void setCtc(String ctc) {
	this.ctc = ctc;
}
@Override
public String toString() {
	return "OldStudent [company=" + company + ", email=" + email + ", ctc=" + ctc + "]";
}

}
