package mancala.domain;

public class Player {
   boolean turn;
   Player opponent;

    public Player(){
        this.turn = true;
        this.opponent = new Player(this);
    }

    public Player(Player Opponent){
        this.turn = false;
        this.opponent = Opponent;
    }

    public boolean getTurn(){
        return this.turn;
    }

    public Player getOpponent(){
        return this.opponent;
    }

    

    public Player switchTurn(){
        if(this.turn == true){
            this.turn = false;
            return this;
        }
        else{
            this.turn = true;
            return this;
        }
    }
}