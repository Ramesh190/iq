package com.createiq.inheritance;

public class Tiger extends Animals{
	public void lion() {
		System.out.println("lion");
		super.lion();	
	}
public void dog() {
	System.out.println("dog");
	super.dog();
}

	
public static void main(String[] args) {
	Tiger ti=new Tiger();
	ti.lion();
	ti.dog();
}
}
