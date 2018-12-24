package com.prayas.hibernate;

public class Employee{
private int eid;
private String ename;
private String city;
private String status;
private double totalfee;
public Employee() {}
public Employee(String ename,String city,String status,double totalfee) {
	this.ename=ename;
	this.city=city;
	this.status=status;
	this.totalfee=totalfee;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public double getTotalfee() {
	return totalfee;
}
public void setTotalfee(double totalfee) {
	this.totalfee = totalfee;
}
@Override
public String toString() {
	return eid+" , "+ename+" , "+city+" , "+status+" , "+totalfee;
	
}

}


