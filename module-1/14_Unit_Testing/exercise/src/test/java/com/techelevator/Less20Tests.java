package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {

    //Negative Value Provided, False Expected
    @Test
    public void NegativeValProvided_CheckFalse() {
        //Arrange
        Less20 test = new Less20();
        int testVal = -40;
        //Act
        boolean check = test.isLessThanMultipleOf20(testVal);
        //Assert
        Assert.assertFalse(check);
    }
    //Multiple Value Provided, False Expected
    @Test
    public void MultipleValProvided_CheckFalse() {
        //Arrange
        Less20 test = new Less20();
        int testVal = 40;
        //Act
        boolean check = test.isLessThanMultipleOf20(testVal);
        //Assert
        Assert.assertFalse(check);
    }

    //Multiple-1 Provided, True Expected
    @Test
    public void OneLessMultipleProvided_CheckTrue() {
        //Arrange
        Less20 test = new Less20();
        int testVal = 39;
        //Act
        boolean check = test.isLessThanMultipleOf20(testVal);
        //Assert
        Assert.assertTrue(check);
    }

    //Multiple-2 Provided, True Expected
    @Test
    public void TwoLessMultipleProvided_CheckTrue() {
        //Arrange
        Less20 test = new Less20();
        int testVal = 38;
        //Act
        boolean check = test.isLessThanMultipleOf20(testVal);
        //Assert
        Assert.assertTrue(check);
    }

}
