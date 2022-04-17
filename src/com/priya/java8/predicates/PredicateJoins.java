package com.priya.java8.predicates;

import java.util.function.Predicate;

public class PredicateJoins {
	public static void main(String[] args) {
		
		int[] a= {1,7,10,20,30,40,50,60,70,73};
		
		Predicate<Integer> p1=i->i>10;
		
		Predicate<Integer> p2=i->i%2==0;
		
		System.out.println("Greater than 10:");
		method1(p1,a);
		
		System.out.println("Even Nos:");
		method1(p2,a);
		
		System.out.println("Not greater than 10:");
		method1(p1.negate(),a);
		
		System.out.println("Odd Nos:");
		method1(p2.negate(),a);
		
		System.out.println("Even Nos and Greater Than 10:");
		method1(p1.and(p2),a);
		
		System.out.println("Even Nos or Greater Than 10:");
		method1(p1.or(p2),a);
	}
	static void method1(Predicate<Integer> p,int[] a) {
		for(int eachValue:a) {
			if(p.test(eachValue)) {
				System.out.println(eachValue);
			}
		}
		
	}

}
