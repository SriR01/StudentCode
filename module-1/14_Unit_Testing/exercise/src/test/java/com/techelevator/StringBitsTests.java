package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {

    //Null String Provided Check Empty
    @Test
    public void nullStringProvided_CheckEmpty(){
        //Arrange
        StringBits test = new StringBits();
        String testString = null;
        //Act
        String checkString = test.getBits(null);
        //Assert
        Assert.assertEquals("",checkString);
    }
    //Empty String Provided Check Empty
    @Test
    public void emptyStringProvided_CheckEmpty(){
        //Arrange
        StringBits test = new StringBits();
        String testString = "";
        //Act
        String checkString = test.getBits(testString);
        //Assert
        Assert.assertEquals("",checkString);

    }
    //Number String Provided Check "02"
    @Test
    public void numberStringProvided_Check02(){
        //Arrange
        StringBits test = new StringBits();
        String testString = "0123";
        //Act
        String checkString = test.getBits(testString);
        //Assert
        Assert.assertEquals("02",checkString);

    }
    //Even Length String Provided check "02"
    @Test
    public void evenLengthStringProvided_Check1(){
        //Arrange
        StringBits test = new StringBits();
        String testString = "012";
        //Act
        String checkString = test.getBits(testString);
        //Assert
        Assert.assertEquals("02",checkString);

    }

    //Odd Length String Provided check "0"
    @Test
    public void oddLengthStringProvided_Check0(){
        //Arrange
        StringBits test = new StringBits();
        String testString = "01";
        //Act
        String checkString = test.getBits(testString);
        //Assert
        Assert.assertEquals("0",checkString);


    }
}
