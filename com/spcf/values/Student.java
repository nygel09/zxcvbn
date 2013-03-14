package com.spcf.values;

public class Student extends Person{

	public static int numOfStud;
	private YearLevel year;
	private int section;
	private Course course;
	
	public Student(){
		numOfStud++;
	}
	
	public enum YearLevel{
		FIRST, SECOND, THIRD, FOURTH
	}
	public enum Course{
		BSIT, BSCS, EDUCATION, NURSING
	}
	
	public int getStudNumber() {
		return numOfStud;
	}
	public YearLevel getYear() {
		return year;
	}
	public void setYear(YearLevel year) {
		this.year = year;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
