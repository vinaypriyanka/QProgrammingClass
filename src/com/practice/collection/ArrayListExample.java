package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	String name;
	int age;

	public ArrayListExample(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ArrayListExample [name=" + name + ", age=" + age + "]\n";
	}

	public static void main(String[] args) {

		ArrayListExample a1 = new ArrayListExample("vinay", 22);

		ArrayList h = new ArrayList(Arrays.asList(a1));
		System.out.println(a1);
	}
}
