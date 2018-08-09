package com.programming.array;

public class MergeArrayZigZag {
public static void main(String[] args) {
	int a[]={1,4,5};
	int b[]={3,6,7,56,43};
	MergeArrayZigZag s= new MergeArrayZigZag();
	int[] z=s.zigZag(a, b);
	for (int i = 0; i < z.length; i++) {
		System.out.print(z[i]);
		if(i<z.length-1)
			System.out.print(",");
	}
	
}
	int[] zigZag(int a[], int b[]) {
		
int[] m= new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&i<b.length)
		{
			m[k++]=a[i++];
			m[k++]=b[j++];
		}
		while(i<a.length)
		{
			m[k++]=a[i++];
		}
		while(j<b.length)
		{
			m[k++]=b[j++];
		}
		return m;
	}
}
