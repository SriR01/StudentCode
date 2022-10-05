package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the destination filepath");
		String destinationFilepath = input.nextLine();
		File destinationFile = new File(destinationFilepath);
		try {
			PrintWriter writer = new PrintWriter(destinationFile);
			for (int i = 1; i<=300; i++) {
				boolean isFizzBuzz = false;
				if ((i % 3 == 0) && (i % 5 == 0)) {
					writer.println("FizzBuzz");
					isFizzBuzz = true;
				} else if ((i % 3 == 0) && (isFizzBuzz==false)) {
					writer.println("Fizz");
				} else if ((i % 5 == 0) && (isFizzBuzz==false)) {
					writer.println("Buzz");
				} else {
					writer.println(i);
				}
			}
			writer.flush();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found.");
		}
	}

}
