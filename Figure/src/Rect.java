
public class Rect 
{

	private double hauteur=0;
	public double getHauteur()
	{
		return hauteur;
	}
	
	public void setHauteur(double h )
	{ 
		hauteur = h;
	}
	
	double surface(double largeur) {
		return largeur * hauteur;
	}
}
