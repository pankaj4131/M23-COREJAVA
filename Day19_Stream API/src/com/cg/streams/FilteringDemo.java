package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(5,11,22,33,5,44);
		//filter(predicate)method
		obj.stream().filter(i->i>25).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The Distinct Elements Are: ");
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The Limit Is: ");
		obj.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The Discarded Element Is: ");
		obj.stream().skip(3).forEach((i)->System.out.print(i+" "));

	}

}