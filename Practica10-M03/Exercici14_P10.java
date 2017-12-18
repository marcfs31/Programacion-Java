import java.io.*;
//Ordenar con busqueda dicotomica
public class Exercici14_P10 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//Iniciar y declarar variables
		float nota,buscar;
		String nota_str,buscar_str;
		
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

		//Inicial
		System.out.println("Inicial");
		for(int i=0;i<notas.length;i++){
			System.out.print(notas[i]+",");
		}

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
		
		//Busqueda dicotomica
		int i = 0; 
		int f = alumnos -1;
		int m = (i+f)/2;
		
		while((i <= f)){
			m = (f+i)/2;
			if(buscar > notas[m]){
				i = m+1;
			}else if(buscar < notas[m]){
				f = m-1;
			}else{
				break;
			}
		}
		
		if (i > f){
			System.out.println("La nota "+buscar+" no esta en el array.");
		}else{
			System.out.println("La nota "+buscar+" esta en la posición "+(m+1));
		}
	}
}
