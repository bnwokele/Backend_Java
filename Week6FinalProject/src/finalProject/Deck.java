package finalProject;

import java.util.*;

public class Deck {
	
	private List<Card> cards;
	
	public Deck() {
		this.cards = new ArrayList<>();
		String[] names = {"hearts", "diamonds", "spades", "clubs"};
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		for (String name:names) {
			for (int value: values) {
				this.cards.add(new Card(value, name));
			}
		}
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card draw = this.cards.get(0);
		this.cards.remove(0);
		return draw;
	}
}
