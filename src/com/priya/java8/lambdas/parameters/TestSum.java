package com.priya.java8.lambdas.parameters;

public class TestSum {

	public static void main(String[] args) {
		
		Sum sum=(x,y)->System.out.println("Sum is "+(x+y));
		sum.add(10, 20);

	}

}
