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
        if(i==6 || i==13){
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
        int indexNew = ((this.getIndex() + choice)%14);
        if(indexNew==0){
            indexNew = 14;
        }
        Bowl tempBowl = this;
        for(int i = 0; i < 14; i++){
            tempBowl = tempBowl.getNextBowl();
            if(indexNew == tempBowl.getIndex()){
                break;
            }
        }
        return tempBowl;
/*
        while(indexNew != tempBowl.getIndex()){
            tempBowl = tempBowl.getNextBowl();
        }
        return tempBowl;
*/
    }

    public int getIndex(){
        return this.index;
    }

    public int getStones(){
        return this.stones;
    }

    public Bowl setStones(int newAmount){
        this.stones = newAmount;
        return this;
    }

    public Bowl addStone(){
        this.stones++;
        return this;
    }

    public Bowl emptyBowl(){
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
            if(this.getNextBowl(i).getPlayer() != this.player && (this.getNextBowl(i).getIndex() == 7 || this.getNextBowl(i).getIndex() == 14)){
                rocksInHand++;
            }
            else{
                this.getNextBowl(i).addStone();
            }
        }
        bowlOfFinalStone = this.getNextBowl(rocksInHand);
        if(bowlOfFinalStone.getStones() == 1){
            bowlOfFinalStone.tryToSteal();
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

    public void tryToSteal(){
        if(this.getOppositeBowl().getStones() > 0){
            int stonesToSteal = this.getStones() + this.getOppositeBowl().getStones();
            this.emptyBowl();
            this.getOppositeBowl().emptyBowl();
            if(this.getIndex() < 7){
                int currentStones = this.getNextBowl(7-this.getIndex()).getStones();
                this.getNextBowl(7-this.getIndex()).setStones(currentStones + stonesToSteal);
            }
            else{
                int currentStones = this.getNextBowl(14-this.getIndex()).getStones();
                this.getNextBowl(14-this.getIndex()).setStones(currentStones + stonesToSteal);
            }
        }
    }
}

