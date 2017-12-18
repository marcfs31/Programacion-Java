import java.io.*;

public class Exercici12_P10 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Crear arrays
		
		int array1[];
		array1 = new int[10];
		
		int array2[];
		array2 = new int[10];
		
		int array3[];
		array3 = new int[10];
		
		//Pedir 2 numeros
		
		System.out.println("Pon un numero: ");
		String num1_str = reader.readLine();
		System.out.println("Pon otro numero: ");
		String num2_str = reader.readLine();
		
		int num1 = Integer.parseInt(num1_str);
		int num2 = Integer.parseInt(num2_str);
		
		//Poner numeros en los arrays 1 y 2
		
		for(int i=0;i<10;i++){
			array1[i] = num1; 
			array2[i] = num2;
			num1++; 
			num2++; 
		}
		
		//Sumar los arrays 1 y 2 en la 3
		for(int a=0;a<10;a++){
			array3[a] = array1[a] + array2[a];
		}
		
		//Imprimir el array 3
		
		for(int b=0;b<10;b++){
			System.out.print(array3[b]+",");
		}
	}
}	
		
		
