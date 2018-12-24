package com.prayas.hibernate;

import javax.persistence.*;

@Entity
@Table(name="myemployees2")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="empType",length=5)
@DiscriminatorValue(value="EMP")
public class Employee{
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy=GenerationType.AUTO)
private int eid;
	@Column(name="ename")
private String ename;
	@Column(name="city")
private String city;
	@Column(name="status")
private String status;
	@Column(name="totalfee")
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


