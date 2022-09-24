package com.techelevator;

public class FruitTree {

    /*
Instance variables
Attribute	        Data Type	Get	Set	Description
typeOfFruit	        String	    X		The type of fruit on the tree.
piecesOfFruitLeft	int	        X		The number of remaining fruit pieces on the tree.

Constructor
Create a constructor for this class that accepts two parameters: String typeOfFruit and int startingPiecesOfFruit. Use these parameters to set the instance variables of the class.

Methods
Create a method called pickFruit that accepts an int called numberOfPiecesToRemove and returns a boolean.

If there are enough pieces left on the tree, it "picks" the fruit and updates piecesOfFruitLeft by subtracting numberOfPiecesToRemove from it.
The method returns true if there were enough pieces left to pick. It returns false if no fruit was picked—that is, piecesOfFruitLeft was less than numberOfPiecesToRemove.
     */

    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }


    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft >= numberOfPiecesToRemove){
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;
        } else {
            return false;
        }
    }
}
