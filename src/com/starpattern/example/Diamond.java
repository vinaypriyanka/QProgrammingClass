package com.starpattern.example;

public class Diamond {
public static void main(String[] args) {
	int n=9;
	int space=n/2;
	int stars=1;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <= space; j++) {
			System.out.print(" ");
		}
		for (int k = 0; k <= stars; k++) {
			System.out.print("*");
		}
		System.out.println();
		if (i<=n/2)
		{
		space--;
		stars+=2;
		}
		else
		{
		space++;
		stars-=2;
		}
	}
}
}
