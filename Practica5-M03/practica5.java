/*
Practica 5:Instrucions d'entrada i sortida
Marc Fors Soler
 */
/*

//Donades dos variables A y B, que l’usuari ha d’introduir, es 
//demana un programa que intercanviï el valor de les variables.
//1

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		int A; //Declaración de la variable A de tipo Entero.
		int B;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Sirve para abrir una especie de canal para poder usar el input
		System.out.print("Pon un numero: "); //Imprime lo que le pongas entre los ().
		String valorA = reader.readLine(); //Un input en java.
		System.out.print("Pon otro numero: "); 
		String valorB = reader.readLine();
		A=Integer.parseInt(valorA); //Aqui se pasa A a un entero
		B=Integer.parseInt(valorB);
		A=A+B;
		B=A-B; 
		A=A-B;
		System.out.print(A+" "+B); 
		
	}
}

//Realitza un programa que demani a l’usuari dos nombres i després 
//mostri per pantalla la suma dels dos.
//2

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		int A;
		int B;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Numero 1: ");
		String valorA = reader.readLine();
		System.out.print("Numero 2: ");
		String valorB = reader.readLine();
		
		A=Integer.parseInt(valorA); //Aqui se pasa A a un entero
		B=Integer.parseInt(valorB);
		
		A=A+B;
		
		System.out.print(A); 
		
	}
}

//Programa que determini la edat d’un usuari (paràmetre d’entrada) 
//quan hagi transcorregut un quart de segle.
//3

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		int edad;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Que edad tienes: ");
		String valoredad = reader.readLine();
		
		edad=Integer.parseInt(valoredad);

		edad=edad+25;
		
		System.out.print(edad);
		
	}
}

//Programa que mostri el resultat d’elevar a la quarta potència un nombre 
//introduït per teclat. 
//4

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		int num;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero: ");
		String valornum = reader.readLine();
		
		num=Integer.parseInt(valornum);
		
		num = (int) Math.pow(num, 4); //Math.pow(variable, n) sirve para poder elevar facilmente / (int) Todo despues de esto lo pasa a int
		
		System.out.print(num);
		
	}
}

//Programa que demani una quantitat en euros i determini quin era el seu 
//valor amb les antigues “pessetes”.
//5

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		double euros;
		double pesetas;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon la cantidad de euros: ");
		String valoreuros = reader.readLine();
		
		euros=Double.parseDouble(valoreuros);
		pesetas= 166.386;
		
		euros= pesetas* (double) euros;
		
		System.out.print(euros); 
		
	}
}

//Donades la base i l’altura d’un rectangle per part de l’usuari, crea un programa 
//que calculi el àrea (Àrea = Base * Altura).
//6

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		double base;
		double altura;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon la base del rectangulo: ");
		String valorbase = reader.readLine();
		System.out.print("Pon la altura del rectangulo: ");
		String valoraltura = reader.readLine();
		
		base=Double.parseDouble(valorbase);
		altura=Double.parseDouble(valoraltura);
		
		System.out.print(base*altura); 
		
	}
}

//Escriu un programa que demani a l’usuari el nom i l’edat. Després ha de mostrar 
//per pantalla: “Hola (nom), la teva edat és (edat)”;
//7

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		String nombre;
		String edad;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon tu nombre: ");
		nombre = reader.readLine();
		System.out.print("Pon tu edad: ");
		edad = reader.readLine();
		
		System.out.print("Hola "+nombre+" la teva edat és "+edad); 
		
	}
}

//Escriu un programa que demani dos variables a l’usuari, i mostri per pantalla 
//la seva suma, resta, multiplicació, divisió i mòdul .
//8

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		int A;
		int B;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero: ");
		String num1 = reader.readLine();
		System.out.print("Pon otro numero: ");
		String num2 = reader.readLine();
		
		A=Integer.parseInt(num1);
		B=Integer.parseInt(num2);
		
		
		System.out.print("Suma "+(A+B)+"\nResta "+(A-B)+"\nMultiplicación "+(A*B)+"\nDivisión "+(A/B)+"\nModulo "+(A%B)); 
		
	}
}
 
//Realitza un programa que calculi el àrea i el perímetre d’una circumferència. 
//L’usuari haurà d’introduir el radi de la circumferència. ( A = π * r^2) ( P=2*π*r).
//9

import java.io.*;
     
public class practica5{
	public static void main(String[] args) throws IOException {
		float radi;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.println("Càlcul de l'àrea d'un cercle");
        System.out.print("Introduïu el radi: ");
        
        
        String linia = reader.readLine();
        radi = Float.parseFloat(linia);
        float area =  (float)Math.PI * radi * radi; //El (float) convierte todo lo siguiente hasta el ; en float Math.pi es para sacar el numero pi.
        System.out.println(" L'àrea és " + area);
	}
}

//Escriu un programa que mostri el resultat de l’equació de tercer grau. 
//Per a realitzar el programa s’hauran de llegir els coeficients (a, b, c i d) i el valor de x. El resultat es mostrarà per pantalla.
//10

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		int a;
		int b;
		int c;
		int d;
		int x;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Valor de a: ");
		String a1 = reader.readLine();
		System.out.print("Valor de b: ");
		String b1 = reader.readLine();
		System.out.print("Valor de c: ");
		String c1 = reader.readLine();
		System.out.print("Valor de d: ");
		String d1 = reader.readLine();
		System.out.print("Valor de x: ");
		String x1 = reader.readLine();
		
		a = Integer.parseInt(a1);
		b = Integer.parseInt(b1);
		c = Integer.parseInt(c1);
		d = Integer.parseInt(d1);
		x = Integer.parseInt(x1);
		
		double result=a*Math.pow(x, 3)+b * Math.pow(x, 2)+c * Math.pow(x, 1)+d; //El Math.pow sirve para elevar la variable de la izquierda del () al exponente de la derecha.
		
		System.out.print(result); 
		
	}
}

//Programa que demani una quantitat –preu d’un producte – i calculi i 
//visualitzi la quantitat d’IVA (aplicant un percentatge del 21 %) i 
//la quantitat total a pagar (preu original + Iva).
//11

import java.io.*;
     
public class practica5{
	public static void main(String[] args) throws IOException {
		double cantidad; 
		double precio; 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Pon la cantidad del producto: ");
        String cantidad1 = reader.readLine();
        System.out.print("Pon el precio del producto: ");
        String precio1 = reader.readLine();
        
        cantidad = Double.parseDouble(cantidad1);
        precio = Double.parseDouble(precio1);
        
        double total = cantidad*precio;
        total=total*0.21+total;
        
        System.out.println("El precio con IVA es: "+total+"€");
	}
}

//Modifica l’exercici anterior perquè el percentatge d’IVA sigui variable 
//(introduït per l’usuari).
//12

import java.io.*;
     
public class practica5{
	public static void main(String[] args) throws IOException {
		double cantidad; 
		double precio; 
		double iva; 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Pon la cantidad del producto: ");
        String cantidad1 = reader.readLine();
        System.out.print("Pon el precio del producto: ");
        String precio1 = reader.readLine();
        System.out.print("Pon el IVA sin el porcentaje: ");
        String iva1 = reader.readLine();
        
        cantidad = Double.parseDouble(cantidad1);
        precio = Double.parseDouble(precio1);
        iva = Double.parseDouble(iva1);
        
        double total = cantidad*precio;
        System.out.println(total);
        total=total*iva/100+total;
        
        System.out.println("El precio con IVA es: "+total+"€");
        System.out.println("El IVA es del: "+iva+"%");
	}
}

//Una companyia de refrescos comercialitza tres productes: de cola, de 
//taronja i de llimona. Es desitja realitzar un programa que calculi 
//les ventes de cada producte. Per a això es llegirà la quantitat venuda 
//i el preu de cada producte. Per finalitzar es mostrarà un informe 
//de les vendes semblant a aquest: 
//13

import java.io.*;
     
public class practica5{
	public static void main(String[] args) throws IOException {
		double total1,total2,total3,totalfinal1,totalfinal2,totalfinal3;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Pon la cantidad vendida de cola: ");
        String vendido1 = reader.readLine();
        System.out.print("Pon el precio de cola: ");
        String precio1 = reader.readLine();
        System.out.print("Pon la cantidad vendida de taronja: ");
        String vendido2 = reader.readLine();
        System.out.print("Pon el precio de taronja: ");
        String precio2 = reader.readLine();
        System.out.print("Pon la cantidad vendida de llimona: ");
        String vendido3 = reader.readLine();
        System.out.print("Pon el precio de llimona: ");
        String precio3 = reader.readLine();
		
		total1 = Double.parseDouble(vendido1);
		total2 = Double.parseDouble(vendido2);
		total3 = Double.parseDouble(vendido3);
		double total4 = Double.parseDouble(precio1);
		double total5 = Double.parseDouble(precio2);
		double total6 = Double.parseDouble(precio3);
		
		totalfinal1 = (total1 * total4);
		totalfinal2 = (total2 * total5);
		totalfinal3 = (total3 * total6);
		
        System.out.println("---------------------------------------");
        System.out.println("Producte	Vendes	Preu	Total");
        System.out.print("Cola		"+vendido1+"        "+precio1+"       ");System.out.println(totalfinal1);
        System.out.print("Taronja		"+vendido2+"        "+precio2+"       ");System.out.println(totalfinal2);
        System.out.print("Llimona		"+vendido3+"        "+precio3+"       ");System.out.println(totalfinal3);
        System.out.println("---------------------------------------");
        System.out.print("TOTAL				 ");System.out.println(totalfinal1+totalfinal2+totalfinal3);
	}
}

//Programa que demani  un nombre sencer i mostri l’últim dígit.
//14

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		int num2;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero entero: ");
		String num = reader.readLine();
		
		num2 = Integer.parseInt(num);
		
		int result = num2%10; //Usando el modulo parar sacar los 2 ultimos numeros
		
		System.out.print(result);
		
	}
}

//Escriu un programa que demani a l’usuari la quantitat de segons 
//i mostri per pantalla a quantes hores, minuts i segons corresponen 
//(p.ex: 3661 segons corresponen a 1 hora + 1 minut + 1 segon).
//15

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		
		int segundos,horas,minutos;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon los segundos: ");
		String seg = reader.readLine();
		
		segundos = Integer.parseInt(seg);
		
		horas = segundos/3600;
		minutos = (segundos-(horas*3600))/60;
		segundos = segundos-((horas*3600)+(minutos*60));
		
		System.out.print(horas+"h "+minutos+"m "+segundos+"s");
		
	}
}

*/

//Genera un programa que donat un nom i un cognom (demanats a l'usuari), 
//generi un identificador d'usuari que és nom.cognom i una contrasenya de 3 
//números que es generaran aleatòriament.
//16

import java.io.*;
 
public class practica5{
	public static void main(String[] args) throws IOException {
		
		String identificador;
		int password;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Como te llamas? : ");
		String name = reader.readLine();
		System.out.print("Cual es tu primer apellido? : ");
		String apell = reader.readLine();
		
		identificador = name+"."+apell;
		password = 100 + (int)(Math.random() * 999); 
		
		System.out.print(identificador+"\n"+password);
		
	}
}
