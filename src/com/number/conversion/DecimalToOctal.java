package com.number.conversion;

public class DecimalToOctal {

	String decToOct(int n)
	{
		String oct="";
		while(n!=0){
			int r= n%8;
			oct=oct+r;
			n=n/8;
		}
		return oct;
	}
}
