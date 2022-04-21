package com.createiq.arrays;

public class ByteArray {
	public static void main(String[] args) {
		byte num[]=new byte[6];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		num[5]=60;
		for(int i=0;i<6;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.print("  ");
		byte num1[]=new byte[num.length];
		num1[0]=80;
		num1[1]=70;
		num1[2]=60;
		num1[3]=50;
		num1[4]=40;
		num1[5]=30;
		for(int i=0;i<num1.length;i++) {
			System.out.print(num1[i]+" ");
		}
		
		System.out.println("   ");
		// dynamic initialization  
		byte[] number= {10,20,30,40,50};
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]+" ");
		}
		System.out.println();
		byte []number1= {25,30,58,48,25,89};
		for(byte i:number1) {
			System.out.println(i);
		}
				
	}
	 
		

}
