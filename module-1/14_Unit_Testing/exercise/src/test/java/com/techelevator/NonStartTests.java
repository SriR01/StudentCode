package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {
    // Null A and Null B Provided, Check Empty
    @Test
    public void NullANullBProvided_CheckEmpty(){
        //Arrange
        NonStart test = new NonStart();
        String a = null;
        String b = null;
        //Act
        String partialString = test.getPartialString(null,null);
        //Assert
        Assert.assertEquals("",partialString);
    }
    // Empty A and Empty B Provided, Check Empty
    @Test
    public void EmptyAEmptyBProvided_CheckEmpty(){
        //Arrange
        NonStart test = new NonStart();
        String a = "";
        String b = "";
        //Act
        String partialString = test.getPartialString(a,b);
        //Assert
        Assert.assertEquals("",partialString);
    }
    //Normal A and Normal B Provided, Check elloorld
    @Test
    public void NormalANormalBProvided_CheckElloOrld(){
        //Arrange
        NonStart test = new NonStart();
        String a = "hello";
        String b = "world";
        //Act
        String partialString = test.getPartialString(a,b);
        //Assert
        Assert.assertEquals("elloorld",partialString);
    }

    //2 char A and 2 char B provided, check hi
    @Test
    public void TwoCharATwoCharBProvided_Checkhi(){
        //Arrange
        NonStart test = new NonStart();
        String a = "ih";
        String b = "hi";
        //Act
        String partialString = test.getPartialString(a,b);
        //Assert
        Assert.assertEquals("hi",partialString);

    }

    // char A and char B provided, check empty
    @Test
    public void charAcharBProvided_CheckEmpty(){
        //Arrange
        NonStart test = new NonStart();
        String a = "c";
        String b = "v";
        //Act
        String partialString = test.getPartialString(a,b);
        //Assert
        Assert.assertEquals("",partialString);

    }


}
