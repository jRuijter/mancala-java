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
        //s.getNextBowl(index).play();
        //System.out.println(s.getNextBowl(index).getStones());
        s.getNextBowl(index).setStones(s.getNextBowl(index).getStones()+1);
        System.out.println(s.getNextBowl(index).getIndex() + " is played"); 
    }
	
	@Override
	public int getStonesForPit(int index, String type) {
        int value = 0;
        if(type.equals("player1")) { value = s.getNextBowl(index).getStones(); }
        if(type.equals("player2")) { value = s.getNextBowl(index + 7).getStones(); }
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