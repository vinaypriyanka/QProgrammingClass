package com.programming.example;

import java.util.Scanner;

public class DifferentMessageValidation {

	public static void main(String[] args) {

		System.out.println("Hey what's your name?(Sorry i keep forgetting)");
		System.out.println("Billy_Corgan" + "OK,Billy_Corgan,how old are you?");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 16)
			System.out.println("You Can't Drive,Billy_Corgan");
		else if (age >= 16 || age <= 17)
			System.out.println("You Can Drive but not vote,Billy_Corgan");

	}

}
