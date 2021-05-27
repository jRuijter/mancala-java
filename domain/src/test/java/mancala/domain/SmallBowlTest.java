package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallBowlTest{

    @Test
    public void TestingGetNextBowl(){
        SmallBowl firstBowl = new SmallBowl();
        SmallBowl secondBowl = new SmallBowl(firstBowl);
        assertEquals(firstBowl, secondBowl.getNextBowl());
    }

    @Test
    public void MakeAllSmallBowls(){
        SmallBowl bowl6 = new SmallBowl();
        SmallBowl bowl5 = new SmallBowl(bowl6);
        SmallBowl bowl4 = new SmallBowl(bowl5);
        SmallBowl bowl3 = new SmallBowl(bowl4);
        SmallBowl bowl2 = new SmallBowl(bowl3);
        SmallBowl bowl1 = new SmallBowl(bowl2);
        Kalaha k0 = new Kalaha(bowl1);
        Player p0 = new Player(k0);
        assertEquals(bowl3, p0.getKalaha().getNextBowl().getNextBowl().getNextBowl());
    }
    
    @Test
    public void MakeAllSmallBowlsViaMethod(){

    }
}