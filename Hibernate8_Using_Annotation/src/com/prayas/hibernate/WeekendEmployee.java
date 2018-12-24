package com.prayas.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="WEEMP")
public class WeekendEmployee extends CurrentEmployee {
private String wcompany;
private String wcemail;
private double wctc;
public WeekendEmployee() {}
public WeekendEmployee(String ename,String city,String status,double totalfee,double feebal,String timings,String branch,String wcompany,String wcemail,double wctc) {
	super(ename,city,status,totalfee,feebal,timings,branch);
	this.wcompany=wcompany;
	this.wcemail=wcemail;
	this.wctc=wctc;
}
public String getWcompany() {
	return wcompany;
}
public void setWcompany(String wcompany) {
	this.wcompany = wcompany;
}
public String getWcemail() {
	return wcemail;
}
public void setWcemail(String wcemail) {
	this.wcemail = wcemail;
}
public double getWctc() {
	return wctc;
}
public void setWctc(double wctc) {
	this.wctc = wctc;
}
@Override
public String toString() {
	return super.toString()+" ," + wcompany + " , " + wcemail + " , " + wctc ;
}


}
