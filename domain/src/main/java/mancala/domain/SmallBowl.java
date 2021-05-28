package mancala.domain;

class SmallBowl implements Bowl{  
    Bowl neighbor;
    int index;
    int stones = 4;
    Player player;

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
}

