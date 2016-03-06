from Card import Card

class Hand(object):
	
	def __init__(self):
		self.handValue = 0
		self.ace = False
		self.hand = []


	def addCard(self, card):
		self.hand.append(card)

	def getCardCount(self):
		return len(self.hand)

	def getCard(self, position):
		return self.hand[position]


	def getHandValue(self):
		self.cards = self.getCardCount()

		for i in range(self.cards):
			self.card = self.getCard(i)
			self.cardValue = self.card.getValue()

			if self.cardValue == 1:
				self.ace = True
			self.handValue = self.handValue + self.cardValue

			if self.ace and (self.handValue + 10) <= 21:
				self.handValue = self.handValue + 10
		return self.handValue

	def __str__(self):
		return '\n'.join(map(str, self.hand))