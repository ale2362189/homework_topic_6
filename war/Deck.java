import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int score = 0;
	private List<Card> hand = new ArrayList<>();

	public Player(String name) {
		this.name = name;
	}

	public String describe() {
		return toString();
	}

	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0);
		}
		throw new IllegalStateException("Hand is empty");
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());

	}

	public void incrementScore() {
		score += 1;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", hand=" + hand + "]";
	}

	public int size() {
		return hand.size();
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

