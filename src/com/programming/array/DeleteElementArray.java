package com.programming.array;

public class DeleteElementArray {
public static void main(String[] args) {
	DeleteElementArray d= new DeleteElementArray();
	d.deleteElement(9);
}
	
public void deleteElement(int a){
	int arg[] = { 5, 6, 8, 9, 10 };
	// Delete the Array Element position
	int pos = 3;
	// Before Delete Array Output
	for (int k = 0; k < arg.length; k++) {
	System.out.println(arg[k]);
	}
	for (int i = 0; i < arg.length; i++) {
	// Delete Function
	if (pos == i) {
	for (int j = i + 1; i < arg.length - 1; j++) {
	arg[i] = arg[j];
	i++;
	}
	}
	}
	// After delete the array element Output
	System.out.println("The output of Array After Delete");
	for (int i = 0; i < arg.length - 1; i++) {
	System.out.println(arg[i]);
	}
	
}




}
