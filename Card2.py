class Card (object):

	def __init__(self, suit, value, isHidden):
		self.suit = suit
		self.value = value
		self.hidden = isHidden

		if (value == 'Ace'):
			self.pointValue = 11
		elif value in ['King', 'Queen', 'Jack']:
			self.pointValue = 10
		elif (value in ['2', '3', '3', '4', '5', '6', '7', '8', '9', '10']):
			self.pointValue = int(value)


	def __str__(self):
		if (self.hidden):
			return '[XX]'
		else:
			return '[' + self.suit + ' ' + str(self.value) + ']'


	def getSuit(self):
		return self.suit

	def getValue(self):
		return self.value

	def getPointValue(self):
		return self.pointValue

	def setPointValue(self, pointValue):
		self.pointValue = pointValue


	def isHidden(self):
		return self.hidden

	def hideCard(self):
		self.hidden = True

	def revealCard(self):
		self.hidden = False

	def isAce(self):
		return self.value == 'Ess'

