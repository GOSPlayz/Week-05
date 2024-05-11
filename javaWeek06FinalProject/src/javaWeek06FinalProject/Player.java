package javaWeek06FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
		
	int score = 0;
	String name;
	//both player methods used in App class for the game structure
	Player (List<Card> hand , int score, String name) {
		
		this.hand = hand;
		this.score = score;
		this.name = name;
	}
	
	Player (String name) {
		this.name = name;
	}
	
	
	//tells us each card in the respective players hand(s)
	public void describe() {
		int i  = 1;
		for (Card card : this.hand) {
			
			System.out.println("------" + i + "------" );
			card.describe();
			i++;
		}
		
		System.out.println("You have " + this.score);
		System.out.println("Your name is " + this.name);
	}
	//takes a card out of the players hand deck and gets used in a comparison in the App.java file/class
	public Card flip () {
		Card card = this.hand.remove(0);
		
		return card;
	}
	//used to populate the players hand deck from the main deck.
	public Card draw(Deck deck) {
		Card card = deck.draw();
		
		return	card;
	}
	//will add one to the players score each time its called
	public int incrementScore() {
		
		return score += 1;
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
