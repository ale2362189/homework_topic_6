package war;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Ugly people");
		Player p2 = new Player("Sexy people");

		Deck deck = new Deck();
		deck.shuffle();
		int deckSize = deck.size();
		dealHands(p1, p2, deck);

		playGame(p1, p2, deckSize);

		if (p1.getScore() > p2.getScore()) {
			winnerIs(p1, p2);
		} else if (p2.getScore() > p1.getScore()) {
			winnerIs(p2, p1);
		} else {
			System.out.println("Holy crap " + p1.getName() + " and " + p2.getName() 
			+ " both tied with a score of "	+ p1.getScore());
		}
	}

	private static void winnerIs(Player winner, Player loser) {
		System.out.println(winner.getName() + " beat " + loser.getName() + ". " +
				winner.getScore() + " to " + loser.getScore() + " points. winning by "
				+ (winner.getScore() - loser.getScore()) + " points! ");

	}

	private static void playGame(Player p1, Player p2, int deckSize) {
		for (int turn = 0; turn < deckSize / 2; turn++) {
			Card c1 = p1.flip();
			Card c2 = p2.flip();

			if (c1.getValue() > c2.getValue()) {
				p1.incrementScore();
			} else if (c2.getValue() > c1.getValue()) {
				p2.incrementScore();
			}
		}
	}

	private static void dealHands(Player p1, Player p2, Deck deck) {
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(deck);
			} else {
				p2.draw(deck);
			}
		}
	}

}
