import java.util.Scanner;

public class Sexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner reponse = new Scanner(System.in);
		System.out.println("quel est votre nom ?");
		String nom = reponse.nextLine();
		System.out.println("�tes-vous de sexe f�minin ?");
		String lettre = reponse.nextLine();
		lettre = lettre.toUpperCase();
		String sexe ="monsieur ";
		if ( lettre.equals("O")) sexe = "madame ";
		System.out.println("bonjour " + sexe + nom); 
		
		
	}

}
