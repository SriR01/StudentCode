package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class Lucky13Tests {
    //Array with 1 Provided False Expected
    @Test
    public void ArrayWith1Provided_FalseExpected(){
        //Arrange
        Lucky13 test = new Lucky13();
        int[] testValArray = {1,2,3,4,5};
        //Act
        boolean testVal = test.getLucky(testValArray);
        //Assert
        Assert.assertFalse(testVal);
    }
    //Array with 3 Provided False Expected
    @Test
    public void ArrayWith3Provided_FalseExpected(){
        //Arrange
        Lucky13 test = new Lucky13();
        int[] testValArray = {0,2,3,4,5};
        //Act
        boolean testVal = test.getLucky(testValArray);
        //Assert
        Assert.assertFalse(testVal);
    }

    //Array with 1 and 3 Provided False Expected
    @Test
    public void ArrayWith1And3Provided_FalseExpected(){
        //Arrange
        Lucky13 test = new Lucky13();
        int[] testValArray = {1,2,3,4,5};
        //Act
        boolean testVal = test.getLucky(testValArray);
        //Assert
        Assert.assertFalse(testVal);
    }
    //Array without 1 and 3 Provided True Expected
    @Test
    public void ArrayWithout1And3Provided_TrueExpected(){
        //Arrange
        Lucky13 test = new Lucky13();
        int[] testValArray = {0,2,7,4,5};
        //Act
        boolean testVal = test.getLucky(testValArray);
        //Assert
        Assert.assertTrue(testVal);
    }

    //Array with negative values provided, True Expected
    @Test
    public void ArrayWithNegativeValuesProvided_TrueExpected(){
        //Arrange
        Lucky13 test = new Lucky13();
        int[] testValArray = {-1,2,-3,4,5};
        //Act
        boolean testVal = test.getLucky(testValArray);
        //Assert
        Assert.assertTrue(testVal);
    }
}
