package com.programming.array;

public class SearchElement {

	int ar[] = { 22, 11, 23, 11, 15, 19 };
	int inx = search(ar, 15);

	//display(ar);
	if (inx>=0)
	System.out.println ("your element found at index "+inx);
	else
	System.out.println ("not valid");
	}

	static void display(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(i + "------->" + a[i]);
	}

	static int search(int a[], int ele) {
		for (int i = 0; i < a.length; i++) {
			if (ele == a[i])
				return i;
		}
		return -1;
	}
}
