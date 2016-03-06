#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import re

def checkWordlist(losenord):
    filePath = "ordlista.txt"
    wordList = []

    file = open(filePath, 'r')
    for line in file:
        if losenord in line.split():
            print(losenord)
            return True
        else:
            return False

def testPw(losenord):
    pattern_passwd = "((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,})"
    regex = re.compile(pattern_passwd)
    return regex.search(losenord)

losenord = input("Mata in lösenordet du vill testa: ")
if testPw(losenord) and not checkWordlist(losenord):
    print("Lösenordet är säkert.")
else:
    print("Lösenordet är inte säkert!")

if checkWordlist(losenord):
    print("Ordet hittades")