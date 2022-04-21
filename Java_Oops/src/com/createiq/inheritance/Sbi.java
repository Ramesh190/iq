
package com.createiq.inheritance;

public class Sbi extends Bank {
	
			
	@Override
	int getRateOfInterest() {
		System.out.println(" sbi interest");
		return 8;
}
	public static void main(String[] args) {
		Sbi s=new Sbi();
	//	s.getRateOfInterest(10);
		s.getRateOfInterest();
	}
	}
	


