package com.programming.array;

import java.util.Scanner;

public class InsEleInArray {

	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println("Enter integers in Array: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sc.nextLine();
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}
}
