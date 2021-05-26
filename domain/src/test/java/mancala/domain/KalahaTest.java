package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KalahaTest{

    @Test
    public void MakingKalahas(){
        Kalaha k0 = new Kalaha();
        Kalaha[] Kalahas = k0.makeKalahas();
        assertNotEquals(Kalahas[0], Kalahas[1]);
    }

    @Test
    public void combinePlayerWithKalaha(){
        Kalaha k0 = new Kalaha();
        Kalaha[] Kalahas = k0.makeKalahas();
        Player p0 = new Player();
        Player[] Players = p0.makePlayers();
        Players[0].setKalaha(Kalahas[0]);
        assertEquals(Kalahas[0], Players[0].getKalaha());
    }

}