package com.programming.array;

public class OutPutProgram {
public static void main(String[] args) {
	int ar[]= new int[10];
	for (int i = 0; i < ar.length; i++) {
		ar[i]=9-i;
	}
	
	for (int i = 0; i < ar.length; i++) {
		ar[i]=ar[9-i];
	}
	
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
}
}
