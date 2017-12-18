/*
//Exercici1
public class practica8 {
	
	public static void main (String[] args) {
		int i;
		for(i = 0; i <= 100i;i++){
			System.out.print(i+",");
		}
	}
}


//Exercici2
import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		int num,i;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Cuantas veces quieres imprimir tu nombre? ");
		String num1 = reader.readLine();
		System.out.print("Como te llamas? "); 
		String nombre = reader.readLine();
		
		num=Integer.parseInt(num1);
		
		for(i=0;i<num;i++){
			System.out.println(nombre);
		}
	}
}


//Exercici3
import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		int num1,num2,i;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero: ");
		String num3 = reader.readLine();
		System.out.print("Pon otro numero: ");
		String num4 = reader.readLine();
		
		num1=Integer.parseInt(num3);
		num2=Integer.parseInt(num4);
		num1 = num1-1;
		num2 = num2-1;
		
		if(num1<=num2){
			for(i=0;num1<=num2;i++){
				num1 = num1+1;
				System.out.println(num1);
			}
		}
		else if(num2<=num1){
			for(i=0;num2<=num1;i++){
			num2 = num2+1;
			System.out.println(num2);
			}
		}  
	}
}


//Exercici4

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		int num,num2,num3,i;
		num2 =0;
		num3 =0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero: ");
		String num1 = reader.readLine();

		num=Integer.parseInt(num1);
		
		for(i=0;i<=num;i++){
			num2 = i;
			num3 = num3 +i;
			System.out.println(num2);
		}
		System.out.println(num3);
	}
}


//Exercici5

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon tu nombre: ");
		String nombre = reader.readLine();
		System.out.print("Pon tu edad: ");
		String edadaux = reader.readLine();
		System.out.print("Pon el año actual: ");
		String anoaux = reader.readLine();

		int edad=Integer.parseInt(edadaux);
		int ano=Integer.parseInt(anoaux);
		
		int ano2 = ano - edad;
		int edad2 = edad - edad + 1;
		
		System.out.println("En "+ano2+"naciste");
		ano2 = ano2+1;
		
		for(int i=0;i<=edad -1;i++){
			System.out.println("En "+ano2+" tenias "+edad2);
			ano2 = ano2 +1;
			edad2 = edad2+1;
		}
		System.out.println("Adios "+nombre);
	}
}


//Exercici6

import java.io.*;
 
public class practica8{
		public static void main(String[] args) throws IOException {
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon el numero al cual quieras sacar el factorial: ");
		String numaux = reader.readLine();
		int num=Integer.parseInt(numaux);
		
		int factorial = 1;
		
		while(num != 0){
			factorial = factorial * num;
			//factorial *= num; Hace lo mismo que arriba pero es más confuso.
			num--; //Resta 1 al valor de num cada vuelta.
		}
		System.out.print("Factorial: " +factorial);	
	}	
}

//Exercici7

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int nota_ant,media;
		String peor_nota;
		
		media=0;
		peor_nota="";
		int notas=10;
		
		System.out.println("Nombre: ");
		String nombre = reader.readLine();
		System.out.println("Nota: ");
		String notaux = reader.readLine();
		
		int nota=Integer.parseInt(notaux);
		
		media = media + nota;
		
		for(int i =1;i<10;i++){
			System.out.println("Nombre: ");
			nombre = reader.readLine();
			System.out.println("Nota: ");
			notaux = reader.readLine();
			
			nota=Integer.parseInt(notaux);
			
			nota_ant = nota;
			
			//Bug en media que no me va
			media = media + nota;
			//Bug que si la primera nota introducida es menor a la segunda no la cuenta y saca la segunda nota como peor
			if(nota_ant <= nota){
				peor_nota= nombre;
			}
		}
		System.out.print("La media es: "+(media/notas)+ " La peor nota es: "+peor_nota);
	}	
}


//Exercici8

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float nota_ant,media,media1,num_notas;
		String peor_nota;
		
		media=0;
		num_notas=0;
		peor_nota="";
		
		System.out.println("Nombre: ");
		String nombre = reader.readLine();
		System.out.println("Nota: ");
		String notaux = reader.readLine();
		
		int nota=Integer.parseInt(notaux);
		
		System.out.println("Quieres salir: s/n");
		String salir = reader.readLine();
		
		media = media + nota;
		
		num_notas= num_notas + 1;
		
		for(int i =1;!(salir.equals("s"));i++){
			System.out.println("Nombre: ");
			nombre = reader.readLine();
			System.out.println("Nota: ");
			notaux = reader.readLine();
			
			nota=Integer.parseInt(notaux);
			
			nota_ant = nota;
			media = media + nota;
			
			if(nota_ant <= nota){
				peor_nota= nombre;
			}
			System.out.println("Quieres salir: s/n");
			salir = reader.readLine();
			num_notas = num_notas + 1;
		}
		System.out.print("La media es: "+(media/num_notas)+ " La peor nota es: "+peor_nota);
	}	
}


//Exercici9

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("numero: ");
		String numaux= reader.readLine();
		int num=Integer.parseInt(numaux);
		int num2 = num - (num-1);
		int num3 = 0;
		
		while(num3 != num){
			for(int i = 0;i<num;i++){
				System.out.print(num2+" ");
				num2 = num2 + 1;
			}
			System.out.println("");
			num2 = num - (num-1);
			num3++;
		}
	}
}


//Exercici10

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("numero: ");
		String numaux= reader.readLine();
		int num=Integer.parseInt(numaux);
		
		int num2 = num - (num-1);
		
		System.out.print("numero 2: ");
		String numaux2= reader.readLine();
		int num3=Integer.parseInt(numaux2);
		
		int num4 =0;
		
		while(num4 != num3){
			for(int i = 0;i<num;i++){
				System.out.print(num2+" ");
				num2 = num2 + 1;
			}
			System.out.println("");
			num2 = num - (num-1);
			num4++;
		}
	}
}


//Exercici11

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String simbolo = "*";
		String simbolo2 = "*";
		
		System.out.print("Pon un numero positivo mayor a 0: ");
		String numaux= reader.readLine();
		int num=Integer.parseInt(numaux);
		
		while(num < 0){
			System.out.print("Pon un numero positivo mayor a 0: ");
			numaux= reader.readLine();
			num=Integer.parseInt(numaux);
		}
		
		for(int i = 0;i<num;i++){
			System.out.println(simbolo);
			simbolo = simbolo2 + simbolo; 
		}
	}
}
*/

