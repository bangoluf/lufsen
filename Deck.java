package Blackjack;

import java.util.Arrays;

public class Deck {
    Card[] deck;
    int cardsPlayed;

    public Deck() {
        deck = new Card[52];
        int cardCounter = 0;
        for (int value = 0; value <= 13; value++) {
            for (int farg = 0; farg <= 3; farg++) {
                deck[cardCounter] = new Card(value, farg);
                cardCounter = cardCounter + 1;
            }
            cardsPlayed = 0;
        }
    }

    public void shuffle() {
        for ( int i = 51; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsPlayed = 0;
    }

    public String toString() {
        return Arrays.toString(deck);
    }

    public Card dealCard() {
        if (cardsPlayed == 52) {
            shuffle();
        }
        cardsPlayed = cardsPlayed + 1;
        return deck[cardsPlayed - 1];
    }
}