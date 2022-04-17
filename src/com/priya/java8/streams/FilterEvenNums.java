package com.priya.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNums {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		/*List<Integer> listEven=new ArrayList<>();
		
		for(Integer i:list) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		System.out.println(list);
		System.out.println(listEven);*/
		
		//using streams java 8
		List<Integer> listEven = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(listEven);

	}

}
