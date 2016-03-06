class Card(object):

        def __init__(self, suit, rank):
                self.suit = suit
                self.rank = rank

                if rank > 10:
                        self.value = 10
                else:
                        self.value = rank

        def getSuit(self):
                return self.suit

        def getValue(self):
                return self.value

        def getSuitAsString(self):
                if self.suit == 0:
                        return "Spades"
                elif self.suit == 1:
                        return "Hearts"
                elif self.suit == 2:
                        return "Diamonds"
                elif self.suit == 3:
                        return "Clubs"
                else:
                        return "ERROR"

        def getRankAsString(self):
                if self.rank == 1:
                        return "Ace"
                elif self.rank == 2:
                        return "2"
                elif self.rank == 3:
                        return "3"
                elif self.rank == 4:
                        return "4"
                elif self.rank == 5:
                        return "5"
                elif self.rank == 6:
                        return "6"
                elif self.rank == 7:
                        return "7"
                elif self.rank == 8:
                        return "8"
                elif self.rank == 9:
                        return "9"
                elif self.rank == 10:
                        return "10"
                elif self.rank == 11:
                        return "Jack"
                elif self.rank == 12:
                        return "Queen"
                elif self.rank == 13:
                        return "King"
                else:
                        return "ERROR: Invalid card value!"

        def __str__(self):
                return self.getRankAsString() + " of " + self.getSuitAsString()


        def paintCard(self):
                if self.suit == 0:
                        s = "♠"
                elif self.suit == 1:
                        s = "♥"
                elif self.suit == 2:       
                        s = "♦"
                elif self.suit == 3:
                        s = "♣"
                else:
                        print("ERROR: invalid value on card")

                if self.rank == 1:
                        r = "A"
                elif self.rank == 11:
                        r = "J"
                elif self.rank == 12:
                        r = "Q"
                elif self.rank == 13:
                        r = "K"
                else:
                        r = str(self.rank)

                pCard = ("\
                ┌─────────┐\n\
                │{space}{rank}       │\n\
                │         │\n\
                │         │\n\
                │    {suit}    │\n\
                │         │\n\
                │         │\n\
                │       {rank}{space}│\n\
                └─────────┘\n\
                ").format(rank=r, space=" ", suit=s)


                print(pCard)