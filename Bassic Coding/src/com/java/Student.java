package com.java;

public class Student {

	int id;
	String name;
	String no;
	double fee;

	public Student() {

	}

	public Student(int id, String name, String no, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.no = no;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", no=" + no + ", fee=" + fee + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
