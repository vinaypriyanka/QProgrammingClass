package com.programming.example;

import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your current earth weight");
		int weight = sc.nextInt();
		System.out.println("I have information for the following planet:\n" + "1. venus  2.Mars  3.Jupiter \n"
				+ "4. saturn 5.Uranus 6. Neptune \n");

		System.out.println("which planet are you visiting?");
		double pweight=0.0;
		int choice = sc.nextInt();
		if (choice == 1) {
			pweight=weight*0.78;

		} else if (choice == 2) {
			pweight=weight*0.39;

		} else if (choice == 3) {
			pweight=weight*2.65;

		} else if (choice == 4) {
			pweight=weight*1.17;

		} else if (choice == 5) {
			pweight=weight*1.05;

		} else if (choice == 6) {
			pweight=weight*1.23;

		} else {
			System.out.println("invalid choice");
			return;
		}
		
		System.out.println("your weight would be:"+ pweight);
	}
}
