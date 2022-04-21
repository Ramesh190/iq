package com.createiq.arrays;

public class LongArray {
	public static void main(String[] args) {
		long[] number=new long[2];
		number[0]=1;
		number[1]=2;
		System.out.println(number[0]);
		long[] num=new long[3];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		for(int i=0;i<3;i++) {
			System.out.println(num[i]);
		}
		System.out.println("  ");
		long[] num1=new long[num.length];
		num1[0]=299;
		num1[1]=399;
		num1[2]=499;
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		// dynamic initialization
		System.out.println("  ");
		long[] num2= {599,699,799};
		for(int i=0;i<num2.length;i++) {
			System.out.println(num2[i]);
		}
		// for each loop
		System.out.println("  ");
		String[] name= {"ramesh","mohan","jagadesh","surya","viswa"};
		for(String i:name) {
			System.out.println(i.length());
		}
	
	}

}
