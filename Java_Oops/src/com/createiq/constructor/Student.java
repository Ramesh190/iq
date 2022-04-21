package com.createiq.constructor;

public class Student {
	int id ;
	String name;
	double fee;
	public Student() {
		
	}
	public Student(int id,String name,double fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	public void display() {
		System.out.println("id: "+id+""+name+ " " +"fee"+ fee);
	}
	
	public static void main(String[] args) {
		Student student=new Student(232, "Ramesh", 10000.225);
		//System.out.println(student);
		student.display();
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

}
