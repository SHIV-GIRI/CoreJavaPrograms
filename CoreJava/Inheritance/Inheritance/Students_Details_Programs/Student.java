package com.corejava;

public class Student {
	public int studentId;
	public String name;
	public double examFee;
	
	public Student() {}
	
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	public String displayDetails() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}


	public double payFee(double amount) {
		
		return 0;
	}
	

}
