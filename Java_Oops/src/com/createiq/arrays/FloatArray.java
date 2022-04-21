package com.createiq.arrays;

public class FloatArray {


	public static void main(String[] args) {
		float []value=new float[2];
		// without for loop
		value[0]=10000.55f;
		value[1]=20000.69f;
		System.out.println(value[1]);
		
		
		float []salary=new float[3];
		salary[0]=22356.00f;
		salary[1]=65239.04f;
		salary[2]=45871.125f;
		for(int i=0;i<3;i++) {
			System.out.println(salary[i]);
		}
		System.out.println("  ");
		float fee[]=new float[salary.length];
		fee[0]=15400.00f;
		fee[1]=18500.30f;
		fee[2]=22350.00f;
		for(int i=0;i<fee.length;i++) {
			System.out.println(fee[i]);
		}
		System.out.println();
		float amount[]= {22000.00f,36500.55f,369841.12f};
		for(int i=0;i<amount.length;i++) {
			System.out.println(amount[i]);
		}
		System.out.println();
		float netsalary[]= {35000.56f,36987.36f,25796.458f,89645.56f};
		for(float i:netsalary) {
			System.out.println(i);
		}
		
	}
	

}
