#!/usr/bin/env python
# -*- coding: utf-8 -*-

nombre = input("Como te llamas? ")
cantidad=0
i= 0

longitud = len(nombre)
for i in range(0,longitud,1): #La i augmentará en 1 cada vez en un rango de 0 a longitud ya que lo que hace falta es el indice para saber si en esa posición hay el caracter o no
	if(nombre[i] == "a"):
		cantidad = cantidad +1
	elif(nombre[i] == "e"):
		cantidad = cantidad +1
	elif(nombre[i] == "i"):
		cantidad = cantidad +1
	elif(nombre[i] == "o"):
		cantidad = cantidad +1
	elif(nombre[i] == "u"):
		cantidad = cantidad +1

print("El nombre tiene",longitud,"caracteres i",cantidad,"vocales")


cantidad=0
vocal=0

for i in nombre:
	cantidad=cantidad+1
	letra=nombre.count(i)
	if(i=="a" or i=="e" or i=="i" or i=="o" or i=="u"):
		vocal = vocal +1

print("El nombre tiene",cantidad,"letras y",vocal,"vocales")
