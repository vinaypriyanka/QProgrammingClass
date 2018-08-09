/*Write a program which displays different message depending
on the age given. here are the possible responses
age<16: "you can't drive"
	age<18:"you cant vote" 
		age<25:"you cant rent a car"
			age is>=25 " can do anything thats legal"*/

package com.programming.example;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();

		if (age < 16)
			System.out.println("you can't drive");
		if (age < 18)
			System.out.println("you cant vote");
		if (age < 25)
			System.out.println("you cant rent a car");
		if (age >= 25)
			System.out.println("you can do anything thats legal");
	}

}
