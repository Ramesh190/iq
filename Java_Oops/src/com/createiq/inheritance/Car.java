package com.createiq.inheritance;

public class Car extends Vehicle {
public void engine() {
	System.out.println("car engine"+color);
	super.engine();
}

public void wheels() {
	System.out.println("car wheels"+color);
	super.wheels();
}

public void breaks() {
	System.out.println("car breaks"+color);
}

public static void main(String[] args) {
	Car car=new Car();
	car.color="black";
	car.engine();
	car.wheels();
	car.breaks();
}
}
