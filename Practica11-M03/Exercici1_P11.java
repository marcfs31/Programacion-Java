import java.io.*;
public class Exercici1_P11 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int posicion;
		String texto;
		char caracter;
		
		System.out.print("Pon un string: ");
		texto= reader.readLine();
		System.out.print("Pon un caracter: "); 
		caracter = reader.readLine().charAt(0); 
		
		posicion = texto.indexOf(caracter); //Devuelve la posición del caracter
		
		if(posicion >= 0){ //Si la posicion devuelta es mayor a 0 es que lo ha encontrado
			System.out.println("El caracter "+caracter+" aparece en "+texto);
		}else{
			System.out.println("El caracter "+caracter+" no aparece en "+texto);
		}
	}
}
