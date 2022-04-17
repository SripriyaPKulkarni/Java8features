package com.priya.java8.lambdas.interfaces;

public class TestInterface {

	public static void main(String[] args) {
		
		/*Runnable r=new MyRunableImpl();
		Thread t=new Thread(r);
		t.start();*/
		
		//executes as per scheduler
		
		Runnable r=()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}

	}

}
