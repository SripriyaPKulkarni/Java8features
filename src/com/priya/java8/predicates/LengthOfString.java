package com.priya.java8.predicates;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {


		Predicate<String> p=s->(s.length()>5);
		
		System.out.println(p.test("I am SriPriya"));

	}

}
