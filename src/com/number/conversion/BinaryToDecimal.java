package com.number.conversion;

public class BinaryToDecimal {
	int binToDec(int n ){
	
		int sum=0,c=0;
		while(n!=0){
			int r=n%10;
			sum=(int) (sum+r*Math.pow(2, c));
		
			c++;
			n=n/10;
		}
		return sum;
		
}
	public static void main(String[] args) {
		BinaryToDecimal b= new BinaryToDecimal();
		int d = b.binToDec(11011);
		System.out.println(d);
		
		
	}
}
