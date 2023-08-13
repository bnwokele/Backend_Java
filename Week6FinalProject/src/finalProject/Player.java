package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.score = 0;
		this.name = name; 
		this.hand = new ArrayList<>();
	}
	
	public void describe() {
		System.out.println("Name: " + this.name + "\n" + "Score: " + this.score);
		if(this.hand.size() > 0) {
			for(Card card:hand) {
				System.out.println(card.getValue());
				System.out.println(card.getName());
			}
		}
	}
	
	public Card flip() {
		Card flip = this.hand.get(0);
		this.hand.remove(0);
		return flip;
	}
	
	public void draw(Deck deck) {
		Card draw = deck.draw();
		this.hand.add(draw);
		
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	
	public int getScore() {
		return this.score;
	}

}
