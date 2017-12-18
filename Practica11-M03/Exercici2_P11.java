import java.io.*;
public class Exercici2_P11 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String nombre;
		
		System.out.print("Como te llamas? ");
		nombre= reader.readLine();
		
		System.out.print(nombre.toUpperCase()); //toUpperCase pasa todos los caracteres a mayusculas
	}
}
