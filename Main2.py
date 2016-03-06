#!/usr/bin/python
# -*- coding: utf-8 -*-

from Card import Card
from Deck import Deck
from Hand import Hand


def main():
    print 'Blackjack: \n'

    chips = 100

    while True:
        print '0 to exit.'
        print 'You have ' + chips + ' dollars.'
        bet = input('How much do you want to bet?')
        if bet < 0 or bet > chips:
            print 'You can only bet what you have!'
            test = True

        while test:
            print '0 to exit.'
            bet = input('How much do you want to bet?')
            if bet < 0 or bet > chips:
                print 'You can only bet what you own!'
                test = True
            else:
                test = False

        if bet == 0:
            break
        userWins = play()
        if userWins:
            chips = chips + bet
        else:
            chips = chips - bet
        print ' '
        if chips == 0:
            print 'Out of chips!'
            break

    print ''
    print 'You leave with ' + chips + ' dollars.'


def play():
    deck = Deck()
    dealerHand = Hand()
    playerHand = Hand()

    deck.shuffle()
    dealerHand.addCard(deck.dealCard())
    dealerHand.addCard(deck.dealCard())
    playerHand.addCard(deck.dealCard())
    playerHand.addCard(deck.dealCard())

    print ' - '
    print ' - '

    if dealerHand.getHandValue() == 21:
        print 'Dealers cards: '
        print dealerHand.getCard(0) + ' and ' + dealerHand.getCard(1)
        print 'Players cards: ' + playerHand.getCard(0) + ' and ' \
            + playerHand.getCard(1)
        print ' '
        print 'Dealer has Blackjack.  Dealer wins.'
        return False

    if playerHand.getHandValue() == 21:
        print 'Dealers cards: '
        print dealerHand.getCard(0) + ' and ' + dealerHand.getCard(1)
        print 'Players cards: ' + playerHand.getCard(0) + ' and ' \
            + playerHand.getCard(1)
    print ' '
    print 'Player has Blackjack.  Player wins.'
    return True

    while True:
        print ' == '
    print ' == '
    print 'Players cards: '
    for i in range(playerHand.getCardCount()):
        print '    ' + playerHand.getCard(i)

    print 'Player total hand value: ' + playerHand.getHandValue()
    print ' '
    print 'Dealers cards: ' + dealerHand.getCard(0)
    print ' '
    choice = input('(H)it or (S)tand?')
    if choice != 'H' and choice != 'S':
        print 'H or S'
        test2 = True

    while test2 == True:
        print ' '
        choice = input('(H)it or (S)tand?')
        if choice != 'H' and choice != 'S':
            print 'H or S'
            test2 = True
        else:
            test2 = False

    if choice == 'S':
        return False
    else:
        drawCard = deck.dealCard()
        playerHand.addCard(drawCard)
        print ' '
        print 'Player hits!'
        print 'Player gets card ' + drawCard
        print 'Player total is now: ' + playerHand.getHandValue()
        if playerHand.getHandValue() > 21:
            print '!'
            print 'Player busted!'
            print "Dealer's other card was: " + dealerHand.getCard(1)
        return False

    print ''
    print 'Player stands.'
    print 'Dealers cards: '
    print '    ' + dealerHand.getCard(0)
    print '    ' + dealerHand.getCard(1)

    while dealerHand.getHandValue() <= 16:
        drawCard = (deck, dealCard())
        print 'Dealer hits and draws a ' + drawCard
        dealerHand.addCard(drawCard)
        if dealerHand.getHandValue() > 21:
            print '!'
            print 'Dealer busted! Player wins!'
            return True
    print 'Dealer total is ' + dealerHand.getHandValue()
    print '-'

    if dealerHand.getHandValue() == playerHand.getHandValue():
        print "It's a tie. Dealer wins."
        return False
    elif dealerHand.getHandValue() > playerHand.getHandValue():
        print 'Dealer wins with the total of: ' \
            + dealerHand.getHandValue() + '. Versus players total:  ' \
            + playerHand.getHandValue() + '.'
        return False
    else:
        print 'Player wins with the total: ' \
            + playerHand.getHandValue() + '. Versus dealers total: ' \
            + dealerHand.getHandValue()
        return True

main()