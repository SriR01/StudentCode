package com.techelevator;

public class HomeworkAssignment {

    /*
Instance variables
Attribute	Data Type	Get	Set	Description
earnedMarks	    int	    X	X	The total number of correct marks submitter received on the assignment.
possibleMarks	int	    X		The number of possible marks on the assignment.
submitterName	String	X		The submitter's name for the assignment.
letterGrade     String	X		The letter grade for the assignment.
Notes

letterGrade is a derived attribute that's calculated using earnedMarks and possibleMarks:
For 90% or greater, it returns "A"
For 80-89%, it returns "B"
For 70-79%, it returns "C"
For 60-69%, it returns "D"
Otherwise, it returns "F"
hint: possibleMarks and earnedMarks are ints. What happens when a smaller integer is divided by a larger integer?
Constructor
The HomeworkAssignment class has a single constructor. It accepts two arguments: int possibleMarks and
String submitterName. Use these parameters to set the instance variables of the class.
     */

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;


    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getPossibleMarks() {
        return this.possibleMarks;
    }

    public int getEarnedMarks() {
        return this.earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public String getSubmitterName() {
        return this.submitterName;
    }

    public String getLetterGrade() {
        double percentGrade = ((double) this.earnedMarks / (double) this.possibleMarks) * 100.0;
        System.out.println(percentGrade);
        if (percentGrade >= 90.0) {
            letterGrade = "A";
        } else if (percentGrade >= 80.0) {
            letterGrade = "B";
        } else if (percentGrade >= 70.0) {
            letterGrade = "C";
        } else if (percentGrade >= 60.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return this.letterGrade;
    }

}
