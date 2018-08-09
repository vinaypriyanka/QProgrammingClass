package com.programming.example;

public class WhatIf {
	public static void main(String[] args) {
		int people = 20, cats = 30, dogs = 15;
		if (people < cats) {
			System.out.println("too many cats");
		}
		if (people > cats) {
			System.out.println("Not many cats");
		}
		if (people < dogs) {
			System.out.println("the world is drooled");
		}
		if (people > dogs) {
			System.out.println("the world is dry");
		}
		dogs += 5;
		if (people > dogs) {
			System.out.println("greater than dogs");
		} else if (people < dogs) {
			System.out.println("less than dogs");
		} else if (people == dogs) {
			System.out.println("equal to dogs");
		}
	}
}
