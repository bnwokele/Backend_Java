package finalProject;

public class App {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Player playerOne = new Player("Player1");
		Player playerTwo = new Player("Player2");
		deck.shuffle();
		
		int cards_to_draw = 52;
		for(int i = 1; i <= cards_to_draw; i++) {
			if(i % 2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		
		int cards_to_flip = 26;
		for(int i = 1; i <= cards_to_flip; i++) {
			Card cardOne = playerOne.flip();
			cardOne.describe();
			Card cardTwo = playerTwo.flip();
			cardTwo.describe();
			
			if(cardOne.getValue() > cardTwo.getValue()) {
				playerOne.incrementScore();
			} else {
				playerTwo.incrementScore();
			}
		}
		
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Player1 score: " + playerOne.getScore() + "\n" + "Player2 score: " + playerTwo.getScore());
			System.out.println("Player1 wins!");
		} else if(playerTwo.getScore() > playerOne.getScore()) {
			System.out.println("Player1 score: " + playerOne.getScore() + "\n" + "Player2 score: " + playerTwo.getScore());
			System.out.println("Player2 wins!");
		} else {
			System.out.println("Player1 score: " + playerOne.getScore() + "\n" + "Player2 score: " + playerTwo.getScore());
			System.out.println("TIE!!");
		}
	}

}
