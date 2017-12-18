/*
 * Practica 7
 * Marc Fors Soler
 */
 
 /*
 //1
import java.io.*;
 
public class practica7 {
	
	public static void main (String[] args) throws IOException {
		int num;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero y te devuelvo la raiz cuadrada: ");
		String num1 = reader.readLine();
		
		num=Integer.parseInt(num1);
		
		if (num < 0) {
			while (num < 0) {
				System.out.println("Pon un numero positivo!!");
				System.out.print("Pon un numero y te devuelvo la raiz quadrada: ");
				num1 = reader.readLine();
				
				num=Integer.parseInt(num1);
				if (num > 0) {
					System.out.println("La raiz cuadrada da: "+Math.sqrt(num));
					} else {
						System.out.println("Pon un numero positivo!!");
						System.out.print("Pon un numero y te devuelvo la raiz quadrada: ");
						num1 = reader.readLine();
				
						num=Integer.parseInt(num1);
					}
				}
				
			}else{
				System.out.println("La raiz cuadrada da: "+Math.sqrt(num));
				}
		}
	}

//2 Ejercicio1 practica 6
import java.io.*;
 
public class practica7{
	public static void main(String[] args) throws IOException {
		int edad1;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Que edad tienes? ");
		String edad = reader.readLine();
		System.out.print("Como te llamas? "); 
		String nombre = reader.readLine();
		
		//Modificación para evitar edades falsas
		edad1=Integer.parseInt(edad);
		while (edad1 < 0 || edad1 > 110 ) {
			System.out.println("Edad incorrecta vuelvela a introducir");
			System.out.print("Que edad tienes? ");
			edad = reader.readLine();
			System.out.print("Como te llamas? "); 
			nombre = reader.readLine();
			edad1=Integer.parseInt(edad);
			}
			
		if (edad1 > 17) {
			System.out.print("Vostè ja pot anar a la presó!");
			System.out.print("Adéu "+nombre+" !");
		} else {
			System.out.print("Adéu "+nombre+" !");
		}
	}
}


//3

import java.io.*;
 
public class practica7 {
	
	public static void main (String[] args) throws IOException {
		int num1,num2,num3;
		String continuar;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.print("Pon el primer numero: ");
			String num1aux= reader.readLine();
			
			System.out.print("Pon el operador: ");
			String op = reader.readLine();
		
			System.out.print("Pon el segundo numero: ");
			String num2aux = reader.readLine();
			
			num1=Integer.parseInt(num1aux);
			num2=Integer.parseInt(num2aux);
			
			
			switch(op){
				case "+":
					num3=num1+num2;
					System.out.println("El resultado es: "+num3);
					break;
				case "-":
					num3=num1-num2;
					System.out.println("El resultado es: "+num3);
					break;
				case "x":
					num3=num1*num2;
					System.out.println("El resultado es: "+num3);
					break;
				case "/":
					if(op.equals("/") && num1 == 0 || op.equals("/") && num2 ==0) {
						System.out.println("División por 0 no permitida");
						break;
					}else{
						num3=num1/num2;
						System.out.println("El resultado es: "+num3);
						break;
					}
				default :
					System.out.println("No has introducido un operador correcto");
							
				}
				System.out.println("Quieres volver a intentarlo? (si/no)");
				continuar = reader.readLine();
			} while (continuar.equals("si")); {				
				}
		
		}
	}


//4

import java.io.*;
 
public class practica7 {
	
	public static void main (String[] args) throws IOException {
		String pisoActual,a,b,c,d,x,piso1,piso2,piso3,piso4,Salir;
		piso1 = "PLANTA BAIXA";
		piso2 = "PRIMER PIS";
		piso3 = "SEGON PIS";
		piso4 = "";
		pisoActual = "PLANTA BAIXA";
		Salir = "n";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("Es troba a "+pisoActual);
			System.out.println("Seleccioni una opció: ");
			System.out.println("a: pujar un pis");
			System.out.println("b: pujar dos pisos");
			System.out.println("c: baixar un pis");
			System.out.println("d: baixar dos pisos");
			System.out.println("x: sortir de l'ascensor");
			
			String boton= reader.readLine();
			
			switch(boton){
				case "a":
					if(pisoActual.equals(piso1)){
						pisoActual = piso2;
						}
						else if(pisoActual.equals(piso2)){
							pisoActual = piso3;
							}
							else{
								System.out.println("No pots pujar 1 pis");
							}
							break;
				case "b":
						if(pisoActual.equals(piso1)){
							pisoActual = piso3;
						}
						else{
								System.out.println("No pots pujar 2 pisos");
							}
							break;
				case "c":
						if(pisoActual.equals(piso3)){
							pisoActual = piso2;
						}
						else if(pisoActual.equals(piso2)){
							pisoActual = piso1;
							}
							else{
								System.out.println("No pots baixar 1 pis");
							}
							break;
				case "d":
						if(pisoActual.equals(piso3)){
							pisoActual = piso1;
						}
						else{
								System.out.println("No pots baixar 2 pisos");
							}
					break;
				case "x":
					System.out.println("Adeu");
					Salir = "s";
					break;
				default:
					System.out.println("opció incorrecta2");
					
				}
			}while(Salir.equals("n"));{
				}
		}
	}


//5
import java.io.*;
 
public class practica7{
	public static void main(String[] args) throws IOException {
		int dinero,dinero2,billete500,billete200,billete100,billete50,billete20,billete10,billete5,moneda2,moneda1;
		billete500=0;
		billete200=0;
		billete100=0;
		billete50=0;
		billete20=0;
		billete10=0;
		billete5=0;
		moneda2=0;
		moneda1=0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Cuanto dinero tienes? ");
		String dineroaux = reader.readLine();
		
		dinero=Integer.parseInt(dineroaux);
		
		while (dinero >= 500){
			dinero= dinero - 500;
			billete500 = billete500+1;
		}
		while (dinero >= 200){
			dinero= dinero - 200;
			billete200 = billete200+1;
		}
		while (dinero >= 100){
			dinero= dinero - 100;
			billete100 = billete100+1;
		}
		while (dinero >= 50){
			dinero= dinero - 50;
			billete50 = billete50+1;
		}
		while (dinero >= 20){
			dinero= dinero - 20;
			billete20 = billete20+1;
		}
		while (dinero >= 10){
			dinero= dinero - 10;
			billete10 = billete10+1;
		}
		while (dinero >= 5){
			dinero= dinero - 5;
			billete5 = billete5+1;
		}
		while (dinero >= 2){
			dinero= dinero - 2;
			moneda2 = moneda2+1;
		}
		while (dinero >= 1){
			dinero= dinero - 1;
			moneda1 = moneda1+1;
		}
		System.out.print("Biletes de 500 "+billete500+" "+"Biletes de 200 "+billete200+" "+"Biletes de 100 "+billete100+" "+"Biletes de 50 "+billete50+" "+"Biletes de 20 "+billete20+" "+"Biletes de 10 "+billete10+" "+"Biletes de 5 "+billete5+" "+"Monedas de 2 "+moneda2+" "+"Monedas 1 "+moneda1);
	}
}
*/

