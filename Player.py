from Card import Card
from Deck import Deck
from Hand import Hand

class Player(object):

	def __init__(self):
		self.money = 100
		self.bet = 0
		self.hand = Hand()
		self.handValue = 0

	
	def getMoney(self):
		return self.money


	def getBet(self):
		return self.bet


	def getPoints(self):
		return self.getPoints

	def getHandValue(self):
		self.handValue = self.hand.getHandValue()
		return self.handValue


	def resetHand(self):
		self.hand = Hand()
		self.bet = 0
		self.handValue = 0

	
	def resetMoney(self):
		self.money = 0

	
	def setBet(self, amount):
		if self.amount <= self.money:
			self.bet = int(self.amount)
			self.money - self.bet

	
	def deal(self, cards = 1):
