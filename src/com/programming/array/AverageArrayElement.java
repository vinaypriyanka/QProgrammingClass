package com.programming.array;

import java.util.Scanner;

public class AverageArrayElement {
public static void main(String[] args) {
	int sum=0;
	
AverageArrayElement e= new AverageArrayElement();
e.calculateAverage();
System.out.println(e.calculateAverage());

} 
	
public void calculateAverage(){
	int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter how many values");
	int n = sc.nextInt();
	int[] ar=new int[n];
	System.out.println("Enter n values");
	for (int i = 0; i < n; i++) {
		ar[i]=sc.nextInt();
	}
	
	for (int i = 0; i < ar.length; i++) {
		
		sum= sum+ar[i];
		
	}
	System.out.println("sum is:"+ sum);
	int average=sum/ar.length;
System.out.println("average is:"+ average);
}
}
