package mancala.domain;

public interface Bowl{
    public Bowl getNextBowl();
    public Bowl getNextBowl(int choice);
    public int getIndex();
    public int getStones();
    public Bowl addStone();
    public Player getPlayer();
    public int stones = 0;
    public Bowl getOppositeBowl();
}