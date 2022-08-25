package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		//stream can be created with static data
				Stream<String>obj=Stream.of("Pankaj","Akash","Vidya","Shrushti");
				//Terminal Operation-forEach()
				obj.forEach((i)->System.out.print(i+" "));
				System.out.println();
				
				//stream can be accquired from array or collection
				List<String>obj1=Arrays.asList(new String[] {"75","50","22","90"});
				obj=obj1.stream();
				obj.forEach(System.out::println);

	}

}
