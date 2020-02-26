package Week7;

public class cardGameClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fiftyTwoCardPickUp();
	}

	public static void fiftyTwoCardPickUp() {
		
		DeckOfCards deck52 = new DeckOfCards();
		for (int i = 0; i < 53; i ++) {
			PlayingCard card = deck52.dealCard();
			card.printCard();
		}
	}
}
