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
        assertEquals(s0.getNextBowl(9).getIndex(), 10);
    }

    

}