package com.spcf.values;

public class Teacher extends Employee {

	private Subjects assignedSubj;
	private String assignedClass;
	private static int numOfTeachers;
	private String teacherId;

	public Teacher() {
		numOfTeachers++;
		teacherId = ("tch_00" + numOfTeachers);
	}

	public enum Subjects {
		MATH, ENGLISH, SCIENCE, PE, COMPUTER, HISTORY
	}

	public Subjects getAssignedSubj() {
		return assignedSubj;
	}

	public void setAssignedSubj(Subjects assignedSubj) {
		this.assignedSubj = assignedSubj;
	}

	public String getAssignedClass() {
		return assignedClass;
	}

	public void setAssignedClass(String assignedClass) {
		this.assignedClass = assignedClass;
	}

	public String getEmployeeId() {
		return teacherId;
	}

}
