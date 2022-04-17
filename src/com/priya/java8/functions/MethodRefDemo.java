package com.priya.java8.functions;

public class MethodRefDemo {

	public static void myMethod() {
		// display a message for 10 times
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		// runnable is a functional interface
		Runnable r = MethodRefDemo::myMethod;

		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
