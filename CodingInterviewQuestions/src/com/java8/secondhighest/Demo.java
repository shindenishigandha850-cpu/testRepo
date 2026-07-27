package com.java8.secondhighest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,33,14,6,2,6,8,9,12,29);
	int secondHighest=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
	System.out.println(secondHighest);
		
	}

}
