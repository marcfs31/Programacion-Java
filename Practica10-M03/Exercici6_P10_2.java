import java.io.*;
public class Exercici6_P10_2 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num,fila,columna;
		String num_str,fila_str,columna_str;
		
		//Pedir filas y columnas
		System.out.print("Pon el numero de filas: ");
		fila_str = reader.readLine();
		fila = Integer.parseInt(fila_str);
		
		System.out.print("Pon el numero de columnas: ");
		columna_str = reader.readLine();
		columna = Integer.parseInt(columna_str);
		int matriz[][]; //Crear la matriz
		matriz = new int[fila][columna]; //Poner las filas y las columnas de la matriz si pones 5 y 6 sera de 5x6.7
		int matriz2[][];
		matriz2 = new int[fila][columna];
		
		//Introducir los valores a la matriz
		//matriz.length te saca las filas
		//matriz[0].length te saca las columnas
		
		/*
		for (int x=0; x < fila; x++) {
			for (int y=0; y < columna; y++) {
				if(x % 2 != 0){
					matriz[x][y] = 1;
				}
				if(y % 2 != 0){
					if(y == 1){
						matriz[x][y]++;
					}else{
						matriz[x][y] = 1;
					}
				}
			}
		}
		*/
		
		
		for (int x=0; x < fila; x++) {
			for (int y=0; y < columna; y++) {
				if(x % 2 != 0){
					matriz[x][y] = 1;
					//matriz2[x][y] = 1;
				}
				if(y % 2 != 0){
					matriz[x][y] = 1;
					//matriz2[x][y] = 1;
				}
				//Para hacerlo con 2 arrays quitar este ultimo if
				if((x % 2 != 0) && (y % 2 != 0)){ //Si el resto de x no es 0 y el resto de y no es 0 la x y sera 2
					matriz[x][y] = 2;
				}
			}
		}
		
		/*
		//Para hacerlo con 2 arrays
		for (int x=0; x < fila; x++) {
			for (int y=0; y < columna; y++) {
				if((x % 2 != 0) && (y % 2 != 0)){ //Si el resto de x no es 0 y el resto de y no es 0 la x y sera 2
					matriz2[x][y] = 2;
				}
			}
		}
		*/ 
		//Imprimir la matriz
		for (int x=0; x < matriz2.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y]+"\t"); // \t tabulador 
				//System.out.print(matriz2[x][y]+"\t"); // \t tabulador 
			}
			System.out.println();
		}
	}
}
