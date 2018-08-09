package com.string.example;

public class Anagram {
	public static void main(String[] args) {
		String x= "abc";
		String y= "dad";
		char[] c1=x.toCharArray();
		char[] c2=y.toCharArray();
		if (x.length()==y.length()) {
			for (int i = 0; i < c1.length; i++) {
				for (int j = 0; j < c2.length; j++) {
					if ((int)c1[i]==(int)c2[j]) {
						System.out.println("String is anagram");
						return;
					}
					
					
				}
				
			}
			
		}
	}
}
