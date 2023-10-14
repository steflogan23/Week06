package com.promineotech;

public class App {

	public static void main(String[] args) {
		
Deck deck = new Deck();
Player player1 = new Player("Stef");
Player player2 = new Player ("Dustin");

//deck.describe();

//System.out.println("___________________________________________________");
deck.shuffle();
//deck.describe();

//System.out.println("___________________________________________________");

for (int i = 0; i < 52; i++) {
	if (i % 2 == 0) {
		player1.draw(deck);
	} else {
		player2.draw(deck);
	}
}


//player1.describe();
//player2.describe();

//System.out.println("___________________________________________");


for (int i = 0; i < 26; i++) {
	Card p1Flip = player1.flip();
	Card p2Flip = player2.flip();
	
	
	if (p1Flip.getValue() > p2Flip.getValue()) {
		player1.incrementScore();
		System.out.println(gameplay(player1, player2, p1Flip, p2Flip) + "\n" + roundWinner(player1) + "\nUpdated Score: " + score(player1, player2)) ;
		System.out.println("__________________________________________________________________________");}
		else if (p1Flip.getValue() < p2Flip.getValue()) {
			player2.incrementScore();
			System.out.println(gameplay(player1, player2, p1Flip, p2Flip) + "\n" + roundWinner(player2) + "\nUpdated Score: " + score(player1, player2)) ;
			System.out.println("______________________________________________________________________");
		} else {
			System.out.println(gameplay(player1, player2, p1Flip, p2Flip) + "\n Draw \n Updated Score: " + score(player1, player2));
			System.out.println("______________________________________________________________________");
		}
				
}

if (player1.incrementScore() > player2.incrementScore())
	System.out.println(player1.getName() + " WINS ALL");
else if (player2.incrementScore() > player1.incrementScore())
	System.out.println(player2.getName() + " WINS ALL");
else
	System.out.println("We have a draw");


}
//end main
	
	public static String gameplay(Player player1, Player player2, Card card1, Card card2) {
		return player1.getName() + " played " + card1.describe() + "\n" + player2.getName() + " played " + card2.describe(); 
		
		
	}

	public static String score(Player player1, Player player2) {
		return player1.describeScore() + " - " + player2.describeScore();
	}
	
		
	public static String roundWinner(Player player) {
		return player.getName() + " wins";
	}
}
