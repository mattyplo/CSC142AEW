package Week5;

import java.util.Scanner;

public class CardGames {

	public static void main(String[] args) {
		// call the playWar method to play war
		playWar();
	}

	// We will bundle the logic of our game into a method of it's own 
	public static void playWar() {
		
		// The Scanner object will allow us to capture user input
		Scanner input = new Scanner(System.in);
		System.out.println("Hit Enter to play a hand of war\nType q then enter to quit.");
		
		// capture the user input
		String userInput = input.nextLine();
		
		// Keep playing the game until the user enters q for quit
		while (!userInput.equals("q")) {
			
			// generate two random cards to play against eachother
			RandomCard card1 = new RandomCard();
			RandomCard card2 = new RandomCard();
			System.out.println("Card 1 is the " + card1.getCardString());
			System.out.println("Card 2 is the " + card2.getCardString());
			
			// The logic behind picking a winning hand, the card with the greatest value wins
			if (card1.getValue() > card2.getValue()) {
				System.out.println("Card 1 is the winner!");
			} else if (card2.getValue() > card1.getValue()) {
				System.out.println("Card 2 is the winner!");
			} else {
				System.out.println("It is a tie!");
			}
			
			// prompt the user to play again or quit.  Capture their input to test against the loop logic.
			System.out.println("\nHit Enter to play a hand of war\nType q then enter to quit.");
			userInput = input.nextLine();
		}
		
		System.out.println("Thanks for playing!  goodbye.");
		// We get a warning if we don't close the scanner object, This is a good practise.
		input.close();
	}
	
}
