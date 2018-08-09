package com.programming.example;

public class ElseAndIf {
	static int people = 30, cars = 20, buses = 10;

	public static void main(String[] args) {
		if (people > cars) {
			System.out.println("people greater than cars");
		} else if (people < cars) {
			System.out.println("people less than cars");
		} else {
			System.out.println("people equal to cars");
		}

		if (cars > buses) {
			System.out.println("cars greater than buses");
		} else if (cars < buses) {
			System.out.println("cars less than busses");
		} else {
			System.out.println("cars equal to cars");
		}

	}
}
