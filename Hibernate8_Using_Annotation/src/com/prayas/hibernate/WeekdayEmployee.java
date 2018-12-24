package com.prayas.hibernate;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="WDEMP")
public class WeekdayEmployee extends CurrentEmployee {
private String qualification;
private String percentage;
private int yop;
public WeekdayEmployee() {}
	
public WeekdayEmployee(String ename,String city,String status,double totalfee,double feebal,String timings,String branch,String qualification,String percentage,int yop) {
	super(ename,city,status,totalfee,feebal,timings,branch);
	this.qualification=qualification;
	this.percentage=percentage;
	this.yop=yop;
}

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

public int getYop() {
	return yop;
}

public void setYop(int yop) {
	this.yop = yop;
}

@Override
public String toString() {
	return super.toString() +" , " +qualification + " , " + percentage + " , " + yop ;
}

}
