import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        double hauteur = h0, vitesse = 0;
        final double g = 9.81;
        double accel = g, t0 = 0 , v0 = 0, t = t0;
        boolean vSon = true, accelMax = true, ouvertureParachute = true;
        double surface = 2;
        System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
        		t, hauteur, vitesse, accel);
        t++;
                               
        while (hauteur > 0.0){
        	double s = surface / masse;
        	double q = Math.exp(-s*(t-t0));
        	vitesse = ((g/s)*(1-q) + v0*q);
        	hauteur = (h0 - ( g/s)*(t-t0))-((v0-(g/s))/s)*(1-q);
        	accel = g-s * vitesse;
        	 if (accel <0.50 && accelMax){
             	System.out.printf("## Felix a atteint sa vitesse maximale\n");
             	accelMax = false;
             	}
        	if (vitesse > 343.0 && vSon){        	
            	System.out.printf("## Felix depasse la vitesse du son\n");
            	vSon = false;
            	}
        	if (hauteur < 2500 && ouvertureParachute){	
            	System.out.printf("## Felix ouvre son parachute\n");
            	ouvertureParachute = false;
            	h0 = hauteur;
            	t0=t;
            	v0 = vitesse;
            	surface = 25.0;
            	}
        	if (hauteur > 0){
            	System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
            		t, hauteur, vitesse, accel);
            	}
        	t++;
        	};
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}