package com.bridgelabz;

public class DeckOfCards1 extends Card{
	private Card Card;
	private int remainingCards = 52;
	
	DeckOfCards1(){
		Card = new Card();
	}
	public void shuffle() {
		for (int i=0; i<Deck.length ; i++) {
			int index = (int) (Math.random()* Deck.length);
			int temp = Deck[i];
			Deck [i] = Deck[index];
			Deck[index]= temp;
			remainingCards--;
		}
	}
	public void deal() {
		for (int i=0; i<52; i++){
			String Suit = Suits [Deck [i]/13];
			String Rank = Ranks [Deck[i%13]];
			System.out.println("Remaining Cards: " + remainingCards);
			
		}
	}
	
}
