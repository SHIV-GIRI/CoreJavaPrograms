package com.object_oriented_programs;

class Customer {
	private String firstName;
	private String secondName;

	Customer() {
		System.out.println("Default Constructor");
	}

	public Customer(String firstName, String secondName) {
		this();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", secondName=" + secondName + "]";
	}

} // class closing
