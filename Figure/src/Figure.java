
public class Figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Rect.hauteur);
		
		Rect rectangle = new Rect();
		double zzz= rectangle.getHauteur();
		
		Rect rectangle2 = new Rect();
		rectangle2.setHauteur(126);
		
		System.out.println(rectangle.getHauteur());
		System.out.println(rectangle2.getHauteur());
		double z = rectangle.surface(12);
		System.out.println(z);
		
		
	}

}

