package javaWeek06FinalProject;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player playerOne = new Player("Sally");
		Player playerTwo = new Player("John");
		deck.shuffle();
		
		//splits the deck between both players using a loop and if statements
		for (int i = 1; i <= 52; i++) {
			if (playerOne.hand.size() < playerTwo.hand.size()) {
				playerOne.getHand().add(playerOne.draw(deck));
			} else {
				playerTwo.getHand().add(playerTwo.draw(deck));
			}	
		}
		
		//loop used to flip a single card for each player 26 times (until there are none left)
		for (int i = 0; i < 26; i++) {
			System.out.println("\t Round " + (i + 1 ) + "\n");
			Card p1Card = playerOne.flip();
			Card p2Card = playerTwo.flip();
			
			
		//card describe update for each flip instance
			System.out.print(playerOne.name + " has ");
			p1Card.describe();
			System.out.print(playerTwo.name + " has ");
			p2Card.describe();
			
			
		//Compares the card values for playerOne and playerTwo and gives output based on who had the larger number
			if (p1Card.value > p2Card.value) {
				playerOne.incrementScore();
				System.out.println(playerOne.name + " wins this round. \n");
			} else if (p2Card.value > p1Card.value) {
				playerTwo.incrementScore();
				System.out.println(playerTwo.name + " wins this round. \n");
			} else {
				System.out.println("Tie! \n");
			}
			
		//score update after each flip instance
			System.out.println(playerOne.name + "'s score is " + playerOne.score);
			System.out.println(playerTwo.name + "'s score is " + playerTwo.score);
			System.out.println("----");
		}
		
		
		//will say who won or lost based of total points or draw if the scores were the same.
		if (playerOne.score > playerTwo.score) {
			System.out.println(playerOne.name + " wins the game!");
			System.out.println("Score: " + playerOne.score);
			System.out.println(playerTwo.name + " loses.");
			System.out.println("Score: " + playerTwo.score);
		} else if (playerTwo.score > playerOne.score){
			System.out.println(playerTwo.name + " wins the game!");
			System.out.println("Score: " + playerTwo.score);
			System.out.println(playerOne.name + " loses.");
			System.out.println("Score: " + playerOne.score);
		} else {
			System.out.println("It's a Draw!");
			System.out.println(playerOne.name + "Score: " + playerOne.score);
			System.out.println(playerTwo.name + "Score: " + playerTwo.score);
			
		}
	}
}
