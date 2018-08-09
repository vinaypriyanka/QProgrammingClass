package com.programming.array;

public class SearchArrayElement {

	public static void main(String[] args) {
		SearchArrayElement s= new SearchArrayElement();
		System.out.println(s.searchElement(8));
	}
	
	int searchElement(int a){
		int b[]={2,4,6,8,9};
		for (int i = 0; i < b.length; i++) {
			if(b[i]==a)
				return i;
			
		}
		return -1;
		
	}
	
}
