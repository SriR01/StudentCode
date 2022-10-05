package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the search word?");
        String searchWord = input.nextLine();
        System.out.println("What is the replacement word?");
        String replacementWord = input.nextLine();
        System.out.println("What is the source file?");
        String sourceFilePath = input.nextLine();
        File sourceFile = new File(sourceFilePath);
        System.out.println("What is the destination file?");
        String destinationFilePath = input.nextLine();
        File destinationFile = new File(destinationFilePath);
        try {
            Scanner fileScanner = new Scanner(sourceFile);
            PrintWriter fileWriter = new PrintWriter(destinationFile);
            while(fileScanner.hasNextLine()) {
                String scannedLine = fileScanner.nextLine();
                if (scannedLine.contains(searchWord)) {
                    String newLine = scannedLine.replace(searchWord,replacementWord);
                    fileWriter.println(newLine);
                    System.out.println(newLine);
                } else {
                    fileWriter.println(scannedLine);
                    System.out.println(scannedLine);
                }
                fileWriter.flush();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
