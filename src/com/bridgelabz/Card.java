package com.bridgelabz;

public class Card extends DeckOfCards{
	int [] Deck = new int[52];
	String [] Suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String []Ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	Card(){
		for (int i=0; i<Deck.length; i++) {
		Deck [i]=i;
	}
	}
}
