package com.cg.list;

import java.util.LinkedList;

public class LinkedListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList<>();
		obj.add(11);
		obj.add("Shiwani");
		obj.add(76.90);
		obj.add(11);
		obj.add(76);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.indexOf(11));
		System.out.println(obj);

	}

}