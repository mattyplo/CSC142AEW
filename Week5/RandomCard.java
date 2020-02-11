package Week5;

import java.util.Random;

public class RandomCard {

	// the largest value a card can have
	private static final int MAX_VALUE = 14;
	
	// the smallest value a card can have
	private static final int MIN_VALUE = 2;
	
	// represents the possible number of suit types
	private static final int N0_SUIT_TYPES = 4;
	
	// revealed value of card
	private int value;
	
	// revealed suit of card
	private String suit;
	
	// Constructor
	public RandomCard() {
		generateCard();
	}
	
	// "Reveal" the value of the random card
	private void generateCard() {
		Random random = new Random();
		value = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
		int suitDesignation = random.nextInt(N0_SUIT_TYPES);
		suit = determineSuitFromNumber(suitDesignation);
	}
	
	// Determine the suit value based on the number passed in
	private String determineSuitFromNumber(int suitDesignation) {
		
		if (suitDesignation == 0) {
			return"Hearts";
		} else if (suitDesignation == 1) {
			return "Spades";
		} else if (suitDesignation == 2) {
			return "Diamonds";
		} else {
			return "Clubs";
		}
	}
	
	// Returns the value of this card
	public int getValue() {
		return value;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String getCardString() {
		return convertValueToString() + " of " + suit;
	}
	
	// Using a switch statement for logical selection
	// Note this is essentially the same things as in If statement, however
	// It is more readable for the human looking at the code.
	private String convertValueToString() {
		switch(value) {
			case 2: 
				return "Two";
			case 3: 
				return "Three";
			case 4:
				return "Four";
			case 5:
				return "Five";
			case 6:
				return "Six";
			case 7:
				return "Seven";
			case 8:
				return "Eight";
			case 9:
				return "Nine";
			case 10:
				return "Ten";
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			case 14:
				return "Ace";
			default:
				return "Ace";
		}
	}
	
	// Using an if statement for logical selection
	private String convertValueToString2() {
		if (value == 2) return "Two"; 
		else if (value == 3) return "Three";
		else if (value == 4) return "Four";
		else if (value == 5) return "Five";
		else if (value == 6) return "Six";
		else if (value == 7) return "Seven";
		else if (value == 8) return "Eight";
		else if (value == 9) return "Nine";
		else if (value == 10) return "Ten";
		else if (value == 11) return "Jack";
		else if (value == 12) return "Queen";
		else if (value == 13) return "King";
		else return "Ace";
	}
}
