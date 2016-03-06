from random import shuffle
from Card import Card

class Deck(object):
	
	def __init__(self):
		self.deck = []
		for suit in range(4):
			for rank in range(1, 14):
				card = Card(suit, rank)
				self.deck.append(card)
			self.cardsPlayed = 0

	def shuffle(self):
		shuffle(self.deck)
		self.cardsPlayed = 0

	def dealCard(self):
		if self.cardsPlayed == 52:
			self.shuffle()

		self.cardsPlayed = self.cardsPlayed + 1
		return self.deck[self.cardsPlayed - 1]

	def deal(self, amountOfCards):
		for i in range(amountOfCards):
			return self.dealCard()

	def __str__(self):
		return "\n".join(map(str, self.deck))
