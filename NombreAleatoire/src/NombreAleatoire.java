
import java.util.Random;

public class NombreAleatoire {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int i = rand.nextInt(6)+1; 
		System.out.println(i);
	}

}
