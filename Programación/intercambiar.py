#!/usr/bin/env python
# -*- coding: utf-8 -*-
#Intercambiar el valor de A y B sin usar otra variable
A=int(input("Pon un numero: "))
B=int(input("Pon otro numero: "))
#A,B= B,A

A=A+B
B=A-B
A=A-B

print(A,B)
