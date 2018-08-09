package com.stringbuffer.concept;

public class StringBufferExample {

	public static void main(String[] args) {
		String s="xyz";
		System.out.println(s+"abc");
		System.out.println(s);
		
		System.out.println("\n below is the string buffer program");
		StringBuffer sb= new StringBuffer("xyz");
		System.out.println(sb.capacity());
		sb.append("abc");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
	
		
		
	}
}
