package com.createiq.constructor;

public class ConstructorChain {
	ConstructorChain(){
		System.out.println(" default constructor");
	}
	ConstructorChain(String name){
		
		System.out.println("constructor with one argument"+name);
	}
	ConstructorChain(String name,int id){
		
		System.out.println(name+"constructor with two argument"+id);
	}
	public static void main(String[] args) {
		ConstructorChain obj=new ConstructorChain("ram");
		ConstructorChain chain=new ConstructorChain("babu",10 );
	
	}

}
