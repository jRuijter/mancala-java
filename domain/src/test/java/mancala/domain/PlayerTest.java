package mancala.domain;

// Your test class should be in the same 
// package as the class you're testing.
// Usually the test directory mirrors the
// main directory 1:1. So for each class in src/main,
// there is a class in src/test.

// Import our test dependencies. We import the Test-attribute
// and a set of assertions.
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
 //   @Test
 //   public void MakingPlayers(){
 //       Kalaha kalaha1 = new Kalaha();
 //       kalaha1.makePlayers();
 //       assertNotEquals(Players[0].turn, Players[1].turn);
 //   }


    @Test
    public void SwitchingAPlayersTurn(){
        Player player1 = new Player();
        Player player2 = new Player();
        assertEquals(false, player1.switchTurn());
    }

    @Test
    public void ReadOpponentPlayer(){
        Player player1 = new Player();
        Player player2 = new Player();
        assertNotEquals(player1, player2);
    }
}