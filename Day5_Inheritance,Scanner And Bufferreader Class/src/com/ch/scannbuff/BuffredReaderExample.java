package com.ch.scannbuff;


//Example on BufferedReader class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BuffredReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String str=b.readLine();
		System.out.println(str);


	}

}
