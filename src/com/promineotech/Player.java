package com.promineotech;

import java.util.ArrayList;
import java.util.List;

public class Player {
int score;
String name;
List<Card> hand = new ArrayList<Card>();

public Player(String name) {
	this.name = name;
	score = 0;
}

public int incrementScore() {
	return score++;
}

public void describe() {
	System.out.println(name + ": ");
	for (Card card : hand) {
		System.out.println(card.describe());
		}
	 

}

public void draw(Deck deck) {
	hand.add(deck.draw());
}

public Card flip() {
	return hand.remove(0);
}

public int getScore() {
	return score;
}

public String getName() {
	return name;
}
public String describeScore() {
	return name + (": ") + score;
}

}