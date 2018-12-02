
public class Tables {

	public static void main(String[] args) {
		
		System.out.println("TABLES DE MULTIPLICATION de 2 à 10");
		
		for (int i =2 ; i<=10; i++ ) {
			System.out.println("TABLE DE "+ i + "\n");
			for (int j= 1; j <=10; j++) {
				System.out.println(" " + i + " * " + j +" = " + i*j);
				
			}System.out.println();
		}
	}
}
