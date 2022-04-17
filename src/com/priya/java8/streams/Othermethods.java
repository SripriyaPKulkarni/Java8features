package com.priya.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Othermethods {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		//using streams java 8
		List<Integer> listEven = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(listEven);
		
		//get counts
		long noOfEvenNos = list.stream().filter(i->i%2==0).count();
		
		System.out.println(noOfEvenNos);
		
		//creating comparator of Integers
		Comparator<Integer> comp=(i1,i2)->i1.compareTo(i2);
		
		List<Integer> list2 = list.stream().sorted(comp).collect(Collectors.toList());
		
		System.out.println(list2);
		
		//min and max
		Integer max = list.stream().max(comp).get();
		Integer min = list.stream().min(comp).get();
		
		System.out.println(max);
		
		System.out.println(min);
		
		//using foreach with streams
		list.stream().forEach(i->System.out.println(i));


	}

}
