package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {
	public static void main(String[] args) {
		boolean isCaseSensitive;
		Scanner input = new Scanner(System.in);
		int lineNumber = 0;
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String filePath = input.nextLine();
		File dataFile = new File(filePath);
		System.out.println("What is the search word you are looking for?");
		String searchWord = input.nextLine();
		System.out.println("Should the search be case sensitive? (Y\\N)");
		isCaseSensitive = input.next().equals("Y");
		try {
			Scanner dataFileScanner = new Scanner(dataFile);
			while (dataFileScanner.hasNextLine()) {
				lineNumber++;
				String nextLine = dataFileScanner.nextLine();
				if(isCaseSensitive) {
					if (nextLine.contains(searchWord)){
						System.out.println(lineNumber + ") " + nextLine);
					}
				} else {
					String insensitiveLine = nextLine.toUpperCase();
					if (insensitiveLine.contains(searchWord.toUpperCase())) {
						System.out.println(lineNumber + ") " + nextLine);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("The file does not exist");
		}
		}

	}

