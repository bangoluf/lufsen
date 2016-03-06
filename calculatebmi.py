def calculateBMI(vikt, langd):
	bmi = vikt / (langd * langd)
	return bmi

def calculateFat(bmi, alder, kon):
	if kon == "man":
		faktor = 16.2
	else:
		faktor = 5.4
	return (1.2 * bmi) + (0.23 * alder) - faktor


vikt = int(input("Mata in vikt: "))
langd = float(input("Mata in langd i meter: "))
alder = int(input("Mata in alder: "))
kon = input("Mata in kon: ")

bmi = calculateBMI(vikt, langd)
fettProcent = calculateFat(bmi, alder, kon)

if kon == "man" and fettProcent > 20:
	print("Motionera mer!")
elif kon == "man" and fettProcent < 12:
	print("Motionera mindre och at mer.")
elif kon == "kvinna" and fettProcent > 30:
	print("Motionera mer!")
elif kon == "kvinna" and fettProcent < 20:
	print("Motionera mindre och at mer.")
else:
	print("Fortsatt med nuvarande motion.")