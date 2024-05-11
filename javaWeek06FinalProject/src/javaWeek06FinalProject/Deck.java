package javaWeek06FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	// deck method uses card.java to create a deck and stores them
	Deck () {
		String[] suits = {"Diamonds", "Clubs", "Spades", "Hearts"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
			
		for (String suit : suits) {
			int count = 2;
			
			for (String number : numbers) {
			String name = number + " of " + suit;
			Card card = new Card(name, count);
			this.cards.add(card);
			count++;
			}
		}
	}
	
	
	//will print out each card in the deck by using a advanced for loop
	public void describe() {
		int i  = 1;
		for (Card card : this.cards) {
			System.out.println("-------" + i + "-------");
			card.describe();
			i++;
		}
	}
	//randomizes the card order in the deck/array list
	public void shuffle() {
		Collections.shuffle(cards);
	}
	//take out one card from the deck and returns it
	public Card draw() {
		Card card = this.cards.remove(0);
		
		return card;
	}
}
