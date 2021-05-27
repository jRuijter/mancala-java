package mancala.domain;

class SmallBowl implements Bowl{  
    Bowl neighbor;
    int index;

    public SmallBowl(){
        this.index = 1;
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
}

