package Week4;

import java.util.Random;

public class RandomCard {

	// the largest value a card can have
	private static final int MAX_VALUE = 14;
	
	// the smallest value a card can have
	private static final int MIN_VALUE = 2;
	
	// represents a card value before being shown
	private static final int NO_NUMBER = 0;
	
	// represents the possible number of suit types
	private static final int N0_SUIT_TYPES = 4;
	
	// represents a card suit before being shown
	private static final String NO_SUIT = "";
	
	// revealed value of card
	private int value;
	
	// revealed suit of card
	private String suit;
	
	// random number generator;
	private Random random;
	
	// Constructor
	public RandomCard() {
		random = new Random();
		value = NO_NUMBER;
		suit = NO_SUIT;
	}
	
	// "Reveal" the value of the random card
	public void revealCard() {
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
}
