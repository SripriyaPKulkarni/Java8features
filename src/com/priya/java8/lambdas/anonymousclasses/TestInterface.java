package com.priya.java8.lambdas.anonymousclasses;

public class TestInterface {

	public static void main(String[] args) {
		
		//executes as per scheduler
		
		/*Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println("Child Thread");
				}

				
			}
		});*/
		
		Thread t=new Thread(()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Child Thread");
			}
		});
		
		t.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}

	}

}
