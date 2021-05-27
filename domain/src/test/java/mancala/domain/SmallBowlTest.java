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
    public void TestingGetNextBowlWithInt15Steps(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getNextBowl(15).getIndex(), 2);
    }

    @Test
    public void TestingGetNextBowlWithInt9Steps(){
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

}