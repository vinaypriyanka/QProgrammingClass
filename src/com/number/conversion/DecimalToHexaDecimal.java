package com.number.conversion;

public class DecimalToHexaDecimal {

	String decToHex(int n) {
		String hex = "";
		while (n != 0) {
			int r = n / 16;
			if (r < 10) {
				hex = r + hex;
			} else {
				hex = (char) (r + 55) + hex;
			}
			n = n / 16;
		}
		return hex;
	}

	public static void main(String[] args) {
		DecimalToHexaDecimal d = new DecimalToHexaDecimal();
		String h = d.decToHex(50);
		System.out.println(h);
	}

}
