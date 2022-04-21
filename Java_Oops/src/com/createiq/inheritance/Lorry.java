package com.createiq.inheritance;

public class Lorry extends Vehicle {

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		//super.engine();
		System.out.println("lorry engine");
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		super.wheels();
	}

	@Override
	public void breaks() {
		// TODO Auto-generated method stub
		super.breaks();
	}

	public static void main(String[] args) {
		
		Lorry lor=new Lorry();
		lor.color="black";
		lor.engine();
		lor.wheels();
		lor.breaks();
	}

	

}
