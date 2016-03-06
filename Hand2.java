package Blackjack;

class HandValue extends Hand {

    public int getHandValue() {

        int val;
        boolean ace;
        int cards;

        val = 0;
        ace = false;
        cards = getCardCount();

        for ( int i = 0;  i < cards;  i++ ) {
            Card card;
            int cardVal;
            card = getCard(i);
            cardVal = card.getValue();
            if (cardVal > 10) {
                cardVal = 10;
            }
            if (cardVal == 1) {
                ace = true;
            }
            val = val + cardVal;
        }


        if (ace &&  val + 10 <= 21 )
            val = val + 10;

        return val;

    }

}
