import java.util.Scanner;

public class Age {
	
	private static Scanner saisi;
	
	public static void main(String[] args) {

		int m = 0;
		int n = 2;
		int p = 5;
		boolean test = true;

		do {
			if (p % 2 == 0) {
				System.out.print(p + " " + m + " ");
				p = p - 2;
			}
			else {
				System.out.print(m + " " + (m + n) + " ");
				++p;
			}
			test = ! test;
			++m;
		} while (test || (m < n) );
	}}