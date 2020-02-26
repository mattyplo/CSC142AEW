package Week7;

public class PlayingCard {

	// value of card
	private int value;

	// suit of card
	private String suit;


	// Constructor
	public PlayingCard(int v, String s) {
		this.value = v;
		this.suit = s;
	}

	// Returns the value of this card
	public int getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}
	
	public void printCard() {
		String valueString = "";
		if (value == 11) {
			valueString = "Jack";
		} else if (value == 12) {
			valueString = "Queen";
		} else if (value == 13) {
			valueString = "King";
		} else if (value == 14) {
			valueString = "Ace";
		} else {
			valueString = Integer.toString(value);
		}
		
		System.out.println(valueString + " of " + suit);
	}
}
