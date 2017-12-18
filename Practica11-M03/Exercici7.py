#!/usr/bin/env python
# -*- coding: utf-8 -*-

palabra = input("Pon una palabra: ")

for i in range(len(palabra),0,-1): 
	print(palabra[i:])

for i in range(len(palabra),0,-1):
	print(palabra[:i])
