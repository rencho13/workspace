import java.util.Scanner;

public class Fondue {

	public static void main(String[] args) {
		Scanner saisi = new Scanner(System.in);
		
		
		int base = 4;
		double fromage = 800.0;
		double eau = 2.0;
		double ail = 2.0;
		double pain = 400.0;
		
		System.out.println("Entrez le nombre de personne(s) conviées à la fondue :");
		int nbconvives = saisi.nextInt();
		
		System.out.println("Pour faire une fondue fribourgeoise pour " + nbconvives + " personnes, il vous faut : ");
		System.out.println(" - " + nbconvives * fromage/base +" gr de Vacherin fribourgeois");
		System.out.println(" - " + nbconvives*eau / base +" dl d'eau");
		System.out.println(" - " + nbconvives * ail / base + " gousse(s) d'ail");
		System.out.println(" - "	+ nbconvives * pain / base + " gr de pain ");
		System.out.println(" - du poivre à volonté");
			
		

	}

}
