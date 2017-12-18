import java.io.*;
public class Exercici5_P11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String nombre,nombre2="";
		
		int i=0;
		
		System.out.print("Como te llamas? ");
		nombre= reader.readLine();
		
		nombre = nombre.toLowerCase();
		
		nombre2=(""+nombre.charAt(i)).toUpperCase();
		
		for(i=1;i<nombre.length();i++){
			if((""+nombre.charAt(i-1)).equals(" ")){ //Si la letra anterior es un espacio
				nombre2=nombre2+(""+nombre.charAt(i)).toUpperCase(); //La letra de ahora se pasa a mayusculas
			}else{
				nombre2=nombre2+(""+nombre.charAt(i));
			}
		}
		System.out.println(nombre2);
	}
}

