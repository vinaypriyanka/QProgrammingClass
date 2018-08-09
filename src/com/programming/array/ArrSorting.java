package com.programming.array;

public class ArrSorting {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5 };
		int b[] = { 3, 6, 7, 56, 43 };
		ArrSorting ar = new ArrSorting();
		int[] sa = ar.mergeSortArr(a, b);
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]);
			if (i < sa.length - 1)
				System.out.print(",");
		}
	}

	int[] mergeSortArr(int a[], int b[]) {
		int k = 0;
		int temp;
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < c.length; i++) {
			if (i < a.length)
				c[i] = a[i];
			else if (i >= a.length)
				c[i] = b[k++];

		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 1; j < c.length - i; j++) {
				if (c[j - 1] > c[j]) {
					temp = c[j - 1];
					c[j - 1] = c[j];
					c[j] = temp;

				}
			}
		}
		return c;
	}

}
