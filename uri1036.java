package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double a, b, c, d, r1, r2;
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		d = (b * b) - 4 * (a * c);
		s.close();
		if(a==0 ||b==0||c==0||d<=0) {
			System.out.println("Impossivel calcular");
		}
		else {
			r1 = (-b + (Math.sqrt(d))) / (2 * a);
			r2 = (-b - (Math.sqrt(d))) / (2 * a);
			System.out.printf("R1 = %.5f\n" , r1);
			System.out.printf("R2 = %.5f\n" , r2);
		} 
		
	}
}