//6
import java.io.*;
import java.util.*;
 
public class practica7 {
	
	public static void main (String[] args) throws IOException {
		int num1,num2,num3,intentos;
		String salir;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("JUEGO DE LA RULETA");

		Random num = new Random();
		
		num1 = num.nextInt(10);
		num2 = num.nextInt(10);
		num3 = num.nextInt(10);
		
		intentos = num.nextInt(5);
		do {
			if(intentos <=0){
				salir ="s";
			}
			System.out.println("Intentos restantes"+intentos);
			
			System.out.println("Quieres cambiar alguna posición? ");
			System.out.println("1|2|3 o 0 para ninguna posición");
			String fila= reader.readLine();
			
			if(intentos > 0){
				salir ="n";
				System.out.println("#######");
				System.out.println("#"+num1+"|"+num2+"|"+num3+"#");
				System.out.println("#######");
				
				if(fila.equals("1")){
					num1 =num.nextInt(10);
					intentos = intentos -1;
					}else if(fila.equals("2")){
						num2 = num.nextInt(10);
						intentos = intentos -1;
						}else if(fila.equals("3")){
							intentos = intentos -1;
							num3 = num.nextInt(10);
							}else if(fila.equals("0")){
								intentos = 0;
								}
				}else{
					intentos =0;
					System.out.println("#######");
					System.out.println("#"+num1+"|"+num2+"|"+num3+"#");
					System.out.println("#######");
					}
				
				if(num1 == num2 && num2 == num3 ){
					System.out.println("Felicidades has ganado 500€ ");
				}else if(num1 == num2 || num2 == num3){
						System.out.println("Felicidades has ganado 250€ ");
				}
				
			}while(intentos > 0);{				
			}
		
		}
	}
