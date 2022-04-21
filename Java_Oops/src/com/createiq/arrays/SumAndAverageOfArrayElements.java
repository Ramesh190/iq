package com.createiq.arrays;

public class SumAndAverageOfArrayElements {
	public static void main(String[] args) {
		int[] numbers= {2,5,6,-25,9,45,-23,87};
		int sum=0;
		double average;
		for(int number:numbers) {
			sum += number;
			
		}
		int arraylength=numbers.length;
		average=(double)sum/(double)arraylength;
		System.out.println(" sum :"+sum);
		System.out.println(" averge :"+average);
		
	}

}
