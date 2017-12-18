# encoding: utf-8
import math
     
print "Càlcul de l'àrea d'un cercle"
linia = raw_input("Introduïu el radi:")
radi = float(linia)   # conversió de String a float
area = math.pi * radi**2
print "L'àrea és ", area
