package Week4;

public class CardGame {

	public static void main(String[] args) {
		RandomCard card1 = new RandomCard();
		RandomCard card2 = new RandomCard();
		card1.revealCard();
		card2.revealCard();
		
		System.out.println(card1.getValue() + " of " + card1.getSuit());
		System.out.println(card2.getValue() + " of " + card2.getSuit());
	}

}
