package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {
    @Test
    public void Length1Array_CheckTrue(){
        //Arrange
        SameFirstLast test = new SameFirstLast();
        int[] testArray = {1};
        //Act
        boolean check = test.isItTheSame(testArray);
        //Assert
        Assert.assertTrue(check);

    }

    @Test
    public void Length3ArrayFirstEqualsLast_CheckTrue(){
        //Arrange
        SameFirstLast test = new SameFirstLast();
        int[] testArray = {1,1,1};
        //Act
        boolean check = test.isItTheSame(testArray);
        //Assert
        Assert.assertTrue(check);

    }

    @Test
    public void Length3ArrayFirstNotEqualsLast_CheckFalse(){
        //Arrange
        SameFirstLast test = new SameFirstLast();
        int[] testArray = {1,3,4};
        //Act
        boolean check = test.isItTheSame(testArray);
        //Assert
        Assert.assertFalse(check);

    }
    @Test
    public void nullArray_CheckFalse(){
        //Arrange
        SameFirstLast test = new SameFirstLast();
        //Act
        boolean check = test.isItTheSame(null);
        //Assert
        Assert.assertFalse(check);
    }
}
