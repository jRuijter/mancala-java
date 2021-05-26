package mancala.domain;

public class Player {
    boolean turn = true;
    Kalaha kalaha = new Kalaha();

    public Player(){
    }
    public Player(Kalaha kalahaOfThisPlayer){
        kalaha = kalahaOfThisPlayer;
    }

    public Kalaha[] makeKalahas(){
        Kalaha kalaha1 = new Kalaha();
        Kalaha kalaha2 = new Kalaha();
        Kalaha[] Kalahas = new Kalaha[2];
        Kalahas[0] = kalaha1;
        Kalahas[1] = kalaha2;
        return Kalahas;
    }

    public Player[] makePlayers(){
       Kalaha k0 = new Kalaha();
       Kalaha[] Kalahas = k0.makeKalahas();
       Player player1 = new Player(Kalahas[0]);
       Player player2 = new Player(Kalahas[1]);
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