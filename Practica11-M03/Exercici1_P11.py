#!/usr/bin/env python
# -*- coding: utf-8 -*-

texto = input("Pon un string: ")
caracter = input("Pon un caracter: ")

"""
if(caracter in texto): #Si el caracter esta en la string
	print("El caracter",caracter,"aparece en",texto)
else:
	print("El caracter",caracter,"no aparece en",texto)

"""
longitud = len(texto)

i=0
encontrado=0

while(i < longitud):
	if(texto[i] == caracter):
		i = i+1
		encontrado=encontrado+1;
	else:
		i = i+1


if(encontrado >= 0):
	print("El caracter",caracter,"aparece en",texto)
else:
	print("El caracter",caracter,"no aparece en",texto)
