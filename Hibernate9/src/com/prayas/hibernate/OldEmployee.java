package com.prayas.hibernate;

public class OldEmployee extends Employee{
private String ocompany;
private String oemail;
private double octc;
public OldEmployee() {}
public OldEmployee(String ename,String city,String status,double totalfee,String ocompany, String oemail, double octc) {
	super(ename,city,status,totalfee);
	this.ocompany = ocompany;
	this.oemail = oemail;
	this.octc = octc;
}

public String getOcompany() {
	return ocompany;
}
public void setOcompany(String ocompany) {
	this.ocompany = ocompany;
}
public String getOemail() {
	return oemail;
}
public void setOemail(String oemail) {
	this.oemail = oemail;
}
public double getOctc() {
	return octc;
}
public void setOctc(double octc) {
	this.octc = octc;
}
@Override
public String toString() {
	return super.toString()+" , " + ocompany + ", " + oemail + ", " + octc ;
}

}
