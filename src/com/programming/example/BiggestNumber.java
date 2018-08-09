/*WAP to define a method to biggest among two number and

by using that method display biggest among three number , 
biggest among 4 number and biggest among 5 number*/

package com.programming.example;

public class BiggestNumber {

	static int getBiggest(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		int x1 = 22, x2 = 11, x3 = 4, x4 = 56, x5 = 8;
		int big2 = getBiggest(x1, x2);
		System.out.println("the biggest among " + x1 + " and " + x2 + " is: " + big2);
		int big3 = getBiggest(x1, getBiggest(x2, x3));
		System.out.println("the biggest among " + x1 + " , " + x2 + " and " + x3 + " is: " + big3);
		int big4 = getBiggest(x1, getBiggest(x2, getBiggest(x3, x4)));
		System.out.println("the biggest among " + x1 + " , " + x2 + " , " + x3 + " and " + x4 + " is: " + big4);
		int big5 = getBiggest(x1, getBiggest(x2, getBiggest(x3, getBiggest(x4, x5))));
		System.out.println(
				"the biggest among " + x1 + " , " + x2 + " , " + x3 + " , " + x4 + " and " + x5 + " is: " + big5);
	}
}
