package mancala.domain;

public class MancalaImpl implements Mancala {
    SmallBowl s;

    public MancalaImpl() {
        s = new SmallBowl();
    }

    @Override
    public boolean isPlayersTurn(int player) {
        return true;
    }

    @Override
	public void playPit(int index) throws MancalaException {
        s.getNextBowl(index).play();
        System.out.println("Played Bowl has: " + s.getNextBowl(index).getStones() + "  Kalaha p1 has: " + s.getNextBowl(6).getStones() + "  Kalaha p2 has: " + s.getNextBowl(13).getStones());
    }
	
	@Override
	public int getStonesForPit(int index) {
        int value = 0;
        value = s.getNextBowl(index).getStones();
        return value;
    }

	@Override
	public boolean isEndOfGame() {
        return false;
    }

	@Override
	public int getWinner() {
        return Mancala.NO_PLAYERS;
    }
}