package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {

    // Normal String ("Chocolate") and Integer Value (3) provided, "Chochocho" expected
    @Test
    public void NormalStringNormalIntValProvided_CheckChoChoCho() {
        //Arrange
        FrontTimes Test1 = new FrontTimes();
        String stringVal = "Chocolate";
        int intVal = 3;
        //Act
        String frontVal = Test1.generateString(stringVal,intVal);
        //Assert
        Assert.assertEquals("ChoChoCho",frontVal);
    }


    // String length < 3 ("Ch") and Integer Value (5) provided, "ChChChChCh" expected
    @Test
    public void ShortStringNormalIntValProvided_CheckChChChChCh() {
        FrontTimes Test1 = new FrontTimes();
        String stringVal = "Ch";
        int intVal = 5;
        //Act
        String frontVal = Test1.generateString(stringVal,intVal);
        //Assert
        Assert.assertEquals("ChChChChCh", frontVal);

    }


    // Normal String ("Chocolate") and Negative Integer Value (-1) provided, empty string expected
    @Test
    public void NormalStringNegativeIntValProvided_CheckEmptyString() {
        FrontTimes Test1 = new FrontTimes();
        String stringVal = "Chocolate";
        int intVal = -1;
        //Act
        String frontVal = Test1.generateString(stringVal,intVal);
        //Assert
        Assert.assertEquals("", frontVal);
    }



    // null string and Normal Integer Value (3) provided, empty string expected
    @Test
    public void NullStringNormalIntValProvided_CheckEmptyString(){
        FrontTimes Test1 = new FrontTimes();
        int intVal = 3;
        //Act
        String frontVal = Test1.generateString(null,intVal);
        //Assert
        Assert.assertEquals("", frontVal);

    }



    // Empty String and Normal Integer Value (3) provided, empty string expected
    @Test
    public void EmptyStringNormalIntValProvided_CheckEmptyString() {
        FrontTimes Test1 = new FrontTimes();
        String stringVal = "";
        int intVal = 3;
        //Act
        String frontVal = Test1.generateString(stringVal,intVal);
        //Assert
        Assert.assertEquals("", frontVal);

    }



}
