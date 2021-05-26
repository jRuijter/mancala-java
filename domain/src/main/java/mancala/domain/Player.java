package mancala.domain;

public class Player {
    boolean turn = true;
    Kalaha kalaha = new Kalaha();

    public Player(){
    }
    public Player[] makePlayers(){
       Player player1 = new Player();
       Player player2 = new Player();
       player2.turn = false;
       Player[] Players = new Player[2];
       Players[0] = player1;
       Players[1] = player2;
       return Players;
    }

    public Player getOpponentPlayer(Player currentPlayer, Player player1, Player player2){
        if(currentPlayer == player1){
            return player2;
        }
        else{
            return player1;
        }
    }
    public boolean getTurn() {
        return this.turn;    
    }
    public boolean switchTurn(){
        if(this.turn == true){
            this.turn = false;
        }
        else{
            this.turn = true;
        }
        return this.turn;
    }
    
    public void setKalaha(Kalaha kalaha1){
        kalaha = kalaha1;
    }
    public Kalaha getKalaha(){
        return this.kalaha;
    }

    public static void main(String[] args){
    }
}