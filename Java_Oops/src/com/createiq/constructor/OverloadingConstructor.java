package com.createiq.constructor;

public class OverloadingConstructor {
	int id;
	String name;
	int age;
	public OverloadingConstructor (int id,String name) {
		System.out.println(id+" "+name);
	}
	public OverloadingConstructor (int id,String name,int age) {
		System.out.println(id+" "+name+" "+age);
	}
	//void display() {}
	public static void main(String[] args) {
		OverloadingConstructor s1=new OverloadingConstructor (101,"Rama");
		OverloadingConstructor s2=new OverloadingConstructor (201,"sitha",25);
//		s1.display();
//		s2.display();
		
		
	}

}
