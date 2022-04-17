package com.priya.java8.functions;

public class MyClass {

	 public void myMethod(int i) {
		 System.out.println(i);
	 }
	public static void main(String[] args) {
		//using lambda expressions
		MyInterface f=i->System.out.println(i);
		f.myMethod(10);
		
		//referencing instance methods
		MyClass c=new MyClass();
		MyInterface f1=c::myMethod;
		
		f1.myMethod(20);

	}

}
