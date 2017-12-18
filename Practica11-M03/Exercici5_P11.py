#!/usr/bin/env python
# -*- coding: utf-8 -*-

nombre = input("Nombre completo: ")

i=0
nombre2=nombre[i].upper()

for i in range(1,len(nombre),1):
	if(nombre[i-1]== " "):
		nombre2=nombre2+nombre[i].upper()
	else:
		nombre2=nombre2+nombre[i].lower()

print(nombre2)

# print(nombre.title()) Lo hace con una función aqui 
