package com.createiq.arrays;

public class CharArray {
	public static void main(String[] args) {
		char []lower=new char[2];
		lower[0]='a';
		lower[1]='b';
		System.out.println(lower );
		for(char i=0;i<2;i++) {
			System.out.println(lower[i]);
		}
		System.out.println( );
		char upper[]= {'a','b','c','d'};
		for(char i=0;i<upper.length;i++) {
			System.out.println(upper[i]);
			System.out.println( );
			for(char j:upper) {
				System.out.println(j);
			}
		}
		
	}

}
