import java.util.Scanner;

public class Puissance4 {
	
	private final static int VIDE = 0 ;
	private final static int JAUNE = 1 ;
	private final static int ROUGE = 2;
	
	static Scanner question = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gagne;
		int[][] grille = new int [6][7];
		int couleurJoueur = JAUNE;
		initialise(grille);
		affiche(grille);
			
		do { 
			demandeEtJoue(grille,couleurJoueur);
			affiche(grille);
			gagne = estCeGagne(grille, couleurJoueur);
			couleurJoueur = permutte(couleurJoueur);
			
		} while (!gagne);
		if (couleurJoueur == JAUNE) System.out.println("Le joueur O a gagné"); else System.out.println("Le joueur X a gagné");
	}
	// initialisation de la grille , en mettant 0 dans chaque case, donc des cases vides
	static void initialise (int[][] grille) {
		
		for ( int i = 0; i < grille.length ; ++i) {
			for ( int j = 0 ; j < grille[0].length ; ++j){
				grille[i][j] = VIDE;
			}
		}
	}
	//affiche O pour une case rouge , X pour une case jaune et un espace pour une case vide
	static void affiche (int[][] grille){
		System.out.println();
		for ( int[] ligne : grille) {
			System.out.print('|');
			for ( int cellule : ligne) {
				if ( cellule == VIDE) {
					System.out.print(' '); }
				else if ( cellule == ROUGE) {
					System.out.print('O'); }
				else  {
					System.out.print('X'); }
				System.out.print('|');
				}
			
			System.out.println();
			}
		
		//System.out.println('=');
		for ( int i = 1 ; i <=grille[0].length; ++i)
		{
			System.out.print("="+i);
		}	System.out.println("=\n");
		}
	
	static boolean  joue(int[][] grille, int colonne, int couleur)

	{	// on parcourt la colonne en partant du bas jusqu'a trouver une case vide ou jusqu'en haut
		int ligne = grille.length-1;
		// si le numero de colonne n'est pas valide
		if ( colonne >=grille[0].length || colonne < 0) return false;
		while( (ligne >=0) && grille[ligne][colonne]!= VIDE) {
			--ligne;
		}
		// si on n'eat pas arrivé jusqu'en haut de la colonne, on remplit la case vide trouvée
		// sinon c'est que la colonne est pleine et le coup n'est pas valide.
		if (ligne >=0) {
		grille[ligne][colonne]= couleur; 
		return true ;
		} else {
		return false;
		}
		
	}
	
	static int permutte(int couleurJoueur) {
		if (couleurJoueur == JAUNE) {return ROUGE; }
		else { return JAUNE; }
	}
	
	static void demandeEtJoue(int[][] grille, int couleurJoueur)
	{	
		
		boolean valide;
		do {
			System.out.print(" Joueur ");
			if (couleurJoueur == JAUNE ){
				System.out.print("X"); 
			} else {
				System.out.print("O");
			}
			System.out.print(" entrez un numero de colonne ");
			int colonne = question.nextInt();
			--colonne;
			valide = joue(grille, colonne, couleurJoueur);
			if ( !valide ) { System.out.println(" >Ce coup n'est pas valide !!<");
			}
		} while (!valide);
	}
	
	static boolean estCeGagne(int[][] grille , int couleurJoueur )
	  {
	    // on parcourt la grille

	    for(int ligne = 0; ligne < grille.length; ++ligne) {
	      for(int colonne = 0; colonne < grille[ligne].length; ++colonne) {
	        int couleurCase = grille[ligne][colonne];

	        // pour chaque case qui contient un pion de la bonne couleur,
	        // on compte les pions de la meme couleur dans 4 directions:
	        if (couleurCase == couleurJoueur) {
	          if (
	            // en diagonale, vers le haut et la droite:
	            (ligne >= 3 && compte(grille, ligne, colonne, -1, +1) >= 4) ||

	            // horizontalement, vers la droite:
	            (colonne <= grille[ligne].length - 4 && compte(grille, ligne, colonne, 0, +1) >= 4) ||

	            // en diagonale, vers le bas et la droite:
	            (ligne <= grille.length - 4 && colonne <= grille[ligne].length - 4 &&
	             compte(grille, ligne, colonne, +1, +1) >= 4) ||

	            // verticalement, vers le bas:
	            (ligne <= grille.length - 4 && compte(grille, ligne, colonne, +1, 0) >= 4)
	            ) {

	            // si le nombre de pions pour au moins une des directions est au moins 4, le joueur a gagne:
	            return true;
	          }
	        }
	      }
	    }

	    // si on a parcouru toute la grille sans trouver au moins 4 pions
	    // alignes, le joueur n'a pas gagne, du moins pas encore:
	    return false;
	  }
	
	static int compte(int[][] grille,
		      int ligneDepart, int colonneDepart,
		      int dirLigne, int dirColonne)
  {
     int compteur = 0;
	
	int ligne = ligneDepart;
	int colonne = colonneDepart;
	
	// on part de la case (ligneDepart, colonneDepart) et on parcourt la grille
	// dans la direction donnee par (dirLigne, dirColonne)
	// tant qu'on trouve des pions de la meme couleur que le pion de depart.
	// On sait qu'on ne peut pas sortir de la grille.
	while(ligne < grille.length && colonne < grille[0].length && grille[ligne][colonne] == grille[ligneDepart][colonneDepart]) {
	    
    ++compteur;
    ligne   = ligne   + dirLigne;
    colonne = colonne + dirColonne;

  }

  return compteur;
}
	}
	

