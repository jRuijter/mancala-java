package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallBowlTest{

    @Test
    public void CheckingGetNextBowl2Steps(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getNextBowl().getNextBowl().getIndex(), 3);
    }
    @Test
    public void CheckingGetNextBowl15Steps(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(2, s0.getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getNextBowl().getIndex());
    }

    @Test
    public void TestingGetNextBowlTwice(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getNextBowl(8).getNextBowl(3).getIndex(), 12);
    }

    @Test
    public void TestingGetNextBowlWithInt15Steps(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getNextBowl(15).getIndex(), 2);
    }

    @Test
    public void TestingGetNextBowlWithIntEndsInKalaha(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getNextBowl(6).getIndex(), 7);
    }

    @Test
    public void CheckGetStonesSmallBowl(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(4, s0.getStones());
    }

    @Test
    public void CheckSetStones(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.setStones(5).getStones(), 5);
    }

    @Test
    public void CheckAddStoneSmallBowl(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.addStone().getStones(), 5);
    }

    @Test
    public void CheckEmptyingSmallBowl(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.emptyBowl().getStones(), 0);
    }

    @Test
    public void PlayAMove(){
        SmallBowl s0 = new SmallBowl();
        s0.play();
        assertEquals(s0.getStones(), 0);
        assertEquals(s0.getNextBowl(2).getStones(), 5);
        assertEquals(s0.getPlayer().getTurn(), false);
    }

    @Test
    public void CheckFinalStoneOfMove(){
        SmallBowl s0 = new SmallBowl();
        int temprocks = s0.getStones();
        s0.play();
        assertEquals(s0.bowlOfFinalStone, s0.getNextBowl(temprocks));
    }

    @Test
    public void SkipOpponentsKalahaDuringMove(){
        SmallBowl s0 = new SmallBowl();
        s0.setStones(14);
        s0.play();
        assertEquals(0, s0.getNextBowl(13).getStones());
    //    assertEquals(0, s0.getStones()); //not true anymore because of stealing
    }

    @Test
    public void FinalStoneEndsInOwnKalaha(){
        SmallBowl s0 = new SmallBowl();
        s0.setStones(6);
        s0.play();
        assertEquals(s0.getPlayer().getTurn(), true);
        assertEquals(s0.getPlayer().getOpponent().getTurn(), false);
    }

    @Test
    public void CheckOppositeBowlFromP1Side(){
        SmallBowl s1 = new SmallBowl(); 
        assertEquals(s1.getOppositeBowl().getIndex(), 13);
        assertEquals(s1.getNextBowl(3).getOppositeBowl().getIndex(), 10);
    }

    @Test
    public void CheckOppositeBowlFromP2Side(){
        SmallBowl s1 = new SmallBowl();
 //       assertEquals(s1.getNextBowl(10).getOppositeBowl().getIndex(), 3);
    }

    @Test
    public void FinalStoneEndsInOwnEmptyBowlAndStealingIsPossible(){
        SmallBowl s0 = new SmallBowl();
        s0.getNextBowl(4).emptyBowl();
        s0.play();
        assertEquals(s0.getNextBowl(6).getStones(), 5); //should be 5
        assertEquals(s0.getNextBowl(4).getOppositeBowl().getStones(), 0); //should be 0
        assertEquals(s0.getNextBowl(4).getStones(), 0); //should be 0
    }
}