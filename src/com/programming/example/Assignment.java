package com.programming.example;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.println("Okay ,Here it comes...");
		System.out.println("\n");

		System.out.println(
				"Q1:" + "\t" + "What is the capital of alska?\n" + "1) Melbourne\n" + "2) Anchrage\n" + "3) Juneau");

		System.out.println(">");
		int ans = sc.nextInt();
		sc.nextLine();
		if (ans == 3) {
			System.out.println("Thats right");
			result++;
		} else {
			System.out.println("Your answer is wrong..");
			System.out.println("correct answer is : Juneau");
		}

		System.out.println(
				"Q2:" + "\t" + "Can you stor the value of \"cat\" in a variable of type int\n" + "1) Yes\n" + "2) No");

		System.out.println(">");
		int ans2 = sc.nextInt();
		sc.nextLine();
		if (ans2 == 2) {
			System.out.println("Thats right");
			result++;
		} else {
			System.out.println("Sorry \"cat\" is a string ,ints can only store numbers");
		}

		System.out.println("Q3:" + "\t" + "What is the result of 9+6/3\n" + "1) 5\n" + "2) 11\n" + "3) 15/3");

		System.out.println(">");
		int ans3 = sc.nextInt();
		sc.nextLine();
		if (ans3 == 2) {
			System.out.println("Thats correct");
			result++;
		}

		System.out.println("overall you got " + result + " out of 3 correct\n");
		System.out.println("Thanks for playing");

	}
}
