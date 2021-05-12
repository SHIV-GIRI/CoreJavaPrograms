package com.corejava;

public class DayScholar extends Student {

	public double transportFee;
	
	
	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String displayDetails() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	@Override
	public double payFee(double amount){
		if (amount < examFee+transportFee)
			return (examFee+transportFee)-amount;
		else
			return amount-(examFee+transportFee);
		
	}
}
