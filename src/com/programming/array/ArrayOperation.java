package com.programming.array;

import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {

		ArrayOperation ao = new ArrayOperation();
		int ar[] = ao.readArr();
		ao.display(ar);
		System.out.println();
		System.out.println("---------------------------");
		int[] c=ao.countEvenOdd(ar);
		System.out.println("Number of Even Numbers:"+ c[0]);
		System.out.println("Number of odd Numbers:"+ c[1]);
		
		
		
	}

	public int[] countEvenOdd(int[] ar) {
		// TODO Auto-generated method stub
		int count[]= new int[2];
		for (int i = 0; i < ar.length; i++) {
			count[ar[i]%2]++;
		}
		return count;
	}

	private void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1)
				System.out.print(",");
		}
	}

	private int[] readArr() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("enter" + n + "values");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();

		}

		return ar;
	}
}
