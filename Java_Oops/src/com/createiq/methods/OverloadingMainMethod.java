package com.createiq.methods;

public class OverloadingMainMethod {
	public static void main(String[] args) {
		System.out.println("main String[]");
	}
	public static void main(String args) {
		System.out.println("main String");
	}
	public static void main() {
		System.out.println("main without args");
		
	}
	

}
