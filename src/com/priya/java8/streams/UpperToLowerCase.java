package com.priya.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {
	
		List<String> list1=new ArrayList<>();
		
		list1.add("SRI");
		list1.add("PRIYA");
		list1.add("MADHU");
		list1.add("SRIPRIYA");
		
		List<String> list2 = list1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(list2);

	}

}
