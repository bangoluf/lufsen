#!/usr/bin/env python3
# -*- coding: utf-8 -*-

def encrypt(klar_text):
	klar_text = list(klar_text)
	alfabetet = list("abcdefghijklmnopqrstuvwxyzåäö")
	krypt_text = ""
	for char in klar_text:
		if char in alfabetet:
			krypt_text += alfabetet[alfabetet.index(char) + 1]
	print (krypt_text)



text = input("Mata in text att kryptera: ")
encrypt(text)