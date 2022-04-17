package com.priya.java8.lambdas.interfaces;

public class MyRunableImpl implements Runnable {

	@Override
	public void run() {
		
		//display a message for 10 times
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread");
		}

	}

}
