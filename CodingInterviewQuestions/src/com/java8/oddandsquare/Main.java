package com.java8.oddandsquare;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,4,5,6,8,3,2,5,1,3);
		list.stream().distinct().filter(x->x%2!=0).forEach(p->System.out.println(p*p));
		}

}
