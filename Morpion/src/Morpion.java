import java.util.Scanner;

public class Morpion {

	public static void main(String[] args) {
		
		Scanner saisi = new Scanner(System.in);
		
		char grid [] = { 
				'1','2','3',
				'4','5','6',
				'7','8','9'
		};
		char p1 = 'O';
		char p2 = 'X';
		Boolean partie= true;
		int ChoixCase;
		char joueur = p1;
		char tmp;
		
		while ( partie) {
		
			for (int i = 0 ; i < 3 ; i++)  {
	
				System.out.println("[" + grid[i*3] + '|' + grid[i*3+1] + '|' + grid[i*3+2] + ']'  );
		
			}
			System.out.println("Choississez une case Joueur : " + joueur  +" ");
			ChoixCase = saisi.nextInt();
			
			grid[ChoixCase-1] = joueur;
			
			for (int i= 0 ; i < 3 ; i++) {			
				if (grid[i*3]==grid[i*3+1] && grid[i*3+1]==grid[i*3+2]) { System.out.println("Le joueur " + joueur + " a gagn� ... BRAVO !!!");
				//partie = false;
				}
			}
			if (joueur == p1 ) joueur = p2; else joueur = p1;
			System.out.println();
			
		}
}
}


