package mancala.domain;


public class SmallBowl {
//    private int rocks = 0;
//    int countSmallBowls = 0;
    SmallBowl nextBowl;
    
    public SmallBowl(){   
    }

    public SmallBowl(SmallBowl currentBowl){
        nextBowl = currentBowl;
    }

    public SmallBowl getNextBowl(){
        return this.nextBowl;
    }
    
    
}

