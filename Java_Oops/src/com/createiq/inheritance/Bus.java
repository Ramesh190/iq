package com.createiq.inheritance;

public class Bus extends Vehicle{

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		super.engine();
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
	Bus bu=new Bus();
	bu.color="yellow";
	bu.engine();
	bu.wheels();
	bu.breaks();
}
}

