package com.bridgelabz;

public class DeckOfCards {

	public static void main(String[] args) {
		
		int [] Deck = new int[52];
		String [] Suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String [] Ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		//Initialize the deck of cards
		for (int i=0; i<Deck.length; i++) {
			Deck[i] = i;
			}
		
		//Shuffle the cards
		for (int i=0; i<Deck.length; i++) {
			int index =(int) (Math.random()* Deck.length);
			int temp = Deck [i];
			Deck[i]=Deck[index];
			Deck[index]=temp;
		}
		//Display all the cards
		for (int i=0; i<52; i++) {
			String Suit = Suits [Deck[i]/13];
			String Rank = Ranks [Deck[i]%13];
			System.out.println(Ranks + " of " + Suits);
		}
	}
}
