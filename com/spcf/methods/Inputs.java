package com.spcf.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.spcf.values.Employee.Status;
import com.spcf.values.MaintenanceCrew;
import com.spcf.values.MaintenanceCrew.Building;
import com.spcf.values.Person.Gender;
import com.spcf.values.Student;
import com.spcf.values.Student.Course;
import com.spcf.values.Student.YearLevel;
import com.spcf.values.Teacher;
import com.spcf.values.Teacher.Subjects;

public class Inputs {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int choice;

	public int selectType() throws IOException {

		System.out.println("--------------------------------");
		System.out.println("1. Student");
		System.out.println("2. Teacher");
		System.out.println("3. Maintenance Crew");
		System.out.println("Register a: [1-3] ");
		System.out.println("--------------------------------");
		choice = Integer.parseInt(br.readLine());

		if (choice < 1 || choice > 3) {
			throw new IOException();
		}
		return choice;

	}

	public int selectNumber() throws IOException {

		int number;
		System.out.println("Select number of entries: [1-10]");
		number = Integer.parseInt(br.readLine());

		if (number < 1 || number > 10) {
			throw new IOException();
		}

		return number;
	}

	public int tryAgain() throws IOException {
		int choice;
		System.out.println("Try again? [y/n]");
		if (br.readLine().equals("y") || br.readLine().equals("Y")) {
			choice = 1;
		} else
			choice = 0;
		return choice;
	}

	public void loopInput(int choice, int loopNum) throws IOException {

		List<Student> studList = new ArrayList<Student>();
		List<Teacher> teacList = new ArrayList<Teacher>();
		List<MaintenanceCrew> mainList = new ArrayList<MaintenanceCrew>();
		
		for (int x = 0; x < loopNum; x++) {
			if (choice == 1) {
				studList.add(studInput());
			} else if (choice == 2) {
				teacList.add(teacherInput());
			} else {
				mainList.add(mainInput());
			}
		}
	}

