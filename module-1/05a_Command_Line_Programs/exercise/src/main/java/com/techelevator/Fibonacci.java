package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	/*
	Write a command-line program which prompts the user for an integer value and display the Fibonacci sequence leading
	up to that number:

	Please enter a number: 17

	0, 1, 1, 2, 3, 5, 8, 13

	The Fibonacci sequence always starts with 0 and 1. If the input is 0 or a negative number, print "0, 1":

	Please enter a number: 0

	0, 1

	If the input is 1, print "0, 1, 1":

	Please enter a number: 1

	0, 1, 1
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstVal = 0;
		int nextVal = 1;
		int sumVal = 0;
		System.out.print("Please enter a number: ");
		int maxNumber = input.nextInt();
		System.out.print(firstVal + ", " + nextVal);
		while (sumVal <= maxNumber) {
			sumVal = firstVal + nextVal;
			if (sumVal > maxNumber) {
				break;
			}
			System.out.print(", " +sumVal);
			firstVal = nextVal;
			nextVal = sumVal;
		}
	}
}



