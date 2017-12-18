#!/usr/bin/env python
# -*- coding: utf-8 -*-
#7
dia=int(input("Que dia es: "))
mes=int(input("Que mes es: "))
ano=int(input("Que año es: "))
horas=int(input("Que hora es: "))
minutos=int(input("Que minutos de la hora: "))
segundos=int(input("Que segundos de la hora: "))

segundos = segundos+1

if (segundos == 60):
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
