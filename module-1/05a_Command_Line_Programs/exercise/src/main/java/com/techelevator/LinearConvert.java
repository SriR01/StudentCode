package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	/*
	-m = f * 0.3048
	-f = m * 3.2808399
	-Please enter the length: 58
	Is the measurement in (m)eter, or (f)eet? f
	58f is 17m.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double meters;
		double feet;
		int convertedLength;
		char conversionUnit;
		System.out.print("Please enter the length: ");
		int length = input.nextInt();
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String lengthUnitString = input.next();
		char lengthUnit = lengthUnitString.charAt(0);
		if (lengthUnit == 'f') {
			feet = length;
			conversionUnit = 'm';
			meters = feet * 0.3048;
			convertedLength = (int) meters;
		} else {
			meters = length;
			conversionUnit = 'f';
			feet = meters * 3.2808399;
			convertedLength = (int) feet;
		}
		System.out.println(length + lengthUnitString + " is " + convertedLength + conversionUnit + ".");
	}

}
