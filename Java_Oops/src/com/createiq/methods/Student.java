package com.createiq.methods;

public class Student {
	String name;
	int id;
	int rollnumber;
	public Student() {
		this("viswa");
		//System.out.println("def");
	}
	public Student(String name) {
		this(name,101,1);
	}
	public Student(String n, int i,int r ) {
		id=i;
		name=n;
		rollnumber=r;
		
		
		
	}
	void dsp() {
		System.out.println("emp"+name);
		System.out.println("stu"+id);
		System.out.println("stu:"+rollnumber);
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.dsp();
				
	}

}
 