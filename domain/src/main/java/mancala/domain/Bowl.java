package mancala.domain;

public interface Bowl{
    public Bowl getNextBowl();
    public Bowl getNextBowl(int choice);
    public int getIndex();
 //   Bowl getNextBowl(int whichNeighbor);
 //   int getStones();
}