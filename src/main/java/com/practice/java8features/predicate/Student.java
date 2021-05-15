package com.practice.java8features.predicate;

public class Student {

	private String name;
	private Integer totalMarksSecured;

	public Student(String name, Integer totalMarksSecured, Integer noOfSubjects) {
		super();
		this.name = name;
		this.totalMarksSecured = totalMarksSecured;
		this.noOfSubjects = noOfSubjects;
	}

	private Integer noOfSubjects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalMarks() {
		return totalMarksSecured;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarksSecured = totalMarks;
	}

	public Integer getNoOfSubjects() {
		return noOfSubjects;
	}

	public void setNoOfSubjects(Integer noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", totalMarks=" + totalMarksSecured + ", noOfSubjects=" + noOfSubjects + "]";
	}

}
