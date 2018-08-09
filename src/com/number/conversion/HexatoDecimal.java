package com.number.conversion;

public class HexatoDecimal {

	int hexToDec(String s) {

		int sum = 0, c = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			char ch = s.charAt(i);
			int v = 0;
			if (ch >= 'A' && ch <= 'Z')
				v = ch - 55;
			else if (ch >= 'a' && ch <= 'z')
				v = ch - 87;
			else
				v = ch - 48;

			sum = (int) (sum + v * Math.pow(16, c));
			c++;
		}

		return sum;
	}
	
	public static void main(String[] args) {
		HexatoDecimal h= new HexatoDecimal();
		 int b = h.hexToDec("A2B");
		 System.out.println(b);
		
	}
}
