package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();

	private List<String> suits = List.of("Hearts", "Diamonds", "Spades", "Clubs");

	private List<String> characters = List.of("two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"jack", "queen", "king", "ace");

	public Deck() {
		for (String suit : suits) {
			for (int i = 0; i < characters.size(); i++) {
				String name = String.format("%s of %s", characters.get(i), suit);
				int value = i + 1;
				cards.add(new Card(name, value));
			}
		}
	}

	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		}

		throw new IllegalStateException("Deck empty");
	}

	public void describe() {
		System.out.println("check" + cards);
		for (Card card : cards) {
			card.describe();
		}

	}

	@Override
	public String toString() {
		return "Deck [cards=" + cards + "]";
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public int size() {
		return cards.size();
	}

}
