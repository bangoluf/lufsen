from Card import Card
from Deck import Deck
from Hand import Hand
from Player import Player

player1 = Player("test")
player2 = Player("test2")

deck = Deck()


player1.hand.addCard( deck.dealCard() )
player1.hand.addCard( deck.dealCard() )
player2.hand.addCard( deck.dealCard() )
player2.hand.addCard( deck.dealCard() )

print("-------------------------------------------")
print("DECK: ")
print("-------------------------------------------")
print(deck)
print("-------------------------------------------")
print("DECK2: ")
print("-------------------------------------------")
print(deck)

print("\n-------------------------------------------")
print("HAND VALUE: ")
print("-------------------------------------------")
print( player1.hand.getHandValue() )
print( player2.hand.getHandValue() )

print("\n-------------------------------------------")
print("HAND CARDS: ")
print("-------------------------------------------")
print(player1.hand)
print(player2.hand)
