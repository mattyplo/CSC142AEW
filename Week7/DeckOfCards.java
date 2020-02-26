package Week7;

import java.util.Random;

public class DeckOfCards {
	
	private PlayingCard[] deck;
	private Boolean[] cardsDealt;
	private int cardsInDeck;
	
	public DeckOfCards() {
		deck = new PlayingCard[52];
		cardsDealt = new Boolean[52];
		buildDeck();
	}
	
	// This method should build and populate a complete deck of cards
	public void buildDeck() {
		// Create a counter for how many cards are built
		int cardsCreated = 0;
		String currentSuit = "";
		// for each suit in a deck of cards
		for (int i = 0; i < 4; i ++) {
			switch(i) {
				case 0:
					currentSuit = "Hearts";
					break;
				case 1:
					currentSuit = "Diamonds";
					break;
				case 2:
					currentSuit = "Clubs";
					break;
				case 3:
					currentSuit = "Spades";
					break;
				default:
					// Something went wrong, there should never be a default case in this switch statement
					break;
			}
			
			// for each value in a deck of cards
			for (int j = 2; j < 15; j ++) {
				// Create the card and add it to the deck
				PlayingCard currentCard = new PlayingCard(j, currentSuit);
				deck[cardsCreated] = currentCard;
				cardsDealt[cardsCreated] = false;
				cardsCreated ++;
			}
		}
		cardsInDeck = 52;
	}
	
	public PlayingCard dealCard() {
		Random randomPick = new Random();
		int deckCut = randomPick.nextInt(52);
		PlayingCard dealtCard = deck[deckCut];
		if (!cardsDealt[deckCut]) {
			cardsInDeck --;
			cardsDealt[deckCut] = true;
			return dealtCard;
		}
		while (cardsDealt[deckCut] && cardsInDeck != 0) {
			deckCut = randomPick.nextInt(52);
			dealtCard = deck[deckCut];
			if (!cardsDealt[deckCut]) {
				cardsInDeck --;
				cardsDealt[deckCut] = true;
				return dealtCard;
			}
		}
		return new PlayingCard(0, "Deck is Empty");
	}
}
