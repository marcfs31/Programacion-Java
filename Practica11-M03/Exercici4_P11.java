import java.io.*;
public class Exercici4_P11 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int cantidad=0;
		String nombre;
		
		System.out.print("Como te llamas? ");
		nombre= reader.readLine();
		
		nombre = nombre.toLowerCase(); //Convierto toda la string a minusculas ya que es sensible a mayusculas o minusculas
		
		for(int i=0;i<nombre.length();i++){
			if((""+nombre.charAt(i)).equals("a")){ //al poner (""+nombre.charAt(i)) te contatena un string vacio con un caracter y asi los puedes comparar con el equals
				cantidad++;
			}else if((""+nombre.charAt(i)).equals("e")){
				cantidad++;
			}else if((""+nombre.charAt(i)).equals("i")){
				cantidad++;
			}else if((""+nombre.charAt(i)).equals("o")){
				cantidad++;
			}else if((""+nombre.charAt(i)).equals("u")){
				cantidad++;
			}
		}
		System.out.print("El nombre tiene "+nombre.length()+" caracteres i "+cantidad+" vocales");
	}
}
