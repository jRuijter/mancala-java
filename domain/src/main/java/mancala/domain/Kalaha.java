package mancala.domain;

public class Kalaha {
    private SmallBowl nextBowl = new SmallBowl();
    private int rocks = 0;

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

    public static void main(String[] args){
    }
}

