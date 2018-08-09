package com.programming.array;

public class DeleteArrayElement {
	public static void main(String[] args) {
		int ar[]={23,34,56,67,78};
		DeleteArrayElement d= new DeleteArrayElement();
		d.deleteArr(ar, 3);
	}

	int[] deleteArr(int[] a,int in){
		
		if(in<0||in>=a.length)
			System.out.println("index out of range");
			return a;
			
			
			
			for (int i = 0; i < na.length; i++) {
				if(i<in)
					na[i]=a[i];
				else
					na[i]=a[i+1];
	}
		
			
		
		
		
		
		
		return na;
		
		
	}
}
