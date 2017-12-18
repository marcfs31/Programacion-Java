import java.io.*;
public class Exercici13_P10 {
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

		//Inicial
		System.out.println("Inicial");
		for(int i=0;i<notas.length;i++){
			System.out.print(notas[i]+",");
		}

		System.out.println();

		//Ordenar menor a mayor
		int i;
		String entrar="s";
		float temp;
		
		//Bubble sort
		while (entrar.equals("s")){
            entrar= "n";
            for(i=0;i<notas.length-1;i++){
				if(notas[i]>notas[i+1]){
					temp = notas[i];
					notas[i] = notas[i+1];
					notas[i+1] = temp;
					entrar="s";
				}
			}
		}
		
		System.out.println("Correción");
		for(int z=0;z<notas.length;z++){
			System.out.print(notas[z]+",");
		}
		
		System.out.println();
	}
}
