package com.programming.array;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a = { 12, 45, 66, 23, 43 };
		System.out.println("Before Reversing array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		System.out.println("After Reversing array: ");
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.print(a[j] + " ");
		}
	}
}
