import java.util.*;

public class NombreMystere {
	
	private static Scanner saisi = new Scanner(System.in);
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int mystere = rand.nextInt(100)+1;
		int nombreSaisi,compteur=0;
		
		System.out.println("Trouvez le nombre mystere : ");
		do {
			System.out.println("Saisissez un nombre entre 1 et 100 ");
			nombreSaisi = saisi.nextInt();
			if (nombreSaisi < 1 || nombreSaisi > 100) { System.out.println("Mauvaise saisi du nombre !!!");++compteur ;}
			if (nombreSaisi < mystere) { System.out.println("Le nombre mystere est plus grand !!");++compteur ;}
			if (nombreSaisi > mystere) { System.out.println("Le nombre mystere est plus petit !!");++compteur; }
			if (nombreSaisi == mystere) { System.out.println("BRAVO vous avez trouvé en : " + (++compteur) + " coup(s) " ); }
			
		} while (nombreSaisi != mystere);
		
	}

}
