package com.corejava;

public class Hosteller extends Student {

	public double hostelFee;
	
	
	public Hosteller() {
		super();
	}

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	public String displayDetails() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	public double payFee(double amount){
		if (amount < examFee+hostelFee)
			return (examFee+hostelFee)-amount;
		else
			return amount-(examFee+hostelFee);
	}
}
