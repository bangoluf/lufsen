def createArray():
    storlek = int(input("Hur stor array vill du skapa? "))    
    array = []
    i = 1
    while i <= storlek:
        array.append(int(input("Mata in heltal att fylla arrayen med: ")))
        i += 1
    return array

def printArray(array):
    for i in array:
        print(i)


def printArrayBackwards(array):
    for i in reversed(array):
        print(i)

def sumArray(array):
    arraySum = 0
    for i in array:
        arraySum += i
    return arraySum
        
a = createArray()

printArray(a)
printArrayBackwards(a)

print(sumArray(a))
