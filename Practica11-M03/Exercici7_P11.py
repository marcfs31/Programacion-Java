#!/usr/bin/env python
# -*- coding: utf-8 -*-

palabra = input("Pon una palabra: ")

for i in range(len(palabra)-1,0,-1): #Imprime desde la i que es longtiud -1 es decir la ultima posición y va restando la i hasta el 0
    print(palabra[i:])

for i in range(len(palabra),0,-1):
    print(palabra[:i])
