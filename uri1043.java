package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		float a, b, c, r;
		a = s.nextFloat();
		b = s.nextFloat();
		c = s.nextFloat();
		if (a >= (b + c) || b >= (c + a) || c>= (a + b)) {
			r = (((a + b) * c)) / 2;
			System.out.println("Area = "+r);}else{
			r=a+b+c;
			System.out.println("Perimetro = "+r);}
		
	}

}
