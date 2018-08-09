/*write a program to calculate the least angle 
between hour arm and minute arm in an analog 12 hour watch
*/
package com.programming.example;

import java.util.Scanner;

public class ClockAngle {

	public static void main(String[] args) {
		double angle;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter hour");
		int hr = s.nextInt();
		s.nextLine();
		System.out.println("Enter minutes");
		int min = s.nextInt();

		if (hr <= 12 && min <= 60) {
			double hourangle = (hr * 30) + (min * 0.5);
			double minangle = min * 6;

			if (hourangle > minangle) {
				angle = hourangle - minangle;
			} else {
				angle = minangle - hourangle;
			}

			if (angle < 180) {
				System.out.println("the least angle is: " + angle);
			} else {

				System.out.println("the least angle is: " + (360 - angle));
			}

		} else {
			System.out.println("entered time is not valid");
		}

	}

}
