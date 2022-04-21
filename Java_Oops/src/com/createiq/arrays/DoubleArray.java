package com.createiq.arrays;

public class DoubleArray {
	public static void main(String[] args) {
		double []value=new double[2];
		// without for loop
		value[0]=10000.55;
		value[1]=20000.69;
		System.out.println(value[1]);
		
		
		double []salary=new double[3];
		salary[0]=22356.00;
		salary[1]=65239.04;
		salary[2]=45871.125;
		for(int i=0;i<3;i++) {
			System.out.println(salary[i]);
		}
		System.out.println("  ");
		double fee[]=new double[salary.length];
		fee[0]=15400.00;
		fee[1]=18500.30;
		fee[2]=22350.00;
		for(int i=0;i<fee.length;i++) {
			System.out.println(fee[i]);
		}
		System.out.println();
		double amount[]= {22000.00,36500.55,369841.12};
		for(int i=0;i<amount.length;i++) {
			System.out.println(amount[i]);
		}
		System.out.println();
		double netsalary[]= {35000.56,36987.36,25796.458,89645.56};
		for(double i:netsalary) {
			System.out.println(i);
		}
		
	}
	

}
