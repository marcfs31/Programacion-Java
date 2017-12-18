import java.io.*;
public class Exercici1_P10_2 {
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
		
		//pedir numero para la matriz
		System.out.print("Pon un numero: ");
		num_str = reader.readLine();
		num = Integer.parseInt(num_str);
		
		//Introducir los valores a la matriz
		//matriz.length te saca las filas
		//matriz[0].length te saca las columnas
		for (int x=0; x < fila; x++) {
			for (int y=0; y < columna; y++) {
				matriz[x][y]=num;
			}
		}
		
		//Imprimir la matriz
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y]+" ");
			}
			System.out.println();
		}
	}
}
