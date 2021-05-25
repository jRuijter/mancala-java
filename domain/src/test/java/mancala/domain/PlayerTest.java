package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void MakingPlayers(){
        Player player1 = new Player();
        Player player2 = new Player();
        player2.turn = false;
        assertNotEquals(player1.turn, player2.turn);
    }
 
    @Test
    public void MakingPlayersViaMethod(){
        Player p0 = new Player();
        Player[] Players = p0.makePlayers();
        assertNotEquals(Players[0].turn, Players[1].turn);
    }

    @Test
    public void SwitchingAPlayersTurn(){
        Player player1 = new Player();
        assertNotEquals(player1.turn, player1.switchTurn());
    }

    @Test
    public void ReadOpponentPlayer(){
        Player p0 = new Player();
        Player[] Players = p0.makePlayers();
        assertNotEquals(Players[0], Players[0].getOpponentPlayer(Players[0], Players[0], Players[1]));
    }
}