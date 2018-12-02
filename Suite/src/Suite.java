import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
                
        for (int test = debut ; test <= fin ; ++test)
        {	
        	int compteur = 0;
        	int i = test;
        	do {
        		if (i%3 == 0) {i+= 4;++compteur;
        		} else { 
        			if (i%3!=0 && i%4==0) { i/=2;++compteur;
        			} else {
        			if (i%3!=0 && i%4!=0) { --i;++compteur;}
        			}
        		}
        		} while (i > 0);
        	System.out.println(test + " -> " + compteur);
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}