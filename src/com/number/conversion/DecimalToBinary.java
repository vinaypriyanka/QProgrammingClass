package com.number.conversion;

public class DecimalToBinary {
	String decToBin(int n){
	 String bin="";
		while(n>0){
			int r=n%2;
			bin= r+bin;
			n=n/2;
		}
		return bin;
 }
	
	public static void main(String[] args) {
		DecimalToBinary d= new DecimalToBinary();
		String s = d.decToBin(18);
		System.out.println(s);
	}

}
