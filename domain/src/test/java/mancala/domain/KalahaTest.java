package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KalahaTest{

    @Test
    public void MakingFirstSmallBowl(){
        SmallBowl s0 = new SmallBowl();
        Kalaha k0 = new Kalaha(s0);
        Player p0 = new Player(k0);
        assertEquals(s0, p0.getKalaha().getNextBowl());
    }


}