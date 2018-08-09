package com.programming.array;

public class RetunBiggestElement {
	public static void main(String[] args) {

		int[] c = { 45, 22, 5, 89, 21, 0 };
		RetunBiggestElement r = new RetunBiggestElement();
		System.out.println("Biggest element in Array is:" + r.biggestElement(c));
	}

	int biggestElement(int a[]) {
		int temp;
		int biggestElement = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
				biggestElement = a[a.length - 1];

			}

		}
		return biggestElement;

	}

}
