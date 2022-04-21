package com.createiq.arrays;

public class StringArray {
	public static void main(String[] args) {
		Object names;
		String name1[]=new String[4];
		name1[0]="Ramesh";
		name1[1]="Viswa";
		name1[2]="ram";
		name1[3]="obul";
		for(int i=0;i<4;i++) {
			//System.out.println(name1[i]);
		}
		System.out.println();
		String name2[]=new String[2];
		name2[0]="ramesh";
		name2[1]="viswa";
		
			for(int j=0;j<name2.length;j++) {
				// System.out.println(name2[j]);
			}
			System.out.println();
			String object[]= {"ball","bat","pen","paper"};
			for(String i:object) {
				System.out.println(i);
				
			}
			
			
		}
	}


