import java.util.Scanner;

class Swap3 {
    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

 

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
    	int[][] tab1= { {1,2,5} , {2,6,7} };

    	int[][] tab2= { {1,3,2} , {2,4,6} , {1,3,5} };

    	int[][] tab = new int[tab1.length][tab2[0].length];

    	for (int i = 0 ; i < tab1.length; i++){

    		for (int j = 0 ; j < tab2[0].length; j++){

    			for (int k = 0; k < tab2.length; k++){

    				tab[i][j] += tab1[i][k] * tab2[k][j];

    			}
    		}
    	}
    	for (int i=0 ; i<tab.length ; ++i) { 
        	for ( int j= 0 ; i < tab[0].length ; ++j ) {
        		System.out.println(tab[i][j]);}
}
    }
}
    		
    		
 