package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {


    //You have no style, but your date does, you don't get the table
    @Test
    public void YouNoStyleDateYesStyle_Check0(){
        //Arrange
        DateFashion newDate = new DateFashion();
        int youFashion = 2;
        int dateFashion = 8;
        //Act
        int tableVal = newDate.getATable(youFashion,dateFashion);
        //Assert
        Assert.assertEquals(0,tableVal);
    }

    //You have style but your date doesn't, you don't get the table
    @Test
    public void YouYesStyleDateNoStyle_Check0(){
        //Arrange
        DateFashion newDate = new DateFashion();
        int youFashion = 8;
        int dateFashion = 2;
        //Act
        int tableVal = newDate.getATable(youFashion,dateFashion);
        //Assert
        Assert.assertEquals(0,tableVal);
    }

    //You and your date have mediocre Style, you may get the table
    @Test
    public void YouAndDateMediocreStyle_Check1(){
        //Arrange
        DateFashion newDate = new DateFashion();
        int youFashion = 5;
        int dateFashion = 5;
        //Act
        int tableVal = newDate.getATable(youFashion,dateFashion);
        //Assert
        Assert.assertEquals(1,tableVal);
    }

    //You have mediocre style, but your date has style, you get the table
    @Test
    public void YouMediocreDateYesStyle_Check2() {
        //Arrange
        DateFashion newDate = new DateFashion();
        int youFashion = 5;
        int dateFashion = 8;
        //Act
        int tableVal = newDate.getATable(youFashion,dateFashion);
        //Assert
        Assert.assertEquals(2,tableVal);
    }

    //You have style, but your date has mediocre style, you get the table
    @Test
    public void YouYesStyleDateMediocreStyle_Check2() {
        //Arrange
        DateFashion newDate = new DateFashion();
        int youFashion = 8;
        int dateFashion = 5;
        //Act
        int tableVal = newDate.getATable(youFashion,dateFashion);
        //Assert
        Assert.assertEquals(2,tableVal);
    }

}
