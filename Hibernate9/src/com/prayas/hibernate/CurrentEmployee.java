package com.prayas.hibernate;

public class CurrentEmployee extends Employee {
	private double feebal;
	private String timings;
	private String branch;
	public CurrentEmployee() {}
	public CurrentEmployee(String ename,String city,String status,double totalfee,double feebal,String timings,String branch) {
		super(ename,city,status,totalfee);
		this.feebal=feebal;
		this.timings=timings;
		this.branch=branch;
	}
	public double getFeebal() {
		return feebal;
	}
	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return super.toString()+" , "+feebal+" , "+timings+" , "+branch;
		
	}

}