package com.createiq.inheritance;

public class Programmer extends Employee {


	int bonus=10000;

public static void main(String[] args) {
	Programmer p=new Programmer();
	System.out.println("programer salary: "+p.salary);
	System.out.println("programer bonus: "+p.bonus);
}

	

}
