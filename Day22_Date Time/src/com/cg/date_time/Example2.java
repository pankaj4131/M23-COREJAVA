package com.cg.date_time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Example2 {
public static void main(String[] args) {
		
		String str="2022-08-29 10:10";
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYYY-MM-DD HH : MM");
		LocalDateTime t= LocalDateTime.parse(str,dtf);
		System.out.println(t);

	}

}