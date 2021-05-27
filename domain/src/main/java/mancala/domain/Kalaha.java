package mancala.domain;

public class Kalaha {
 //   private int rocks = 0;
    SmallBowl nextBowl = new SmallBowl();

    public Kalaha(SmallBowl smallBowlofThisPlayer){
        nextBowl = smallBowlofThisPlayer;
    }
    public Kalaha(){
    }

    public Kalaha[] makeKalahas(){
        Kalaha kalaha1 = new Kalaha();
        Kalaha kalaha2 = new Kalaha();
        Kalaha[] Kalahas = new Kalaha[2];
        Kalahas[0] = kalaha1;
        Kalahas[1] = kalaha2;
        return Kalahas;
    }

    public SmallBowl getNextBowl(){
        return this.nextBowl;
    }

    public static void main(String[] args){
    }
}

