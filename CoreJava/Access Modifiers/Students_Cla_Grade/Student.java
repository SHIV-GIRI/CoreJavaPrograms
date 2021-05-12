package com.object_oriented_programs;

public class Student {
	public int studentId;
	public String studentName;
	private int marks;
	private char grade;

	public Student() {
		studentId = 0;
		studentName = null;
		marks = 0;
		grade = ' ';
	} // Student closing

	public Student(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculateGrade();
	} // Student constructor  closing

	private void calculateGrade() {

		if (marks > 90) {
			grade = 'A';
		} else if (marks > 80 && marks <= 90) {
			grade = 'B';
		} else if (marks > 70 && marks <= 80) {
			grade = 'C';
		} else if (marks > 60 && marks <= 70) {
			grade = 'D';
		} else {
			grade = 'E';
		}
	} // calculateGrade method closing

	public String displayDetails() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	} // displayDetails method closing
} // class closing
