package com.programming.array;

public class StringArray {

	public static void main(String[] args) {
		String[] name = { "vinay", "kumar", "mahi", "ok" };
		String temp = "";
		for (int i = 0; i < 4; i++) {

			for (int j = i + 1; j < 4; j++) {
				if (name[i].compareToIgnoreCase(name[j]) > 0){
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
				
			}
				

		}
		
		System.out.println("Name in Sorted orded: ");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
	
}
