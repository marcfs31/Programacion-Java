/*
*Marc Fors Soler
 */

/*
//1
import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		int edad1;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Que edad tienes? ");
		String edad = reader.readLine();
		System.out.print("Como te llamas? "); 
		String nombre = reader.readLine();
		
		edad1=Integer.parseInt(edad);
		
		if (edad1 > 17) {
			System.out.print("Vostè ja pot anar a la presó!");
			System.out.print("Adéu "+nombre+" !");
		} else {
			System.out.print("Adéu "+nombre+" !");
		}
	}
}


//2
import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		int num1;
		int num2;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero? ");
		String num3 = reader.readLine();
		System.out.print("Pon otro numero? "); 
		String num4 = reader.readLine();
		
		num1=Integer.parseInt(num3);
		num2=Integer.parseInt(num4);
		
		if (num1 < num2) {
			System.out.print(num1+" "+num2);
		} else {
			System.out.print(num2+" "+num1);
		}
	}
}


//3
import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		int num1;
		int num2;
		int producto;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero? ");
		String num3 = reader.readLine();
		System.out.print("Pon otro numero? "); 
		String num4 = reader.readLine();
		
		num1=Integer.parseInt(num3);
		num2=Integer.parseInt(num4);
		
		producto=num1*num2;
		
		if (producto == 0) {
			System.out.println("El seu producte es 0");
			System.out.print(producto);
		} else if (producto > 0 ) {
			System.out.println("El seu producte es més gran que 0");
			System.out.print(producto);
		} else if (producto <0) {
			System.out.println("El seu producte es més petit que 0");
			System.out.println(producto);
		}
	}
}



//4
import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		String simbolo;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon una tecla aleatoria del teclado: ");
		simbolo = reader.readLine();
		System.out.print(simbolo);
		
		if (simbolo.equals("0") || simbolo.equals("1") || simbolo.equals("2") || simbolo.equals("3") || simbolo.equals("4") || simbolo.equals("5") || simbolo.equals("6") || simbolo.equals("7") || simbolo.equals("8") || simbolo.equals("9")) {
			System.out.print("Es un numero");
		} else {
			System.out.print("No es un numero");
		}
	}
}


//5


import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		float original,pagado,iva,percent;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon el precio original? ");
		String original1 = reader.readLine();
		System.out.print("Pon el precio pagado? "); 
		String pagado1 = reader.readLine();
		
		original=Integer.parseInt(original1);
		pagado=Integer.parseInt(pagado1);
		
		iva=original-pagado;
		percent=iva*100/original;
		
		System.out.println("Te han descontado "+iva+" € "+"que es un "+percent+" % "+"del precio original");
	}
}


//6
import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		int mes,ano,mes2,mes3,ano2,ano1;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Que mes es (en numero)? ");
		String mesin = reader.readLine();
		System.out.print("que año es? "); 
		String anoin = reader.readLine();
		
		mes=Integer.parseInt(mesin);
		ano=Integer.parseInt(anoin);
		
		if (mes == 12) {
			mes2 = mes-1;
			mes3 = 1;
			ano1 = ano+1;
			ano2= ano;
			
			System.out.print("anterior "+mes2+"/"+ano2+" posterior "+mes3+"/"+ano1);
		} else {
			mes2= mes-1;
			mes3= mes+1;
			
			System.out.print("anterior "+mes2+"/"+ano+" posterior "+mes3+"/"+ano);
		}
	}
}


//7
import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		int dia,mes,ano,horas,minutos,segundos;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Que dia es: ");
		String  auxdia= reader.readLine();
		System.out.print("que mes es? "); 
		String auxmes = reader.readLine();
		System.out.print("que año es? "); 
		String auxano = reader.readLine();
		System.out.print("que hora es? "); 
		String auxhora = reader.readLine();
		System.out.print("que minutos de la hora? "); 
		String auxminutos = reader.readLine();
		System.out.print("que segundos de la hora? "); 
		String auxsegundos = reader.readLine();
		
		dia=Integer.parseInt(auxdia);
		mes=Integer.parseInt(auxmes);
		ano=Integer.parseInt(auxano);
		horas=Integer.parseInt(auxhora);
		minutos=Integer.parseInt(auxminutos);
		segundos=Integer.parseInt(auxsegundos);
		
		segundos = segundos +1;
		
		if (segundos == 60){
			minutos=minutos+1;
			segundos=0;
			}if (minutos == 60){
				horas=horas+1;
				minutos=0;
				}if (horas == 24){
					dia=dia+1;
					horas=0;
					}if (dia == 31){
						mes=mes+1;
						dia=1;
						}if(mes == 13){
							ano=ano+1;
							mes=1;
						}
				
		System.out.print("Dia "+dia+" Mes "+mes+" Año "+ano+" Horas "+horas+" Minutos "+minutos+" Segundos "+segundos);
		
		}
	}

//8
import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		int num1,num2,num3,num4,num5,num6;
		num4 = 0;
		num5 = 0;
		num6 = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon un numero: ");
		String auxnum1 = reader.readLine();
		System.out.print("Pon otro numero "); 
		String  auxnum2 = reader.readLine();
		System.out.print("Pon otro numero "); 
		String  auxnum3 = reader.readLine();
		
		num1=Integer.parseInt(auxnum1);
		num2=Integer.parseInt(auxnum2);
		num3=Integer.parseInt(auxnum3);
		
		if (num1 <= num2 && num1 <= num3){
			num4 = num1;
			if (num2 <= num3){
				num5 = num2;
				num6 = num3;
			}else{
				num5 = num3;
				num6 = num2;
			}
		}else{
			if (num2 <= num1 && num2 <= num3){
				num4 = num2;
				if (num1 <= num3){
					num5 = num1;
					num6 = num3;
				}else{
					num5 = num3;
					num6 = num1;
				}
			}else{
				if (num3 <= num1 && num3 <= num2){
					num4 = num3;
					if (num1 <= num2){
						num5 = num1;
						num6 = num2;
					}else{
						num5 = num2;
						num6 = num1;
					}
				}
			}
		}

		System.out.print(num4+","+num5+","+num6);
		
	}
}
*/

//9
import java.io.*;
 
public class practica6{
	public static void main(String[] args) throws IOException {
		int num1,num2;
		String op = "";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pon el primer numero ");
		String auxnum1 = reader.readLine();
		System.out.print("Pon la operación deseada (+,-,x,/) "); 
		String auxop = reader.readLine();
		System.out.print("Pon el segundo numero "); 
		String auxnum2 = reader.readLine();
		
		num1=Integer.parseInt(auxnum1);
		num2=Integer.parseInt(auxnum2);
		op=auxop;
				
		if (op.equals("+")){
			System.out.print("La operación da "+(num1+num2));
			}
		else if(op.equals("-")){
			System.out.print("La operación da "+(num1-num2));
			}
		else if(op.equals("x")){
			System.out.print("La operación da "+(num1*num2));
			}
		else if(op.equals("/")){
			System.out.print("La operación da "+(num1/num2));
			}
	}
}
