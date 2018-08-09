package com.starpattern.example;

public class Pyramid {
	
public static void main(String[] args) {
	
	
	for (int a = 0; a <=5; a++) {
		for (int b = 0; b <=5-a; 	b++) {
			
				System.out.print(" ");
			}
		
		for (int c = 0; c <a ; c++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	
	
	for (int i = 5; i >0; i--) {
		for (int j = 0; j <=5-i; j++) {
			
				System.out.print(" ");
			}
		
		for (int k = 0; k <i ; k++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	
	}
	
}




