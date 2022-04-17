package com.priya.java8.functions.methodref.constructor;

public class Test {

	public static void main(String[] args) {
		
		MyInterface f1=s->new MyClass(s);
		
		f1.get("Using Lambdas");
		
		//using constructor mapping
		MyInterface f2=MyClass::new;
		f2.get("Using  Constructor Mapping" );
		

	}

}
