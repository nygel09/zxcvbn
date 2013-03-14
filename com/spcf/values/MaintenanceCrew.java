package com.spcf.values;

public class MaintenanceCrew extends Employee {
	
	//STATIC VARS
	public static int idCounter;
	
	//INSTANCE VARS
	private Building bldgAssigned;
	private String maintId;
	
	
	public MaintenanceCrew() {
		idCounter++;
		maintId = ("mnt_00" + idCounter);
	}
	
	public enum Building {
		RVJ101, RVJ102, RVJ103, MCB301, MCB302, MCB303
	}
	
	public Building getBldgAssigned() {
		return bldgAssigned;
	}

	public void setBldgAssigned(Building bldgAssigned) {
		this.bldgAssigned = bldgAssigned;
	}
	
	public String getEmployeeId() {
		return maintId;
	}
	
}
