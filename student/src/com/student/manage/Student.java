package com.student.manage;

public class Student {
	private int studentid;
	private String studentname;
	private String studentPhone;
	private String studentcity;
	
	
	
	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}

	public Student(int studentid, String studentname, String studentPhone, String studentcity) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentPhone = studentPhone;
		this.studentcity = studentcity;
	}
	
	public Student(String studentname, String studentPhone, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentPhone = studentPhone;
		this.studentcity = studentcity;
	}

	
	public Student() {
		super();
	}
	
	 

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentPhone=" + studentPhone
				+ ", studentcity=" + studentcity + "]";
	}


}