//Exercici12

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero positivo mayor a 0: ");
		String numaux= reader.readLine();
		int num=Integer.parseInt(numaux);
		
		while(num < 0){
			System.out.print("Pon un numero positivo mayor a 0: ");
			numaux= reader.readLine();
			num=Integer.parseInt(numaux);
		}
		
		int num2 = num;
		int num3 = 1;
		int num4 = 0;
		int num5 = num;
		num2 = 1;
		num = num2;
		
		while(num4 < num5){
			for(int i = 0;i<num2;i++){
				System.out.print(num+",");
			}
			System.out.println("");
			num5--;
			num++;
			num3 = num;
			num2++;
		}
	}
}

/*
//Exercici13

import java.io.*;
 
public class practica8{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero positivo mayor a 0: ");
		String numaux= reader.readLine();
		int num=Integer.parseInt(numaux);
		
		while(num < 0){
			System.out.print("Pon un numero positivo mayor a 0: ");
			numaux= reader.readLine();
			num=Integer.parseInt(numaux);
		}
		
		int num2 = 1;
		int num3 = 1;
		int num4 = 0;
		int num5 = num;
		
		while(num4 != num){
			for(int i = 0;i<num5;i++){
				System.out.print(num2+",");
				num2 = num3 + num2;
			}
			System.out.println("");
			num5--;
			num4++;
			num2 =1;
		}
	}
}
*/
