public class Exercici4_P10 {
	public static void main (String[] args){
		int pares[];
		pares = new int[100];
		int par;
		
		for(int i=0;i<pares.length;i++){
			par = i*2;
			pares[i]=par;
			System.out.println(pares[i]+"||"+i);
		}
	}
}

