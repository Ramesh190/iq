package com.createiq.methods;

public class OverloadingCalculation1 {
	void sum(int a,long b) {
		System.out.println(a+b);
	}
	void sum(long a,byte b) {
		System.out.println(a+b);
	}
	public int sum(double a,short b) {
		System.out.println(a+b);
		return b;
	}
	public static void main(String[] args) {
		OverloadingCalculation1 obj=new OverloadingCalculation1();
		obj.sum(25, 36);
		obj.sum(589, 569);
		obj.sum(566698, 98569745);
	}
	

}
