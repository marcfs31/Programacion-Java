import java.io.*;
public class Validacion {
	
	public static void main (String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number;
		System.out.print("Cuantos alumnos vas introducir: ");;
		if(reader.hasNextInt()){ //Comprueba si es un entero valido
            number = reader.nextInt();
            valid = true;
        }
        else{
            System.out.print("Not a valid integer!\n");
            reader.next();
        }
	}
}

