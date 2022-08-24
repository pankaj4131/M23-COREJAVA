package com.cg.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<Object> d=new ArrayDeque<Object>();
		
		d.add(11);
		d.addFirst(21);
		d.addLast("Shiwani");
		d.add("daya");
		
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		
		for(int i=10;i<15;i++)
		{
			d.add(i);
			
		}
		System.out.println(d);

	}

}