	public Student studInput() throws IOException {

		Student stud = new Student();
		int tempInt;
		System.out.println("------------------------------------------------");
		System.out.println("Enter Firstname: ");
		stud.setFirstName(br.readLine());
		System.out.println("Enter Lastname: ");
		stud.setLastName(br.readLine());
		System.out.println("Enter Age: ");
		stud.setAge(Integer.parseInt(br.readLine()));
		System.out.println("Enter Gender: [1=Male, 2=Female]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			stud.setSex(Gender.MALE);
		} else if (tempInt == 2) {
			stud.setSex(Gender.FEMALE);
		} else throw new IOException();
		System.out.println("Enter Year Level: ");
		System.out.println("[1=1st, 2=2nd, 3=3rd, 4=4th]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			stud.setYear(YearLevel.FIRST);
		} else if (tempInt == 2) {
			stud.setYear(YearLevel.SECOND);
		} else if (tempInt == 3) {
			stud.setYear(YearLevel.THIRD);
		} else if (tempInt == 4) {
			stud.setYear(YearLevel.FOURTH);
		} else throw new IOException();
		System.out.println("Enter Section: ");
		stud.setSection(Integer.parseInt(br.readLine()));
		System.out.println("Enter Course: ");
		System.out.println("[1=BSIT, 2=BSCS, 3=Education, 4=Nursing]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			stud.setCourse(Course.BSIT);
		} else if (tempInt == 2) {
			stud.setCourse(Course.BSCS);
		} else if (tempInt == 3) {
			stud.setCourse(Course.EDUCATION);
		} else if (tempInt == 4) {
			stud.setCourse(Course.NURSING);
		} else throw new IOException();
		System.out.println("REGISTERED!");
		return stud;
	}
	
	
	public Teacher teacherInput() throws IOException {
		Teacher teach = new Teacher();
		int tempInt;
		System.out.println("------------------------------------------------");
		System.out.println("Enter Firstname: ");
		teach.setFirstName(br.readLine());
		System.out.println("Enter Lastname: ");
		teach.setLastName(br.readLine());
		System.out.println("Enter Age: ");
		teach.setAge(Integer.parseInt(br.readLine()));
		System.out.println("Enter Gender: [1=Male, 2=Female]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			teach.setSex(Gender.MALE);
		} else if (tempInt == 2) {
			teach.setSex(Gender.FEMALE);
		} else throw new IOException();
		System.out.println("Enter Daily Rate:");
		Double.parseDouble(br.readLine());
		System.out.println("Enter Status:");
		System.out.println("[1=Regular, 2=Parttime, 3=Contractual]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			teach.setStatus(Status.REGULAR);
		} else if (tempInt == 2) {
			teach.setStatus(Status.PARTTIME);
		} else if (tempInt == 3) {
			teach.setStatus(Status.CONTRACTUAL);
		} else throw new IOException();
		System.out.println("Enter Assigned Subject:");
		System.out.println("[1=Math, 2=English, 3=Science]");
		System.out.println("[4=P.E., 5=Computer, 6=History]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			teach.setAssignedSubj(Subjects.MATH);
		} else if (tempInt == 2) {
			teach.setAssignedSubj(Subjects.ENGLISH);
		} else if (tempInt == 3) {
			teach.setAssignedSubj(Subjects.SCIENCE);
		} else if (tempInt == 4) {
			teach.setAssignedSubj(Subjects.PE);
		} else if (tempInt == 5) {
			teach.setAssignedSubj(Subjects.COMPUTER);
		} else if (tempInt == 6) {
			teach.setAssignedSubj(Subjects.HISTORY);
		} else throw new IOException();
		System.out.println("Enter Assigned Class: ");
		teach.setAssignedClass(br.readLine());
		System.out.println("REGISTERED!");
		return teach;
	}
	
	
	public MaintenanceCrew mainInput() throws IOException {
		MaintenanceCrew maint = new MaintenanceCrew();
		int tempInt;
		System.out.println("------------------------------------------------");
		System.out.println("Enter Firstname: ");
		maint.setFirstName(br.readLine());
		System.out.println("Enter Lastname: ");
		maint.setLastName(br.readLine());
		System.out.println("Enter Age: ");
		maint.setAge(Integer.parseInt(br.readLine()));
		System.out.println("Enter Gender: [1=Male, 2=Female]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			maint.setSex(Gender.MALE);
		} else if (tempInt == 2) {
			maint.setSex(Gender.FEMALE);
		} else throw new IOException();
		System.out.println("Enter Daily Rate:");
		Double.parseDouble(br.readLine());
		System.out.println("Enter Status:");
		System.out.println("[1=Regular, 2=Parttime, 3=Contractual]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			maint.setStatus(Status.REGULAR);
		} else if (tempInt == 2) {
			maint.setStatus(Status.PARTTIME);
		} else if (tempInt == 3) {
			maint.setStatus(Status.CONTRACTUAL);
		} else throw new IOException();
		System.out.println("Enter Assigned Building: ");
		System.out.println("[1=RVJ101, 2=RVJ102, 3=RVJ103]");
		System.out.println("[4=MCB301, 5=MCB302, 6=MCB303]");
		tempInt = Integer.parseInt(br.readLine());
		if (tempInt == 1) {
			maint.setBldgAssigned(Building.RVJ101);
		} else if (tempInt == 2) {
			maint.setBldgAssigned(Building.RVJ102);
		} else if (tempInt == 3) {
			maint.setBldgAssigned(Building.RVJ103);
		} else if (tempInt == 4) {
			maint.setBldgAssigned(Building.MCB301);
		} else if (tempInt == 5) {
			maint.setBldgAssigned(Building.MCB302);
		} else if (tempInt == 6) {
			maint.setBldgAssigned(Building.MCB303);
		} else throw new IOException();
		System.out.println("REGISTERED!");
		return maint;
	}

}
