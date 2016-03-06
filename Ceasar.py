#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import string

def encrypt(tkn, key):
    return tkn + key

def decrypt(tkn, key):
    return tkn - key

def createKey():
    storlek = int(input("Hur stor array vill du skapa? "))    
    key = []
    i = 1
    while i <= storlek:
        key.append(int(input("Mata in heltal att fylla arrayen med: ")))
        i += 1
    return key

def encrypt():
    message = list("test")
    #alfabetet = list("abcdefghijklmnopqrstuvwxyz")
    key = [1, 2, 3, 4]
    index = 0
    krypt_text = 0
    for char in message:
        if index == 3:
            index = 0
        else:
            index += 1
    krypt_text += ord(message[message.index(char) + key[index]])
    print(chr(krypt_text))
    return krypt_text

def decrypt(krypt_text):
    message = list(krypt_text)
    key = [1, 2, 3, 4]
    index = 0
    decrypt = 0
    decrypt_text = ""
    for char in message:
        if index == 3:
            index = 0
        else:
            index += 1
    decrypt += ord(message[message.index(char) + key[index]])
    decrypt_text += chr(message[message.index(char) - key[index]])
    print(decrypt_text)



decrypt(encrypt())
