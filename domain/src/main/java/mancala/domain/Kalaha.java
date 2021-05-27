package mancala.domain;

public class Kalaha implements Bowl {
    Bowl neighbor;
    int index;
    int stones = 0;

    public Kalaha(SmallBowl nr1, int i){
        if(i==14){
            this.index = i;
            this.neighbor = nr1;
        }
        else{ 
            this.index = i;
            i++;
            this.neighbor = new SmallBowl(nr1, i);
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

    public Bowl addStone(){
        this.stones++;
        return this;
    }
}

