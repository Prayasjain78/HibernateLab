package com.prayas.hibernate;

import javax.persistence.*;

@Entity
@Table(name="westudents01")
public class WeekendStudent extends CurrentStudent{
private String company;
private String email;
private String ctc;
public WeekendStudent() {
}
public WeekendStudent(String sname,String city,String status,double totalfee,double feebal,String timings,String branch,String company, String email, String ctc) {
	super(sname,city,status,totalfee,feebal,timings,branch);
	this.company = company;
	this.email = email;
	this.ctc = ctc;
}
//Setter and Getter
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
	return "WeekendStudent [company=" + company + ", email=" + email + ", ctc=" + ctc + "]";
}

}
