import java.util.Random;
import java.io.*;
public class Juego {
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Juego que permita elegir entre tres idiomas al inicio de la partida, genere 4
		//operadandos(+,-,/,*) y 2 numeros, tienes tiempo limitado para resolver las operaciones
		//la primera 60 segundos si la haces bien te suma 5 segundos, si la haces mal te vuelve a pedir
		//la solución por cada fallo -5 segundo. Si haces 10 operaciones bien en los 60 segundos
		//pasas al siguiente nivel, también te dejara elegir al principio del nivel que operandos quieres usar
		//Cada nivel de dificultad añadira 10 numeros más al rango de generacion de numeros aleatorios,
		//Cuando se acaba el tiempo muestra el resultado obtenido en total, y cada respuesta del nivel 1 te suma 10 puntos,
		// nivel 2 20 y asi... cada nivel el tiempo son 60 segundos al primer nivel con +-5 al segundo nivel 60 con +-10 asi hasta el 4 nivel y el quinto
		//ya es si fallas mueres.
		//BlackJack
		//3 en raya
		//Ahorcado
		//Sin el tiempo
		//Calcular tiempo tardado en responder
		//Variables
		Random rand = new Random();
		String idioma,lang,op,resp_str,dificultad="",difficulty,exit="n",salir="n";
		int num1,num2,num_op,resp=0,result,puntos=0;
		long time_used=0;
		long time_left=0;
		long init_cont=0;
		long fin_cont=0;
		long lap_cont=0;
		//Arrays
		String ops[] = {"+","-","x"};
		String ops_ex[] = {"+","-","x","%"};
		do{
			if(exit.equals("s")){
				break;
			}
			//Selección de idioma
			System.out.println("	    GENIUS MIND");
			System.out.println("###################################");
			
			System.out.println("     Choose the game language: ");
			System.out.print("English:1 || Spanish:2 || Catalan:3 || Exit:4");
			System.out.println();
			lang = reader.readLine();
			switch(lang){
				case "1": idioma="English";
					break;
				case "2": idioma="Spanish";
					break;
				case "3": idioma="Catalan";
					break;
				case "4": salir="s";
				default: idioma= "English";
			}
			
			System.out.print("\033\143");
			System.out.print("\033\143");//Hacer un clear
			
			if(salir.equals("s")){
				break;
			}
			
			//Inglés
			if(idioma.equals("English")){
				do{
					//Dificultad
					System.out.println("     Choose the difficulty of the game: ");
					System.out.print("Easy:1 || Normal:2 || Hard:3 || Extreme:4 || Exit:5");
					System.out.println();
					difficulty = reader.readLine();
					switch(difficulty){
						case "1": dificultad ="Easy";
							break;
						case "2": dificultad ="Normal";
							break;
						case "3": dificultad ="Hard";
							break;
						case "4": dificultad = "Extreme";
							break;
						case "5": exit= "s";
							break;
						default: dificultad = "Easy";
					}
					System.out.print("\033\143");
					
					//Fácil
					if(dificultad.equals("Easy")){
						init_cont = System.currentTimeMillis();
						
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Time left: "+time_left+" of 60 seconds");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(10) + 1;
							num2 = rand.nextInt(10) + 1;
							num_op = rand.nextInt(3) + 1;
							num_op--;
							op=ops[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else{
								result = num1*num2;
							}
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Answer: ");
							resp_str = reader.readLine();
							resp = Integer.parseInt(resp_str);
							
							//Limpiar pantalla
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 1;
							}else{
								puntos -= 1;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("No time left");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Time used "+time_used+" of 60 seconds");
						}
						
						//Puntos
						System.out.println("You have "+puntos+" points");
					
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
						
					}
					
					//Normal
					if(dificultad.equals("Normal")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Time left: "+time_left+" of 60 seconds");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							if(op.equals("%")){
								num1 = rand.nextInt(10) + 1;
								num2 = rand.nextInt(10) + 1;
							}
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Answer: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 5;
							}else{
								puntos -= 5;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("No time left");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Time used "+time_used+" of 60 seconds");
						}
						
						//Puntos
						System.out.println("You have "+puntos+" points");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
					
					//Dificil
					if(dificultad.equals("Hard")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Time left: "+time_left+" of 60 seconds");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Answer: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 10;
							}else{
								puntos -= 10;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("No time left");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Time used "+time_used+" of 60 seconds");
						}
						
						//Puntos
						System.out.println("You have "+puntos+" points");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
					
					//Extremo
					if(dificultad.equals("Extreme")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Time left: "+time_left+" of 60 seconds");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Answer: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 25;
							}else{
								puntos -= 25;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("No time left");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Time used "+time_used+" of 60 seconds");
						}
						
						//Puntos
						System.out.println("You have "+puntos+" points");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
				}while(exit != "s");
				
			//Catalán
			}else if(idioma.equals("Catalan")){
				do{
					//Dificultad
					System.out.println("     Escull la dificultat del joc: ");
					System.out.print("Fàcil:1 || Normal:2 || Difil:3 || Extrema:4 || Sortir:5");
					System.out.println();
					difficulty = reader.readLine();
					switch(difficulty){
						case "1": dificultad ="Easy";
							break;
						case "2": dificultad ="Normal";
							break;
						case "3": dificultad ="Hard";
							break;
						case "4": dificultad = "Extreme";
							break;
						case "5": exit= "s";
							break;
						default: dificultad = "Easy";
					}
					
					System.out.print("\033\143");
					
					//Fácil
					if(dificultad.equals("Easy")){
						init_cont = System.currentTimeMillis();
						
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Temps restant: "+time_left+" de 60 segons");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(10) + 1;
							num2 = rand.nextInt(10) + 1;
							num_op = rand.nextInt(3) + 1;
							num_op--;
							op=ops[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else{
								result = num1*num2;
							}
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Resposta: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 1;
							}else{
								puntos -= 1;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("Temps acabat");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Temps utilitzat: "+time_used+" de 60 segons");
						}
						
						//Puntos
						System.out.println("Tens "+puntos+" punts");
					
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
					
					//Normal
					if(dificultad.equals("Normal")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Temps restant: "+time_left+" de 60 segons");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							if(op.equals("%")){
								num1 = rand.nextInt(10) + 1;
								num2 = rand.nextInt(10) + 1;
							}
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Resposta: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 5;
							}else{
								puntos -= 5;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("Temps acabat");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Temps utilitzat: "+time_used+" de 60 segons");
						}
						
						//Puntos
						System.out.println("Tens "+puntos+" punts");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
					
					//Dificil
					if(dificultad.equals("Hard")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Temps restant: "+time_left+" de 60 segons");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Resposta: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 10;
							}else{
								puntos -= 10;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("Temps acabat");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Temps utilitzat: "+time_used+" de 60 segons");
						}
						
						//Puntos
						System.out.println("Tens "+puntos+" punts");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
					
					//Extremo
					if(dificultad.equals("Extreme")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Temps restant: "+time_left+" de 60 segons");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Resposta: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 25;
							}else{
								puntos -= 25;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("Temps acabat");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Temps utilitzat: "+time_used+" de 60 segons");
						}
						
						//Puntos
						System.out.println("Tens "+puntos+" punts");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
				}while(exit != "s");
			//Español
			}else if(idioma.equals("Spanish")){
							do{
					//Dificultad
					System.out.println("     Escull la dificultat del joc: ");
					System.out.print("Fàcil:1 || Normal:2 || Difil:3 || Extrema:4 || Salir:5");
					System.out.println();
					difficulty = reader.readLine();
					switch(difficulty){
						case "1": dificultad ="Easy";
							break;
						case "2": dificultad ="Normal";
							break;
						case "3": dificultad ="Hard";
							break;
						case "4": dificultad = "Extreme";
							break;
						case "5": exit= "s";
							break;
						default: dificultad = "Easy";
					}
					
					System.out.print("\033\143");
					
					//Fácil
					if(dificultad.equals("Easy")){
						init_cont = System.currentTimeMillis();
						
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Tiempo restante: "+time_left+" de 60 segundos");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(10) + 1;
							num2 = rand.nextInt(10) + 1;
							num_op = rand.nextInt(3) + 1;
							num_op--;
							op=ops[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else{
								result = num1*num2;
							}
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Respuesta: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 1;
							}else{
								puntos -= 1;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("Tiempo acabado");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Tiempo usado: "+time_used+" de 60 segundos");
						}
						
						//Puntos
						System.out.println("Tienes "+puntos+" puntos");
					
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
					
					//Normal
					if(dificultad.equals("Normal")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Tiempo restante: "+time_left+" de 60 segundos");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							if(op.equals("%")){
								num1 = rand.nextInt(10) + 1;
								num2 = rand.nextInt(10) + 1;
							}
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Respuesta: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 5;
							}else{
								puntos -= 5;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("Tiempo acabado");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Tiempo usado: "+time_used+" de 60 segundos");
						}
						
						//Puntos
						System.out.println("Tienes "+puntos+" puntos");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
					
					//Dificil
					if(dificultad.equals("Hard")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Tiempo restante: "+time_left+" de 60 segundos");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Respuesta: ");
							resp_str = reader.readLine(); 
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 10;
							}else{
								puntos -= 10;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("Tiempo acabado");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Tiempo usado: "+time_used+" de 60 segundos");
						}
						
						//Puntos
						System.out.println("Tienes "+puntos+" puntos");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
					
					//Extremo
					if(dificultad.equals("Extreme")){
						init_cont = System.currentTimeMillis();
						
						//Calcular operadores y operando
						for(int i=0;i<4;i++){
							//Tiempo por vuelta
							lap_cont = System.currentTimeMillis();
							if((init_cont+60000) < lap_cont){
								break;
							}else{
								time_left = 60-((lap_cont-init_cont)/1000);
								System.out.println("Tiempo restante: "+time_left+" de 60 segundos");
							}
							
							//Generar los numeros y el operador
							num1 = rand.nextInt(100) + 1;
							num2 = rand.nextInt(100) + 1;
							num_op = rand.nextInt(4) + 1;
							num_op--;
							op=ops_ex[num_op];
							
							//Calcular el resultado de las operaciones
							if(op.equals("+")){
								result = num1+num2;
							}else if(op.equals("-")){
								result = num1-num2;
							}else if(op.equals("*")){
								result = num1*num2;
							}else{
								result = num1%num2;
							}
							
							//Cojer respuestas
							System.out.println(num1+op+num2);
							System.out.print("Respuesta: ");
							resp_str = reader.readLine();
							resp = Integer.parseInt(resp_str);
							
							System.out.print("\033\143");
							
							//Sistema de puntos
							if(resp == result){
								puntos += 25;
							}else{
								puntos -= 25;
							}
						}
						
						fin_cont = System.currentTimeMillis();
						if((init_cont+60000) < fin_cont){
							System.out.println("Tiempo acabado");
						}else{
							//Calcular tiempo usado
							time_used = (fin_cont-init_cont)/1000;
							System.out.println("Tiempo usado: "+time_used+" de 60 segundos");
						}
						
						//Puntos
						System.out.println("Tienes "+puntos+" puntos");
						
						reader.readLine();
						dificultad = ""; 
						System.out.print("\033\143");
					}
				}while(exit != "s");
			}
		}while(salir != "s");
	}
}
