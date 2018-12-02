import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

class Moyenne {
	
	private static Scanner scanner = new Scanner(System.in);
	
		public static void main(String[] args) {
			// Demande le nombre d'�tudiants � l'utilisateur
			int nombreEtudiants;
			System.out.print("Donnez le nombre d'etudiants : ");
			nombreEtudiants = scanner.nextInt();
			double moyenne = 0.0;
			double somme =0.0;
			// Initialise un tableau pouvant contenir autant
			// de notes que d'�tudiants
			double [] notes = new double[nombreEtudiants];
			for (double elements : notes) {
				System.out.println("Note etudiant : ");
				double saisiNote =scanner.nextDouble();
				notes[(int)elements] = saisiNote;
				somme+= saisiNote;
			}
			OptionalDouble moyenneTest = Arrays.stream(notes).average();
			System.out.println(moyenneTest.toString());
			//System.out.println("La moyenne sur les " + nombreEtudiants + " etudiants est de " + somme/nombreEtudiants );
		}
}
