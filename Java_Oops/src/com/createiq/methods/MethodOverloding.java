package com.createiq.methods;

public class MethodOverloding {
	public void save() {
		System.out.println("Employee Details");
		System.out.println("-----------------");
		
	}
	private void save(int id) {
		System.out.println("Employee id: " +id);
		
	}
	protected double save(String b,int age) {
		System.out.println("Employee Name: "+b);
		System.out.println("Employee Age: "+age);
		return age;
	}
	final String save(double c,String d) {
		System.out.println("salary: "+c);
		System.out.println("Location: "+d);
		return d;
		
	}
	public static void main(String[] args) {
		MethodOverloding obj=new MethodOverloding ();
		obj.save();
		obj.save(111);
		obj.save("Ashok",27);
		obj.save(75000.54,"Hyderabad");
		
	}
	

}
