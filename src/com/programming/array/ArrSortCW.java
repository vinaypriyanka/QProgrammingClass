package com.programming.array;

public class ArrSortCW {

	public static void main(String[] args) {
		
		int a[]= {34,56,67,78};
		int b[]={23,45,99};
		ArrSortCW x= new ArrSortCW();
		int[] ms = x.mergeTwoSortedArray(a, b);
		for (int i = 0; i < ms.length; i++) {
			System.out.print(ms[i]+" ");
		}
	}
	int [] mergeTwoSortedArray(int a[],int b[]){
		
		int i = 0;
		int k=0;
		int j=0;
		int[] rs= new int[a.length+b.length];
		while( i<a.length && i <b.length){
			if(a[i]<b[j]){
				rs[k]=a[i];
				k++;
				i++;
			}
			else
			{
				rs[k++]=b[j++];
			}
				
		}
		
		while (i<a.length) {
			rs[k++]=a[i++];
		}
		
		while (j<b.length) {
			rs[k++]=b[j++];
		}
			
		
		return rs;
		
	}
}
