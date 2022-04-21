package com.createiq.methods;

public class OverloadingCalculation2 {
void sum(int a,long b) {
	System.out.println(" int arg method invoked: "+a*b);
}
void sum(long a,short b) {
	System.out.println(" long arg method invoked: "+a+b);
}
public static void main(String[] args) {
	OverloadingCalculation2 obj=new OverloadingCalculation2();
	obj.sum(20, 20);
	obj.sum(690, 78);
}
}
