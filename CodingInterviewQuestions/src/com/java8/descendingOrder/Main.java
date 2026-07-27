package com.java8.descendingOrder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,33,12,60,10,12,55,67,33,77,23);
	List list1=list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(list1);
	
	
	
	}

}
