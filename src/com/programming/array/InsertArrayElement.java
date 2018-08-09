package com.programming.array;

public class InsertArrayElement {

	public static void main(String[] args) {
		int[] ar = { 24, 45, 44, 23, 65 };
		System.out.println("Array before inserting element");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
			
		}
		System.out.println();
		InsertArrayElement ao = new InsertArrayElement();
		int[] rs = ao.insertArr(ar, 90, 3);
		
		System.out.println("Array after inserting element");
		for (int i = 0; i < rs.length; i++) {
			System.out.print(rs[i] + " ");
		}

	}

	private int[] insertArr(int[] a, int ele, int in) {

		if (in < 0 || in > a.length) {
			System.out.println("Index not in range");
			return a;
		}
		int na[] = new int[a.length + 1];

		for (int i = 0; i < na.length; i++) {
			if (i < in)
				na[i] = a[i];
			else if (i == in)
				na[i] = ele;
			else if (i > in)
				na[i] = a[i - 1];
		}

		return na;
	}

}
