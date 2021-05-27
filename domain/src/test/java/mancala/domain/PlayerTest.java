package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void TestingGetKalahaMethod(){
        Kalaha k0 = new Kalaha();
        Player p0 = new Player(k0);
        assertEquals(k0, p0.getKalaha());
    }

    @Test
    public void MakingPlayersWithDifferentTurn(){
        SmallBowl s0 = new SmallBowl();
        Kalaha k0 = new Kalaha(s0);
        Player p0 = new Player(k0);
        Player[] Players = p0.makePlayers();
        assertNotEquals(Players[0].turn, Players[1].turn);
    }

    @Test
    public void SwitchingAPlayersTurn(){
        Kalaha k0 = new Kalaha();
        Player p0 = new Player(k0);
        Player[] Players = p0.makePlayers();
        assertNotEquals(Players[0].turn, Players[0].switchTurn());
    }

    @Test
    public void ReadOpponentPlayer(){
        Kalaha k0 = new Kalaha();
        Player p0 = new Player(k0);
        Player[] Players = p0.makePlayers();
        assertNotEquals(Players[0], Players[0].getOpponentPlayer(Players[0], Players[0], Players[1]));
    }
}