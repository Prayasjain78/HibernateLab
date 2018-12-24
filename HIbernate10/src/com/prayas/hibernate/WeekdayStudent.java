package com.prayas.hibernate;

import javax.persistence.*;

@Entity
@Table(name="wdstudents01")

public class WeekdayStudent extends CurrentStudent{
private String qualification;
private String percentage;
private String yop;
public WeekdayStudent() {
}
public WeekdayStudent(String sname,String city,String status,double totalfee,double feebal,String timings,String branch,String qualification, String percentage, String yop) {
	super(sname,city,status,totalfee,feebal,timings,branch);
	this.qualification = qualification;
	this.percentage = percentage;
	this.yop = yop;
}
//Setter and  Getter
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getPercentage() {
	return percentage;
}
public void setPercentage(String percentage) {
	this.percentage = percentage;
}
public String getYop() {
	return yop;
}
public void setYop(String yop) {
	this.yop = yop;
}
@Override
public String toString() {
	return "WeekdayStudent [qualification=" + qualification + ", percentage=" + percentage + ", yop=" + yop + "]";
}

}
