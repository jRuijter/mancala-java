package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    
    @Test
    public void CheckingPlayersTurn(){
        Player p1 = new Player();
        assertNotEquals(p1.getTurn(), p1.getOpponent().getTurn());
    }

    @Test
    public void SwitchingPlayersTurn(){
        Player p1 = new Player();
        assertNotEquals(p1.getTurn(), p1.switchTurn().getTurn());
    }

    @Test
    public void CheckingPlayersSideFirstBowlWithOwnBowl(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getPlayer(), s0.getNextBowl(4).getPlayer());
    }

    @Test
    public void CheckingPlayersSideFirstBowlWithOpponentsBowl(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getPlayer().getOpponent(), s0.getNextBowl(7).getPlayer());
    }

    @Test
    public void CheckingPlayersSideFirstBowlWithOwnKalaha(){
        SmallBowl s0 = new SmallBowl();
        assertEquals(s0.getPlayer(), s0.getNextBowl(6).getPlayer()); //changed to getNextBowl(7) to fail test, should be (6)
    }
}
