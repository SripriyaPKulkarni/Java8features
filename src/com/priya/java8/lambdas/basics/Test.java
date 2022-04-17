package com.priya.java8.lambdas.basics;

public class Test {

	public static void main(String[] args) {
		
		//creating object of Class C
		/*A a=new C();
		a.myMethod();*/
		
		//writing lambda expressions
		A a=()->System.out.println("Inside My Method");
		a.myMethod();
	

	}

}
