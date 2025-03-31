package com.example.demo.model;

public class Student {
	private String regNo;
	private String name;
	private  int age;
	private String course;
	private double gpa;
	
	public Student(String regNo,String name,int age,String course,double gpa) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.age = age;
		this.course = course;
		this.gpa = gpa;
	}