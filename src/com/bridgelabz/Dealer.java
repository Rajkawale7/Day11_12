package com.bridgelabz;

public class Dealer extends DeckOfCards1 {

	public static void main(String[] args) {
		System.out.println("The Deck will randomly print out the cards from a full deck each time");
		
		DeckOfCards1 Player = new DeckOfCards1();
		Player.deal();
	}
}
