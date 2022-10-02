package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {
    //First Value Larger Provided (5,0,3) check (5,5,5)
    @Test
    public void FirstValLargerProvided_CheckFirstVal() {
        //Arrange
        MaxEnd3 test = new MaxEnd3();
        int[] testArray = {5,0,3};
        int[] checkArray = {5,5,5};
        //Act
        int[] maxEndArray = test.makeArray(testArray);
        //Assert
        Assert.assertArrayEquals(maxEndArray,checkArray);
    }

    //Last Value Larger Provided (3,0,5) check (5,5,5)
    @Test
    public void LastValLargerProvided_CheckLastVal() {
        //Arrange
        MaxEnd3 test = new MaxEnd3();
        int[] testArray = {3,0,5};
        int[] checkArray = {5,5,5};
        //Act
        int[] maxEndArray = test.makeArray(testArray);
        //Assert
        Assert.assertArrayEquals(maxEndArray,checkArray);
    }
    //Middle Value Larger Provided (3,7,5) check (5,5,5)
    @Test
    public void MiddleValLargerProvided_CheckLastVal() {
        //Arrange
        MaxEnd3 test = new MaxEnd3();
        int[] testArray = {3,7,5};
        int[] checkArray = {5,5,5};
        //Act
        int[] maxEndArray = test.makeArray(testArray);
        //Assert
        Assert.assertArrayEquals(maxEndArray,checkArray);
    }
    //Same Value Provided (3,7,3) check (3,3,3)
    @Test
    public void SameValLargerProvided_CheckVal() {
        //Arrange
        MaxEnd3 test = new MaxEnd3();
        int[] testArray = {3,7,3};
        int[] checkArray = {3,3,3};
        //Act
        int[] maxEndArray = test.makeArray(testArray);
        //Assert
        Assert.assertArrayEquals(maxEndArray,checkArray);
    }
    //Two Negative Provided (-1,0,-5) check (-1,-1,-1)
    @Test
    public void NegativeValProvided_CheckLarger() {
        //Arrange
        MaxEnd3 test = new MaxEnd3();
        int[] testArray = {-1,0,-5};
        int[] checkArray = {-1,-1,-1};
        //Act
        int[] maxEndArray = test.makeArray(testArray);
        //Assert
        Assert.assertArrayEquals(maxEndArray,checkArray);
    }
}
