package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	/*
	-temperatureCelsius = (temperatureFarenheit - 32) / 1.8
	-temperatureFarenheit = temperatureCelsius * 1.8 + 32
	-Please enter the temperature: 58
	Is the temperature in (C)elsius, or (F)ahrenheit? F
	58F is 14C.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temperatureCelsius;
		double temperatureFahrenheit;
		int convertedTemp;
		char conversionUnit;
		System.out.print("Please enter the temperature: ");
		int temp = input.nextInt();
		System.out.print("Is the temperature in (C)elsius or (F)ahrenheit? ");
		String tempUnitString = input.next();
		char tempUnit = tempUnitString.charAt(0);
		if (tempUnit == 'F') {
			temperatureFahrenheit = temp;
			conversionUnit = 'C';
			temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;
			convertedTemp = (int) temperatureCelsius;
		} else {
			temperatureCelsius = temp;
			conversionUnit = 'F';
			temperatureFahrenheit = temperatureCelsius * 1.8 + 32;
			convertedTemp = (int) temperatureFahrenheit;
		}
		System.out.println(temp + tempUnitString + " is " + convertedTemp + conversionUnit);
	}
}
