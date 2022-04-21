package com.createiq.inheritance;

import java.util.Date;


public class Person extends Passport {
	

	int age;
	String name;
	Date dob;
	public Person() {
		System.out.println("default constructor");
	}
	public Person(int age,String name,Date date) {
		System.out.println("parameter constructor");
		this.age=age;
		this.name=name;
		date=dob;
	}
	
	
public void getbiodata() {
	System.out.println("person age: "+age);
	System.out.println("person name: "+name);
	System.out.println("person date of birth : "+dob);
}
public static void main(String[] args) {
	Person person=new Person();
	person.getbiodata();
	Date date=new Date();
	//System.out.println(date);
	Person person2=new Person(20, "anil", date);
	person2.getbiodata();
	person2.apply(12546);
	

	
	
}
}
