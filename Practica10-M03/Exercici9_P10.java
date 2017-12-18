import java.io.*;
public class Exercici9_P10 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Iniciar y declarar variables
		float nota,media,min,max,nota_corregir;
		String nota_str,corregir_str,nota_corregir_str;
		media=0;
		int contador=0;
		int corregir=0;
		
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
		//Eliminar nota
		System.out.print("En que posición quieres eliminar la nota? ");
		corregir_str = reader.readLine();
		corregir = Integer.parseInt(corregir_str);
		while(corregir > notas.length+1 || corregir < 0){
			System.out.println("ERROR: Posición no existente");
			System.out.print("En que posición quieres eliminar la nota? ");
			corregir_str = reader.readLine();
			corregir = Integer.parseInt(corregir_str);
		}
		corregir = corregir-1;
		
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
		for(int c=0;c<notas.length;c++){
			System.out.print(notas[c]+", ");
		}
		System.out.println();
		System.out.println("La media es de: "+media/notas.length);
		System.out.println("La mayor nota es: "+max);
		System.out.println("La menor nota es: "+min);
		
		//Correción eliminar nota
		float notas2[];
		notas2 = new float[alumnos-1];

		for(int x=0;x<notas2.length; x++){
			if(x != corregir){
				notas2[x] = notas[x];
			}else{
				while(x<notas2.length){
					notas2[x] = notas[x+1];
					x++;
				}
			}
		}
		
		media=0;
		for(int d=0;d<=notas2.length-1;d++){
			media = media + notas2[d];
		}
		
		min=notas2[0];
		max=notas2[0];

		for(int e=0;e<notas2.length;e++){
			if(notas2[e]>max){
				max=notas2[e];
			}
			if(notas2[e]<min){
				min=notas2[e];
			}
		}
		
		for(int f=0;f<notas2.length;f++){
			System.out.print(notas2[f]+", ");
		}
		System.out.println();
		
		System.out.println("La media es de: "+media/notas2.length);
		System.out.println("La mayor nota es: "+max);
		System.out.println("La menor nota es: "+min);
	}
}

