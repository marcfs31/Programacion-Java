#!/usr/bin/env python
# -*- coding: utf-8 -*-

nombre = input("Como te llamas? ")
cantidad=0
i= 0
caracter = "a"
longitud = len(nombre)
for i in range(0,longitud,1): #La i augmentará en 1 cada vez en un rango de 0 a longitud ya que lo que hace falta es el indice para saber si en esa posición hay el caracter o no
	if(nombre[i] == caracter):
		cantidad = cantidad +1
		
print("El nombre contiene", cantidad,"a")
