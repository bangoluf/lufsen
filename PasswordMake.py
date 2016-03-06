import random	

smaBokstaver = "abcdefghijklmnopqrstuvwxyz"
storaBoksaver = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
siffror = "0123456789"
symboler = "!@#$%^&"
losenordList = []

for i in range(2):
    losenordList.append(smaBokstaver[random.randrange(len(smaBokstaver))])
    losenordList.append(storaBoksaver[random.randrange(len(storaBoksaver))])
    losenordList.append(siffror[random.randrange(len(siffror))])
    losenordList.append(symboler[random.randrange(len(symboler))])

random.shuffle(losenordList)
losenordString = "".join(losenordList)

print(losenordString)