package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {

    //Cigars within limit and isWeekend True Provided, True expected
    @Test
    public void ProvideCigarsAndIsWeekendTrue_CheckTrue() {
        //Arrange
        CigarParty party = new CigarParty();
        int cigars = 50;
        boolean isWeekend = true;
        //Act
        boolean partyVal = party.haveParty(cigars,isWeekend);
        //Assert
        Assert.assertEquals(true, partyVal);
    }

    //Cigars not within Lower limit, isWeekend True Provided, False expected
    @Test
    public void ProvideLessCigarsAndIsWeekendTrue_CheckFalse() {
        //Arrange
        CigarParty party = new CigarParty();
        int cigars = 30;
        boolean isWeekend = true;
        //Act
        boolean partyVal = party.haveParty(cigars,isWeekend);
        //Assert
        Assert.assertEquals(false, partyVal);
    }

    //Cigars not within lower limit, isWeekend False Provided, False expected
    @Test
    public void ProvideLessCigarsAndIsWeekendFalse_CheckFalse() {
        CigarParty party = new CigarParty();
        int cigars = 30;
        boolean isWeekend = false;
        //Act
        boolean partVal = party.haveParty(cigars,isWeekend);
        //Assert
        Assert.assertEquals(false, partVal);
    }

    //Cigars not within Higher limit, isWeekend False Provided, False expected
    @Test
    public void ProvideMoreCigarsAndIsWeekendFalse_CheckFalse(){
        //Arrange
        CigarParty party = new CigarParty();
        int cigars = 70;
        boolean isWeekend = false;
        //Act
        boolean partyVal = party.haveParty(cigars,isWeekend);
        //Assert
        Assert.assertEquals(false, partyVal);
    }

    //Cigars not within Higher limit, isWeekend True Provided, True expected
    @Test
    public void ProvideMoreCigarsAndIsWeekendTrue_CheckFalse(){
        //Arrange
        CigarParty party = new CigarParty();
        int cigars = 70;
        boolean isWeekend = true;
        //Act
        boolean partyVal = party.haveParty(cigars,isWeekend);
        //Assert
        Assert.assertEquals(true, partyVal);
    }

    //









}
