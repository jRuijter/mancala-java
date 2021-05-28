package mancala.domain;

class SmallBowl implements Bowl{  
    Bowl neighbor;
    int index;
    int stones = 4;
    Player player;
    int rocksInHand = 0;
    Bowl bowlOfFinalStone;

    public SmallBowl(){
        this.index = 1;
        this.player = new Player();
        this.neighbor = new SmallBowl(this, index+1); 
    }

    public SmallBowl(SmallBowl nr1, int i){
        if(i==6 || i == 13){
            this.index = i;
            i++;
            this.neighbor = new Kalaha(nr1, i);
        }
        else {
            this.index = i;
            i++;
            this.neighbor = new SmallBowl(nr1, i);
        }
        if(i<8){
            this.player = nr1.player;
        }
        if(i>7){
            this.player = nr1.player.getOpponent();
        }
    }

    public Bowl getNextBowl(){
        return this.neighbor;
    }

    public Bowl getNextBowl(int choice){
        int indexNew = this.getIndex() + (choice%14);
        Bowl tempBowl = this;
        while(indexNew != tempBowl.getIndex()){
            tempBowl = tempBowl.getNextBowl();
        }
        return tempBowl;
    }

    public int getIndex(){
        return this.index;
    }

    public int getStones(){
        return this.stones;
    }

    public SmallBowl setStones(int newAmount){
        this.stones = newAmount;
        return this;
    }

    public Bowl addStone(){
        this.stones++;
        return this;
    }

    public SmallBowl emptyBowl(){
        this.stones = 0;
        return this;
    }

    public Player getPlayer(){
        return this.player;
    }

    public void play(){
        if(this.player.getTurn() == true && this.stones > 0){
            playTurn();
        }
    }

    public void playTurn(){
        rocksInHand = this.stones;
        this.emptyBowl();
        for(int i = 1; i <= rocksInHand; i++){
            if(this.getNextBowl(i).getPlayer() == this.player.getOpponent() && (this.getNextBowl(i).getIndex() == 7 || this.getNextBowl(i).getIndex() == 14)){
            }
            else{
                this.getNextBowl(i).addStone();
            }
        }
        bowlOfFinalStone = this.getNextBowl(rocksInHand);
        if(bowlOfFinalStone.stones == 1){

        }

        if(bowlOfFinalStone.getIndex() == 7 || bowlOfFinalStone.getIndex() == 14){
        }
        else{
            this.player.switchTurn();
        }
    }

    public Bowl getOppositeBowl(){
        int stepsToKalaha = 14-this.getIndex();
        Bowl oppositeBowl = this;
        for(int j = 0; j < 14; j++){
            if(stepsToKalaha == this.getNextBowl(j).getIndex()){
                oppositeBowl = this.getNextBowl(j);
                break;
            }
        }
        return oppositeBowl;
    }
}

