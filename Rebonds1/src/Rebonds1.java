import java.util.Scanner;


public class Rebonds1 {
	static Scanner saisi = new Scanner(System.in);
	public static void main(String[] args) {
		boolean refaire = true;
		while (refaire) {
			
		
		
		final double G = 9.81;
		double eps = 0.0;
		double h0 = 0,h1=0.0;
		double vSol = 0.0;
		double vRebond = 0.0;
		System.out.println("1 - tester la hauteur au bout de n rebond  ");
		System.out.println("2 - combien de rebonds fait cette balle avant que la hauteur");
		int choix = saisi.nextInt();
		
	switch (choix) {
	case 1:
		System.out.println("H0");
		h0 = saisi.nextInt();
		System.out.println("eps");
		eps = saisi.nextDouble();
		System.out.println("NBR");
		int nbr = saisi.nextInt();
		
		for ( int i = 1 ; i <= nbr ; i++) { 
			vSol = Math.sqrt(2*h0*G);
			vRebond = eps * vSol;
			h1 = (vRebond*vRebond)/(2*G);
			h0 = h1;
		}
		System.out.printf("HAUTEUR apr�s "+ nbr + " Rebonds est de :%.2f ", h0 );
		System.out.println();
		
	
		break;
		case 2:
			System.out.println("H0");
			h0 = saisi();
			int hauteur = (int) h0;
			System.out.println("eps");
			eps = saisiDouble();
			System.out.println("H_fin");
			int h_fin = saisi();
			nbr=0;
			do {
				vSol = Math.sqrt(2*h0*G);
				vRebond = eps * vSol;
				h1 = (vRebond*vRebond)/(2*G);
				h0 = h1;
				nbr++;
			} while (h1 > h_fin);
			System.out.println("Nombre de rebonds est de " + nbr + " pour aller de " + hauteur + " � la hauteur de fin " + h_fin);
		
	
		
			}
		System.out.println("Voulez vous faire une autre test ? oui ou non");
		String reponse = saisi.nextLine();
		reponse = reponse.intern();
		reponse = reponse.toLowerCase();
		
		if (reponse != "non") {refaire = true;} else {refaire = false;}
		}
		
		
		
	}
	private static int saisi() {
		return saisi.nextInt();
		
	}
	private static double saisiDouble() {
		return saisi.nextDouble();
		
	}
}