package com.bufferedreader.concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserData {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		// String a = br.readLine();
		// int age= Integer.parseInt(a);

		System.out.println("Enter your phone number");
		long phoneNO = Long.parseLong(br.readLine());

		System.out.println("Enter your height");
		double height = Double.parseDouble(br.readLine());

		System.out.println("Your details are: ");
		System.out.println(name + " " + age + " " + phoneNO + " " + height);

	}
}
