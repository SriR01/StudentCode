package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTests {
    //Null provided Check Empty Map
    @Test
    public void NullProvided_CheckEmpty(){
        //Arrange
        WordCount test = new WordCount();
        Map checkMap = new HashMap<String,Integer>();
        String[] checkArray = {""};
        //Act
        Map testMap = test.getCount(null);
        //Assert
        Assert.assertEquals(checkMap,testMap);
    }
    //Empty provided Check Empty Equals 1
    @Test
    public void EmptyProvided_CheckEmptyEquals1(){
        //Arrange
        WordCount test = new WordCount();
        Map checkMap = new HashMap<String,Integer>();
        checkMap.put("",1);
        String[] checkArray = {""};
        //Act
        Map testMap = test.getCount(checkArray);
        //Assert
        Assert.assertEquals(checkMap,testMap);
    }


    //No Equal Provided Check 1 Value each
    @Test
    public void NoneEqualProvided_Check1Each(){
        //Arrange
        WordCount test = new WordCount();
        Map checkMap = new HashMap<String,Integer>();
        checkMap.put("hello",1);
        checkMap.put("world",1);
        String[] checkArray = {"hello","world"};
        //Act
        Map testMap = test.getCount(checkArray);
        //Assert
        Assert.assertEquals(checkMap,testMap);
    }

    //Some Equal Provided Check Some Value Each
    @Test
    public void SomeEqualProvided_SomeEach(){
        //Arrange
        WordCount test = new WordCount();
        Map checkMap = new HashMap<String,Integer>();
        checkMap.put("ba",2);
        checkMap.put("black",1);
        checkMap.put("sheep",1);
        String[] checkArray = {"ba","ba","black","sheep"};
        //Act
        Map testMap = test.getCount(checkArray);
        //Assert
        Assert.assertEquals(checkMap,testMap);
    }


}
