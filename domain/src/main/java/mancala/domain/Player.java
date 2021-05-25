package mancala.domain;

// Make your own mancala implementation using your design.
// You can take this stub as an example how to make a 
// class inside a package and how to test it.

public class Player {
    boolean turn = true;

    public Player(){
    }
    
//  static void makePlayers(){
//       Player player1 = new Player();
//       Player player2 = new Player();
//       player2.turn = false;
//  }

//  public Player[] makePlayers(){
//       Player player1 = new Player();
//       Player player2 = new Player();
//       player2.turn = false;
//       Player[] Players = new Player[2];
//       Players[0] = player1;
//       Players[1] = player2;
//       return Players;
//  }

    public Player getOpponentPlayer(){
        return this;
    }
    public boolean getTurn() {
        if(this.turn == true){
            return true;
        }
        else{
            return false;
        }           
    }
    public boolean switchTurn(){
        if(turn == true){
            turn = false;
            return turn;
        }
        else{
            turn = true;
            return turn;
        }
    }
    
    public static void main(String[] args){
    }
}