#!/usr/bin/env python
# -*- coding: utf-8 -*-
print("Calculadora")
valor1=int(input("Pon un numero: "))
op=raw_input("Pon la operación deseada: ")
valor2=int(input("Pon otro numero: "))

if (op=="+"):
	print(valor1+valor2)

if (op=="-"):
	print(valor1-valor2)
	
if (op=="/"):
	print(valor1/valor2)
	
if (op=="x"):
	print(valor1*valor2)
	
