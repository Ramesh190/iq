package com.createiq.inheritance;

public class Passport {
	final static String COUNTRY_NAME="INDIA";
     int pid;
     public void apply(int pid) {
    	 if(pid>0) {
    		 System.out.println("get passport id: "+pid);
    		 System.out.println("get passport country code:"+COUNTRY_NAME);
    	 }
    	 else {
    		 System.out.println("your not elgible for apply");
    	 }
     }
}
