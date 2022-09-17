package com.techelevator;

import java.util.Scanner;
import java.util.Arrays;

public class DecimalToBinary {

	/*
		Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
		460 in binary is 111001100
		8218 in binary is 10000000011010
		1 in binary is 1
		31313 in binary is 111101001010001
		987654321 in binary is 111010110111100110100010110001
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String decimalString = input.nextLine();
		String[] decimalArray = decimalString.split(" ");
		int[] binaryArray = new int[decimalArray.length];
		for (int i = 0; i < decimalArray.length; i++) {
			int binaryVal;
			String binaryString = "";
			int decimalVal = Integer.parseInt(decimalArray[i]);
			int quotientVal = decimalVal;
			while (quotientVal != 0)  {
				binaryVal = decimalVal % 2;
				binaryString = binaryVal + binaryString;
				quotientVal = decimalVal/2;
				decimalVal = quotientVal;
			}
			System.out.println(decimalArray[i] + " in binary is " + binaryString);
		}

	}

}
