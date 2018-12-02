import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        if (debut < 0 || debut > 24 || fin < 0 || fin > 24 ) {
        System.out.println("Les heures doivent Ãªtre comprises entre 0 et 24 !");
        System.out.println("");
        System.exit(-1);}
        
        if (debut == fin) {
        	System.out.println("Bizarre, vous n'avez pas louÃ© votre vÃ©lo bien longtemps !");
        System.out.println("");
        System.exit(-1);
        }
        if (debut > fin) {
        System.out.println("Bizarre, le dÃ©but de la location est aprÃ¨s la fin ...");
        System.out.println("");
        System.exit(-1);
        }
        double duree_1 = 0,duree_2=0, cout_1 = 0,cout_2 =0;
        System.out.println("Vous avez loué votre vélo pendant");
        if ( 0 <= debut && debut < 7 ) { if ( 0<= fin && fin < 7 ) { duree_1 = fin - debut; }
        else if ( 7 <= fin && fin <= 17 ) { duree_1 = 7- debut; duree_2 = fin - 7;  } 
        else { duree_1 = 7 - debut + fin - 17;  duree_2 = 10; }}
        
        if ( 7 <= debut && debut < 17) { if( 7<= fin && fin <= 17 ) { duree_2 = fin -debut;}
        else { duree_2 = 17 - debut; duree_1= fin -17 ;} }
        
        if( 17 <= debut && debut <= 24) { duree_1 = fin - debut ;}
        
        
        if ( duree_1!=0 ) {System.out.println((int) duree_1 + " heure(s) au tarif horaire de 1.0 franc(s)");}
        if ( duree_2!=0 ) {System.out.println((int) duree_2 + " heure(s) au tarif horaire de 2.0 franc(s)"); }
        System.out.print("Le montant total à payer est de " + (duree_1 + duree_2*2) );
        System.out.println(" franc(s).");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}