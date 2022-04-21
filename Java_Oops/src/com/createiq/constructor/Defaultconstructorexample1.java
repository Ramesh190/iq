package com.createiq.constructor;

public class Defaultconstructorexample1 {
	int id;
	String name;
	//public Defaultconstructorexample1( ) {
		 
		//System.out.println(id+" "+name);
	//}
	 void display() {
		 System.out.println(id+" "+name);
	 }
	public static void main(String[] args) {
		Defaultconstructorexample1 s1=new Defaultconstructorexample1( );
		//Defaultconstructorexample1 s2=new Defaultconstructorexample1();
		  s1.display();
	   // s2.display();
	}
	

}
