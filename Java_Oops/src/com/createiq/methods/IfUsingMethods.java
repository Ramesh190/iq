package com.createiq.methods;

public class IfUsingMethods {
	public  int weekday(int weekdays) {
		 
		
		if(weekdays==1) {
			System.out.println("monday");
		}
		else if(weekdays==2) {
			System.out.println("tuesday");
		}
		else if(weekdays==3) {
			System.out.println("wednesday");
		}
		else if(weekdays==4) {
			System.out.println("thursday");
		}
		else if(weekdays==5) {
			System.out.println("friday");
		}
		else if(weekdays==6) {
			System.out.println("saturday");
		}
		else if(weekdays==7) {
			System.out.println("sunday");
		}
		else {
			System.out.println("invalid input! please enter weekday between 1-7:");
			return weekdays;
		}
		return weekdays;
			
		}
	public static void main(String[] args) {
		IfUsingMethods obj=new IfUsingMethods();
		obj.weekday(9);
		
	}
	}


