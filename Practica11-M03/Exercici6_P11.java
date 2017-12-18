import java.io.*;
public class Exercici6_P11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String texto,letra,texto2="";
		
		String abcd[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9",".",",","?","'","!"};
			
		String morse[] = {"· —","— · · ·","— · — ·","— · ·","·","· · — ·","— — ·","· · · ·","· ·","· — — —","— · —","· — · ·","— —","— ·","— — · — —","— — —","· — — ·","— — · —","· — ·","· · ·","—","· · —","· · · —","· — —","— · · —","— · — —","— — · ·","— — — — —","· — — — —","· · — — —","· · · — —","· · · · —","· · · · ·","— · · · ·","— — · · ·","— — — · ·","— — — — ·","· — · — · —","— · — · — —","· · — — · ·","· — · · — ·","— — · · — —"};
		
		System.out.print("Que quieres traducir al morse? ");
		texto = reader.readLine();
		
		texto = texto.toLowerCase();
		
		//Conversor
		for(int i=0;i<texto.length();i++){
			letra = (""+texto.charAt(i));
			for(int a=0;a<abcd.length;a++){
				if(abcd[a].equals(letra)){
					texto2=texto2+morse[a]+"\t";
				}
			}
		}
		System.out.println(texto2);
	}
}

