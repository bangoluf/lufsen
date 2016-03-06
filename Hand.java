package Blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
	int val, cards;
	boolean ace;
        hand = new ArrayList<Card>();
    }

    public void addCard(Card card) {
            hand.add(card);
    }

    public int getCardCount() {
        return hand.size();
    }

    public Card getCard(int position) {
            return (Card)hand.get(position);
    }



    public int getHandValue() {
        val = 0;
        ace = false;
        cards = getCardCount();

        for(int i = 0;  i < cards;  i++) {
            Card card;
            int cardVal;
            card = getCard(i);
            cardVal = card.getValue();
            
	    if(cardVal > 10) {
                cardVal = 10;
            }
            
	    if(cardVal == 1) {
                ace = true;
            }
            val = val + cardVal;
        }


        if (ace &&  (val + 10) <= 21 )
            val = val + 10;

        return val;

    }

}
