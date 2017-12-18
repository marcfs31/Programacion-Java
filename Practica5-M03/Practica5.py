#!/usr/bin/env python
# -*- coding: utf-8 -*-
#Practica 5:Instrucions d'entrada i sortida
#Marc Fors Soler
"""
#Donades dos variables A y B, que l’usuari ha d’introduir,
#es demana un programa que intercanviï el valor de les variables.
#1

A=int(input("Pon un numero: "))
B=int(input("Pon otro numero: "))
#A,B= B,A metodo mejor pero solo para python

A=A+B
B=A-B
A=A-B

print(A,B)

#Realitza un programa que demani a l’usuari dos nombres i
#després mostri per pantalla la suma dels dos.
#2

A=int(input("Numero 1: "))
B=int(input("Numero 2: "))

print A+B

#Programa que determini la edat d’un usuari (paràmetre d’entrada)
#quan hagi transcorregut un quart de segle.
#3

edad=int(input("Pon tu edad: "))

print edad+25

#Programa que mostri el resultat d’elevar a la quarta potència un 
#nombre introduït per teclat.
#4
num=int(input("Pon un numero: "))

print num**4

#Programa que demani una quantitat en euros i determini quin era
#el seu valor amb les antigues “pessetes”.
#5
euros=int(input("Pon la cantidad en euros"))
pesetas= 166.386

print euros*pesetas

#Donades la base i l’altura d’un rectangle per part de l’usuari,
#crea un programa que calculi el àrea (Àrea = Base * Altura).
#6

base=int(input("Pon la base del rectangulo: "))
altura=int(input("Pon la altura del rectangulo: "))

print base*altura

#Escriu un programa que demani a l’usuari el nom i l’edat. 
#Després ha de mostrar per pantalla: “Hola (nom), la teva edat és (edat)”;
#7

nombre=raw_input("Pon tu nombre: ")
edad=int(input("Pon tu edad: "))

print ("Hola"+nombre+"la teva edat és "+str(edad))

#Escriu un programa que demani dos variables a l’usuari, i mostri per 
#pantalla la seva suma, resta, multiplicació, divisió i mòdul .
#8

A=int(input("Pon un numero: "))
B=int(input("Pon otro numero: "))

print ("Suma "+str(A+B)+"\nResta "+str(A-B)+"\nMultiplicación "+str(A*B)+"\nDisión "+str(A/B)+"\nModulo "+str(A%B))

#Realitza un programa que calculi el àrea i el perímetre d’una circumferència.
L’usuari haurà d’introduir el radi de la circumferència. ( A = π * r^2) ( P=2*π*r).
#9

import math
math.pi

radio = raw_input("Introduïu el radi:")
radio2 = float(radio)
area = math.pi * radio2**2
print "El area es:",area

#Escriu un programa que mostri el resultat de l’equació de tercer grau. 
#Per a realitzar el programa s’hauran de llegir els coeficients (a, b, c i d) 
#i el valor de x. El resultat es mostrarà per pantalla.
#10

print "Programa para calcula equaciones de tercer grado: "

a=int(input("Valor de a: "))
b=int(input("Valor de b: "))
c=int(input("Valor de c: "))
d=int(input("Valor de d: "))
x=int(input("Valor de x: "))

result= a*x**3+b*x**2+c*x**1+d

print "La equación de tercer grado da: ",result

#Programa que demani una quantitat –preu d’un producte – i calculi i 
#visualitzi la quantitat d’IVA (aplicant un percentatge del 21 %) 
#i la quantitat total a pagar (preu original + Iva).
#11

cantidad=int(input("Pon la cantidad del producto: "))
precio=int(input("Pon el precio del producto: "))

total = cantidad*precio
iva = total*21/100
total = iva+total
print "El precio con IVA es: ",total,"€"

#Modifica l’exercici anterior perquè el percentatge d’IVA sigui
#variable (introduït per l’usuari).
#12

cantidad=int(input("Pon la cantidad del producto: "))
precio=int(input("Pon el precio del producto: "))
valoriva=int(input("Pon el IVA: "))
total = cantidad*precio
iva = total*valoriva/100
total = iva+total
print "El precio con IVA es: ",total,"€"

#Una companyia de refrescos comercialitza tres productes: de cola, 
#de taronja i de llimona. Es desitja realitzar un programa que calculi 
#les ventes de cada producte. Per a això es llegirà la quantitat venuda 
#i el preu de cada producte. Per finalitzar es mostrarà un informe 
#de les vendes semblant a aquest: 
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

#\t tabulador
#Programa que demani  un nombre sencer i mostri l’últim dígit.
#14

num=int(input("Pon un numero entero: "))
num2= num % 10
print num2

#Escriu un programa que demani a l’usuari la quantitat de segons 
#i mostri per pantalla a quantes hores, minuts i segons corresponen
#(p.ex: 3661 segons corresponen a 1 hora + 1 minut + 1 segon).
#15

numseg=int(input("Pon los segundos: "))
horas=(int(numseg/3600))
minutos=int((numseg-(horas*3600))/60)
segundos=numseg-((horas*3600)+(minutos*60))
print(str(horas)+"h "+str(minutos)+"m "+str(segundos)+"s")

"""
#Genera un programa que donat un nom i un cognom (demanats a l'usuari), 
#generi un identificador d'usuari que és nom.cognom i una contrasenya 
#de 3 números que es generaran aleatòriament.
#16
import random #Para poder generar la funcion para generar numeros aleatorios.

nombre=input("Como te llamas? ")
apellido=input("Cual es tu primer apellido? ")

identificador=nombre+"."+apellido
password = random.randrange(100,999) #randrange saca un numero aleatorio de entre el rango metido en este caso 100-999 para que saque 3 numeros.
print (identificador,"\n",password)



