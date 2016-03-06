from Card import Card
from Deck import Deck
from Hand import Hand
from Player import Player

class Blackjack(object):

	def __init__(self):
		self.deck = Deck()
		self.dealer = Dealer()
		self.player = Player()

	@def endTurn(self):
		play()


	def hitOrStand(self):
	hitOrStand = input("(H)it or (S)tand?")
		if hitOrStand == "S" or "s" or "Stand" or "stand":
			@endTurn()
		elif hitOrStand == "H" or "h" or "Hit" or "hit":
			@PRINT SCORE
			return True
		else:
			@WRONG INPUT



	def play(self):
		self.dealer.resetHand()
		self.player.resetHand()
		deck.shuffle()

		pBet = input("Hur mycket pengar vill du satsa?")
		if pBet > player.getMoney():
			print("Du har inte rad att satsa sa mycket!")
		else:
			player.setBet(pBet)

		player.hand.addCard( deck.deal(2) )
		dealer.hand.addCard( deck.deal(2) )

		

		while hitOrStand = True:
			hitOrStand()
			player.hand.addCard( deck.dealCard() )
			print(player.getHandValue()) # FIX
			hitOrStand()

		endTurn()