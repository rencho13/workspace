import java.util.Scanner;

public class Degre3 {

	public static void main(String[] args) {
	
		int a=0,b=0,c=0;
		
		double x= 0,resultat=0;
		
		Scanner saisi = new Scanner(System.in);
		
		System.out.println("Entrez a (int) : ");
		a= saisi.nextInt();
		System.out.println("Entrez b (int) : ");
		b = saisi.nextInt();
		System.out.println("Entrez c (int) : ");
		c = saisi.nextInt();
		System.out.println("Entrez x (double) : ");
		x=saisi.nextDouble();
		double d = a + b;
		int e = (a*a+2*a*b+b*b);
		resultat = ((d)/2)*x*x*x + (d*d)*x*x+d+c;
		System.out.println("La valeur du polyn�me est : " + resultat);
		
		
		
	
	}
}
