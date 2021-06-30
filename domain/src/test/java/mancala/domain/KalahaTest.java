package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KalahaTest{

    @Test
    public void CheckGetStonesKalaha(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(0, s0.getNextBowl(6).getStones());
    }

    @Test
    public void CheckAddStoneSmallBowl(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getNextBowl(6).addStone().getStones(), 1);
    }


}