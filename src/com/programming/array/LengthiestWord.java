package com.programming.array;

public class LengthiestWord {

	public static void main(String[] args) {
		String lengthiesName=null;
		String[] name = { "vinayak", "kumaransa", "mahi", "ok" };
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				String temp = null;
				
				if (name[i].toCharArray().length > name[j].toCharArray().length) {
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		
		System.out.print("Lengthiest name is :");
		for (int i = 0; i < name.length; i++) {
			lengthiesName=name[name.length-1];
		}
		
		System.out.println(lengthiesName);
	}
}
