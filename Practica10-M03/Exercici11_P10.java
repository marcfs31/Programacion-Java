import java.io.*;
import java.util.Arrays;

public class Exercici11_P10 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Iniciar y declarar variables
		float nota,media,min,max,buscar;
		String nota_str,buscar_str,corregir_str,nota_corregir_str;
		media=0;
		float nota_corregir;
		int contador=0;
		int corregir=0;
		int suspendidos=0;
		int aprobados=0;
		
		//Coger cantidad de alumnos
		System.out.print("Cuantos alumnos vas introducir: ");
		String alumnos_str= reader.readLine();
		int alumnos = Integer.parseInt(alumnos_str);
		
		while(alumnos>50 || alumnos<1){
			System.out.println("ERROR: Cantidad invalida rango entre 1 y 50 porfavor");
			System.out.println("Cuantos alumnos vas introducir: ");
			alumnos_str= reader.readLine();
			alumnos = Integer.parseInt(alumnos_str);
		}
		
		//Crear el array
		float notas[];
		notas = new float[alumnos];
		
		//Coger notas
		for(int i=0;i<notas.length;i++){
			System.out.print("Introduce la nota del alumno número "+(i+1)+": ");
			nota_str = reader.readLine();
			nota = Float.parseFloat(nota_str);
			while(nota>10 || nota<0){
				System.out.println("ERROR: Nota invalida rango entre 0 y 10");
				System.out.print("Introduce la nota del alumno número "+(i+1)+": ");
				nota_str = reader.readLine();
				nota = Float.parseFloat(nota_str);
			}
			notas[i]=nota;
			System.out.println(notas[i]);
		}
		
		//Imprimir las notas con una coma
		System.out.println("Notas separadas por coma");
		for(int c=0;c<notas.length;c++){
			System.out.print(notas[c]+", ");
		}
		
		System.out.println();
		
		//Imprimir las notas al reves
		System.out.println("Notas separadas por coma al revés");
		for(int c=alumnos-1;c>=contador;c--){
			System.out.print(notas[c]+", ");
		}
		
		System.out.println();
		
		//Corregir
		System.out.print("Que posición quieres corregir? ");
		corregir_str = reader.readLine();
		corregir = Integer.parseInt(corregir_str);
		while(corregir > notas.length || corregir < 0){
			System.out.println("ERROR: Nota no existente");
			System.out.print("Que posición quieres corregir? ");
			corregir_str = reader.readLine();
			corregir = Integer.parseInt(corregir_str);
		}
		corregir = corregir-1;
		
		System.out.print("Introduce la nota a corregir: ");
		nota_corregir_str = reader.readLine();
		nota_corregir = Integer.parseInt(nota_corregir_str);
		while(nota_corregir>10 || nota_corregir<0){
			System.out.println("ERROR: Nota invalida rango entre 0 y 10");
			System.out.print("Introduce la nota a corregir: ");
			nota_corregir_str = reader.readLine();
			nota_corregir = Float.parseFloat(nota_corregir_str);
			}
		
		//Media
		for(int a=0;a<=notas.length-1;a++){
			media = media + notas[a];
		}
		
		//Minimo y maximo
		min=notas[0];
		max=notas[0];

		for(int b=0;b<notas.length;b++){
			if(notas[b]>max){
				max=notas[b];
			}
			if(notas[b]<min){
				min=notas[b];
			}
		}
		
		System.out.println();
		
		//Inicial
		System.out.println("Inicial");
		for(int c=0;c<notas.length;c++){
			System.out.print(notas[c]+", ");
		}
		System.out.println();
		
		System.out.println("La media es de: "+media/notas.length);
		System.out.println("La mayor nota es: "+max);
		System.out.println("La menor nota es: "+min);
		
		System.out.println();
		
		//Correción
		System.out.println("Correción");
		notas[corregir]=nota_corregir;
		
		media=0;
		for(int d=0;d<=notas.length-1;d++){
			media = media + notas[d];
		}
		
		min=notas[0];
		max=notas[0];

		for(int e=0;e<notas.length;e++){
			if(notas[e]>max){
				max=notas[e];
			}
			if(notas[e]<min){
				min=notas[e];
			}
		}
		
		for(int f=0;f<notas.length;f++){
			System.out.print(notas[f]+", ");
		}
		System.out.println();
		
		System.out.println("La media es de: "+media/notas.length);
		System.out.println("La mayor nota es: "+max);
		System.out.println("La menor nota es: "+min);
		
		//Aprobados y suspendidos
		for(int c=0;c<notas.length;c++){
			if(notas[c]>=5){
				aprobados++;
			}else{
				suspendidos++;
			}
		}
		System.out.println("Han aprobado: "+aprobados);
		System.out.println("Han suspendido: "+suspendidos);
		
		System.out.println();
		
		//Pedir nota a buscar
		System.out.print("Que nota quieres buscar? ");
		buscar_str = reader.readLine();
		buscar = Float.parseFloat(buscar_str);
		while(buscar > 10 || buscar < 0){
			System.out.println("ERROR: Nota invalida");
			System.out.print("Que nota quieres buscar? ");
			buscar_str = reader.readLine();
			buscar = Float.parseFloat(buscar_str);
		}
		
		//Media
		for(int a=0;a<=notas.length-1;a++){
			media = media + notas[a];
		}
		
		//Minimo y maximo
		min=notas[0];
		max=notas[0];

		for(int b=0;b<notas.length;b++){
			if(notas[b]>max){
				max=notas[b];
			}
			if(notas[b]<min){
				min=notas[b];
			}
		}
		
		System.out.println();
		
		//Inicial
		System.out.println("Notas actuales");
		for(int c=0;c<notas.length;c++){
			System.out.print(notas[c]+", ");
		}
		
		int buscar_encontrado=0;
		int posiciones_buscar[];
		int z=0;
		
		System.out.println();
		
		//Buscar nota
		for(int d=0;d<notas.length;d++){
			if(notas[d]==buscar){
				buscar_encontrado++;
				z++;
			}
		}
		
		posiciones_buscar = new int[buscar_encontrado];
		int z2=0;
		for(int x=0;x<notas.length;x++){
			if(notas[x]==buscar){
				posiciones_buscar[z2]=x;
				z2++;
			}
		}
		
		if(buscar_encontrado == 0){
			System.out.println("No hay ninguna nota con el valor de "+buscar);
		}else if(buscar_encontrado == 1){
			System.out.println("Hay "+buscar_encontrado+" nota con el valor "+buscar+" en las posiciones "+Arrays.toString(posiciones_buscar));
		}else{
			System.out.println("Hay "+buscar_encontrado+" notas con el valor "+buscar+" en las posiciones "+Arrays.toString(posiciones_buscar));
		}
	}
}

