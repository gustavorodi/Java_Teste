import java.util.ArrayList;
import java.util.Random;

public class Listas {
	
	public static void main( String[] args ) {
		
		ArrayList<String> lista = new ArrayList<String>(4);
		Random rand = new Random();
 		
		lista.add("FRASE 1");
		lista.add("FRASE 2");
		lista.add("FRASE 3");
		lista.add("FRASE 4");
		lista.add("FRASE 5");
		
		Integer k = rand.nextInt(5);
		String escolha;
		
		escolha = lista.get(k);
		System.out.println(escolha);
		
	}
}