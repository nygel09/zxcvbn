package com.spcf.values;

public class Employee extends Person {

	private double dailyRate;
	private Status status;
	
	public enum Status{
		REGULAR,PARTTIME, CONTRACTUAL
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}

