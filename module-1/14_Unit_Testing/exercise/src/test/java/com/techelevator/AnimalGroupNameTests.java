package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    //Given known animal name, check herd name
    @Test
    public void ProvideKnownAnimalName_CheckHerdName() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        String animalName = "giraffe";
        //Act
        String herdName = animalGroup.getHerd(animalName);
        //Assert
        Assert.assertEquals("Tower", herdName);

    }

    //Given unknown animal name, check unknown herd name
    @Test
    public void ProvideUnknownAnimalName_CheckUnknown() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        //Act
        String animalName = animalGroup.getHerd("");
        String animalName2 = animalGroup.getHerd("elephants");
        //Assert
        Assert.assertEquals("unknown",animalName);
        Assert.assertEquals("unknown",animalName);
    }

    //Given null, check unknown herd name
    @Test
    public void ProvideNull_CheckUnknown() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        //Act
        String animalName = animalGroup.getHerd(null);
        //Assert
        Assert.assertEquals("unknown", animalName);
    }


    //Given known animal name with different letter-case, check herd name
    @Test
    public void ProvideDifferentCaseName_CheckKnownHerdName() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        //Act
        String animalName = animalGroup.getHerd("gIRaFFe");
        //Assert
        Assert.assertEquals("Tower",animalName);
    }

}
