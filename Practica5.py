#!/usr/bin/env python
# -*- coding: utf-8 -*-
#Practica 5:Instrucions d'entrada i sortida
"""
#1
A=int(input("Pon un numero: "))
B=int(input("Pon otro numero: "))
#A,B= B,A metodo mejor pero solo para python

A=A+B
B=A-B
A=A-B

print(A,B)

#2
A=int(input("Numero 1: "))
B=int(input("Numero 2: "))

print A+B

#3
edad=int(input("Pon tu edad: "))

print edad+25

#4
num=int(input("Pon un numero: "))

print num**4

#5
euros=int(input("Pon la cantidad en euros"))
pesetas= 166.386

print euros*pesetas

#6
base=int(input("Pon la base del rectangulo: "))
altura=int(input("Pon la altura del rectangulo: "))

print base*altura

#7
nombre=raw_input("Pon tu nombre: ")
edad=int(input("Pon tu edad: "))

print ("Hola"+nombre+"la teva edat és "+str(edad))

#8
A=int(input("Pon un numero: "))
B=int(input("Pon otro numero: "))

print ("Suma "+str(A+B)+"\nResta "+str(A-B)+"\nMultiplicación "+str(A*B)+"\nDisión "+str(A/B)+"\nModulo "+str(A%B))

#9
import math
math.pi

radio = raw_input("Introduïu el radi:")
radio2 = float(radio)
area = math.pi * radio2**2
print "El area es:",area

#10
print "Programa para calcula equaciones de tercer grado: "

a=int(input("Valor de a: "))
b=int(input("Valor de b: "))
c=int(input("Valor de c: "))
d=int(input("Valor de d: "))
x=int(input("Valor de x: "))

result= a*x**3+b*x**2+c*x**1+d

print "La equación de tercer grado da: ",result

#11

cantidad=int(input("Pon la cantidad del producto: "))
precio=int(input("Pon el precio del producto: "))

total = cantidad*precio
iva = total*21/100
total = iva+total
print "El precio con IVA es: ",total,"€"

#12

cantidad=int(input("Pon la cantidad del producto: "))
precio=int(input("Pon el precio del producto: "))
valoriva=int(input("Pon el IVA: "))
total = cantidad*precio
iva = total*valoriva/100
total = iva+total
print "El precio con IVA es: ",total,"€"

#13
vendido1=int(input("Pon la cantidad vendida de cola: "))
precio1=float(input("Pon el precio de cola: "))
vendido2=int(input("Pon la cantidad vendida de taronja: "))
precio2=float(input("Pon el precio de taronja: "))
vendido3=int(input("Pon la cantidad vendida de llimona: "))
precio3=float(input("Pon el precio de llimona: "))

total1=vendido1*precio1
total2=vendido2*precio2
total3=vendido3*precio3

print "---------------------------------------"
print "Producte	Vendes	Preu	Total"
print "Cola		",vendido1,"    ",precio1," ", total1
print "Taronja		",vendido2,"    ",precio2," ", total2
print "Llimona		",vendido3,"    ",precio3," ", total3
print "---------------------------------------"
print "TOTAL				 ",total1+total2+total3

#\t
#14

num=int(input("Pon un numero entero: "))
num2= num % 10
print num2
"""

#15
segundos=int(input("Pon los segundos: "))
horas= segundos/60/60
horas= float(horas)

