package javaWeek06FinalProject;

public class Card {

	int value;
	String name;
	//method used in the deck class to create a deck of cards
	Card (String name, int value) {
		this.name = name;
		this.value = value;
		
	}
	//tells you the name suit and value of the card
	public void describe() {
		System.out.println(this.name + "  --- value = " + this.value + "\n");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
	
	

