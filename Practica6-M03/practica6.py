#!/usr/bin/env python
# -*- coding: utf-8 -*-
#Marc Fors Soler Practica 6

"""
#1
edad=int(input("Que edad tienes? "))
nombre=input("Como te llamas? ")
#edad=int(edad)

if (edad > 17):
	print("Vostè ja pot anar a la presó!")
	print("Adéu",nombre,"!")
else:
	print("Adéu",nombre,"!")

#2
num1=int(input("Pon un numero :"))
num2=int(input("Pon otro numero :"))

if (num1 < num2):
	print(num1,num2)
else:
	print(num2,num1)

#3
num1=int(input("Pon un numero :"))
num2=int(input("Pon otro numero :"))

producto=num1*num2

if (producto == 0):
	print("El seu producte es 0")
	print(producto)
elif (producto > 0):
	print(producto)
	print("El seu producte es mes gran que 0")
elif (producto < 0):
	print("El seu producte es mes petit que 0")
	print(producto)


#4
simbolo=input("Pon una tecla aleatoria del teclado: ")

#try:
#	simbolo=int(simbolo)
#	if (simbolo == 0 or 1 or 2 or 3 or 4 or 5 or 6 or 7 or 8 or 9):
#		print("Es un numero")
#except:
#	print("No es un numero")

if (simbolo.isdigit()): #variable.isdigit() comprueba si es  un digito
	print("Es un numero")
else:
	print("No es un numero")


#5

precio1=int(input("Pon el precio original: "))
precio2=int(input("Pon el precio pagado: "))

iva= precio1-precio2
percent=round(iva*100/precio1,2) # round redonde pero si le pones un ,2 al final te saca 2 decimales

print("Te han descontado",iva,"€","que es un",percent,"%","del precio original") 


#6

mes=int(input("Pon un mes(En numeros): "))
ano=int(input("Pon un año: "))

if (mes ==12):
	mes2= mes-1
	mes3= 1
	ano1=(ano+1)
	ano2=(ano)

	print("anterior "+str(mes2)+"/"+str(ano2)+" posterior "+str(mes3)+"/"+str(ano1))
	
else:	
	mes2= mes-1
	mes3= mes+1
	ano=str(ano)
	mes2=str(mes2)
	mes3=str(mes3)

	print("anterior "+mes2+"/"+ano+" posterior "+mes3+"/"+ano)


#7
dia=int(input("Que dia es: "))
mes=int(input("Que mes es: "))
ano=int(input("Que año es: "))
horas=int(input("Que hora es: "))
minutos=int(input("Que minutos de la hora: "))
segundos=int(input("Que segundos de la hora: "))

segundos = segundos +1
if (segundos== 60):
	minutos=minutos+1
	segundos=0
	if (minutos == 60):
		horas=horas+1
		minutos=0
		if (horas == 24):
			dia=dia+1
			horas=0
			if (dia == 31):
				mes=mes+1
				dia=1
				if(mes == 13):
					ano=ano+1
					mes=1
				
print("Dia",dia,"Mes",mes,"Año",ano,"Horas",horas,"Minutos",minutos,"Segundos",segundos)


#8
num1=int(input("Pon un numero"))
num2=int(input("Pon otro numero"))
num3=int(input("Pon otro numero"))

if (num1 <= num2 and num1 <= num3):
	num4 = num1
	if (num2 <= num3):
		num5 = num2
		num6 = num3
	else:
		num5=num3
		num6=num2
else:
	if (num2 <= num1 and num2 <= num3):
		num4 = num2
		if (num1 <= num3):
			num5 = num1
			num6 = num3
		else:
			num5=num3
			num6=num1
	else:
		if (num3 <= num1 and num3 <= num2):
			num4 = num3
			if (num1 <= num2):
				num5 = num1
				num6 = num2
			else:
				num5 = num2
				num6 = num1

print (num4,num5,num6)



#9
num1 = int(input("Pon el primer numero: "))
op = input("Pon la operación que quieres hacer: ")
num2 = int(input("Pon el segundo numero: "))

if (op == "+"):
	print("La operación da",(num1+num2))
	
elif (op == "-"):
	print("La operación da",(num1-num2))
	
elif (op == "x" or op == "*"):
	print("La operación da",(num1*num2))
	
elif (op == "/"):
	print("La operación da",(num1/num2))


#10

precio= int(input("Cuanto vale el producto? "))
pagar= int(input("Cuanto has pagado? "))

if (pagar > precio):
	print("Has pagado",(pagar-precio),"€","de más")
elif (pagar < precio):
	print("Te falta por pagar",(precio-pagar),"€")

	
#11
print("Sintomas responde con si o no")
sint1=input("Tens esternuts i mal de cap? ")
sint2=input("Tens problemes d'estómac? ")
sint3=input("Tens tos? ")
edad=int(input("Que edad tienes? "))

if (sint1 == "si" and sint2 == "si"):
	print("Et recomano paracetamol")
elif (sint1 == "si" and sint2 == "no"):
	print("Et recomano àcid acetil salicílic(AAS)")

if (sint3 == "si"):
	if (edad < 12):
		print("caramel de mel")
	else:
		print("caramel d'eucaliptus")
		
if (sint1 == "no" and sint2 == "no" and sint3 == "no"):
	print("Vine a la meva consulta")



#12

color=input("De que color esta el semaforo? ")

if (color == "amarillo" or color == "rojo"):
	print("No pases")
elif(color == "verde"):
	print("Puedes pasar")
else:
	print("Te has equivocado de color")


#13
hijos=int(input("Cuantos hijos tienes? "))	

if (hijos < 0):
	print("No puedes tener menos de 0 hijos")
elif (hijos == 0):
	print("Has ahorrado en pañales")
elif (hijos == 1):
	print("Cuidado no lo mimes demasiado")
elif (hijos > 1 and hijos < 5):
	print("No te aburres en casas eh?")
elif (hijos > 4):
	print("Tu si que haces pais")
	
#14 Este solo se puede en java

#15
import math
print ("Programa para calcula equaciones de segundo grado: ")

a=int(input("Valor de a: "))
b=int(input("Valor de b: "))
c=int(input("Valor de c: "))

if (a == 0):
	print("Es una equación de primer grado")
else:
	raiz=(b**2)-(4*a*c)
	
if (raiz < 0):
	print("Solución imaginaria")
else:
	x1=-b+math.sqrt(raiz)/(2*a)
	x2=-b-math.sqrt(raiz)/(2*a)
	print("Las soluciones son:",x1,x2)
"""

#import math
#
#a=float(input("Pon el coeficiente A: "))
#b=float(input("Pon el coeficiente B: "))
#c=float(input("Pon el coeficiente C: "))
#
#if (a == 0):
#	print("Error es una equación de primer grado")
#else:
#	aux=b**2-4*a*c
#	if (aux < 0):
#		print("Solución imaginaria")
#	else:
#		#x1=(-b+aux)/(2*a)
#		#x2=(-b-aux)/(2*a)
#		print("Primera solución",(-b+math.sqrt(aux))/(2*a))
#		print("Primera solución",(-b-math.sqrt(aux))/(2*a))

#16


