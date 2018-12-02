import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for ( int j=0 ; j < s.length(); ++j) {
        	if ( s.charAt(j)== ' ') {
    			aCoder += ' '; }
        	else { 
        		for ( int i = 0 ; i < ALPHABET.length() ; ++i ) {
        	if ( s.charAt(j)==ALPHABET.charAt(i)) {
        			aCoder += ALPHABET.charAt(i);
        		}
        		}
            } 
        } if (!aCoder.isEmpty()) {
        for ( int j=0 ; j < aCoder.length(); ++j) {
        	if ( aCoder.charAt(j)== ' ') {
    			chaineCodee += ' '; }
        	else { 
        		for ( int i = 0 ; i < ALPHABET.length() ; ++i ) {
        			if ( aCoder.charAt(j)==ALPHABET.charAt(i)) {
        				if (i+DECALAGE > 26) {
        					chaineCodee += ALPHABET.charAt(i+DECALAGE-26);
        			} else { chaineCodee += ALPHABET.charAt(i+ DECALAGE); 
        					}
        				}
        			} 
        		}
        	} 
        }
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}