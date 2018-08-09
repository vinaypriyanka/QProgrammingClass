package com.programming.array;

public class ReverseArrayElement {
 
public static void main(String[] args) {
	int a[]={34,56,3,78,6};
	ReverseArrayElement rs= new ReverseArrayElement();
		rs.reverse(a);
}

private void reverse(int[] ar) {
	for (int i = 0; i < ar.length/2; i++) {
		int t=ar[i];
		ar[i]=ar[ar.length-1-i];
		ar[ar.length-1-i]=t;
		
	}
	
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
	
	
	
	
}
	
}
